package com.miu.waa.lab1.lab1.repo;

import com.miu.waa.lab1.lab1.entity.Post;

import java.util.List;

public interface PostRepo {


    public List<Post> findAll();

    public Post getById(int id);

    public void save(Post p);

    public void delete(int id);

    public void update(int id, Post p);

//
//    public Review getReviewByPostId(int pId, int reviewId);
//
//    List<Post>findAllPriceGreaterThan(int price);

}
