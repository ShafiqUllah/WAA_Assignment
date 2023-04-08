package com.miu.waa.lab1.lab1.service;

import com.miu.waa.lab1.lab1.entity.dto.CommentDto;
import com.miu.waa.lab1.lab1.entity.dto.PostDto;

import java.util.List;

public interface PostService {


    List<PostDto> getAllPosts();

    PostDto getPostById(long id);

    void save(PostDto postDto);

    void deleteById(long id);

    void addComment(long postId, CommentDto commentDto);

    List<CommentDto> getComments(long id);

    List<PostDto> findByTitleMatch(String title);

}
