package com.miu.waa.lab1.lab1.controller;


import com.miu.waa.lab1.lab1.entity.Post;
import com.miu.waa.lab1.lab1.entity.dto.CommentDto;
import com.miu.waa.lab1.lab1.entity.dto.PostDto;
import com.miu.waa.lab1.lab1.service.PostService;
import com.miu.waa.lab1.lab1.service.impl.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts/")
public class PostController {
    @Autowired
    private PostService postService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public List<PostDto> getAllPosts(){
        return postService.getAllPosts();
    }
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("{id}")
    public PostDto getPostById(@PathVariable("id") long id){
        return postService.getPostById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void save(@RequestBody PostDto postDto){
        postService.save(postDto);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable("id") long id){
        postService.deleteById(id);
    }

    @GetMapping("{postId}/comments")
    public List<CommentDto> getComments(@PathVariable("postId") long id){
        return postService.getComments(id);
    }

    @PostMapping("{postId}/comments")
    public void addComment(@PathVariable("postId") long postId, @RequestBody CommentDto commentDto){
        postService.addComment(postId, commentDto);
    }

    @GetMapping("title/{title}")
    public List<PostDto> getAllPostsWithTitleMatch(@PathVariable("title") String title){
        return postService.findByTitleMatch(title);
    }

}