package com.miu.waa.lab1.lab1.service;

import com.miu.waa.lab1.lab1.entity.dto.PostDto;

import java.util.List;

public interface PostService {


    public List<PostDto> findAll();

    PostDto getById(long id);

//    ProductDetailDto getReviewsByProductId(int id);

    void save(PostDto p);

    void delete(long id);

    void update(long id, PostDto p);

//    Review getReviewByProductId(int pId, int reviewId);

//    List<PostDto>findAllPriceGreaterThan(int price);

}
