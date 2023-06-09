package com.miu.waa.lab1.lab1.service.impl;

import com.miu.waa.lab1.lab1.entity.Comment;
import com.miu.waa.lab1.lab1.entity.Post;
import com.miu.waa.lab1.lab1.entity.dto.CommentDto;
import com.miu.waa.lab1.lab1.entity.dto.PostDto;
import com.miu.waa.lab1.lab1.helper.ListMapper;
import com.miu.waa.lab1.lab1.repo.PostRepo;
import com.miu.waa.lab1.lab1.service.PostService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepo postRepo;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<PostDto> getAllPosts() {
        return postRepo
                .findAll()
                .stream()
                .map(p -> modelMapper.map(p, PostDto.class))
                .collect(Collectors.toList());

    }

    @Override
    public PostDto getPostById(long id) {
        return modelMapper.map(postRepo.findById(id), PostDto.class);
    }

    @Override
    public void save(PostDto postDto) {
        Post post = modelMapper.map(postDto, Post.class);
        postRepo.save(post);
    }

    @Override
    public void deleteById(long id) {
        postRepo.deleteById(id);
    }

    @Override
    public void addComment(long postId, CommentDto commentDto) {
        Post post = postRepo.findById(postId);
        if(post != null){
            List<Comment> comments = post.getComments();
            comments.add(modelMapper.map(commentDto, Comment.class));
            postRepo.save(post);
        }

    }

    @Override
    public List<CommentDto> getComments(long id) {
        List<Comment> comments = postRepo.findComments(id);
        return comments.stream()
                .map(c -> modelMapper.map(c, CommentDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public List<PostDto> findByTitleMatch(String title) {
        List<Post> posts = postRepo.findByTitleLike(title);
        return posts.stream().map(p -> modelMapper.map(p, PostDto.class)).collect(Collectors.toList());
    }
}
