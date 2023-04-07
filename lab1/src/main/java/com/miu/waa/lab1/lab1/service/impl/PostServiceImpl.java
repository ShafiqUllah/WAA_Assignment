package com.miu.waa.lab1.lab1.service.impl;

import com.miu.waa.lab1.lab1.entity.Post;
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
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepo postRepo;

    @Autowired
    ModelMapper modelMapper;


    @Override
    public List<PostDto> findAll() {
        return postRepo.findAll().stream().map(p->modelMapper.map(p,PostDto.class)).collect(Collectors.toList());
    }

    @Override
    public PostDto getById(long id) {
        return modelMapper.map(postRepo.getById(id), PostDto.class);
    }

    @Override
    public void save(PostDto p) {
        postRepo.save(modelMapper.map(p, Post.class));
    }

    @Override
    public void delete(long id) {
        postRepo.deleteById(id);
    }

    @Override
    public void update(long id, PostDto p) {
//        postRepo.update(id, modelMapper.map(p, Post.class));

    }
}
