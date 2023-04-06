package com.miu.waa.lab1.lab1.repo.impl;

import com.miu.waa.lab1.lab1.entity.Post;
import com.miu.waa.lab1.lab1.repo.PostRepo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class PostRepoImpl implements PostRepo {
    
    private static List<Post> posts;

    private static int postId = 300;
    static {
        posts = new ArrayList<>();


        Post p1 = new Post(111,"iPhone13","Content 1","Shafiq");
        Post p2 = new Post(112,"iPhone14","Content 2","Troye");
        posts.add(p1);
        posts.add(p2);
    }
    
    @Override
    public List<Post> findAll() {
        
        return posts;
    }

    @Override
    public Post getById(int id) {
        return posts.stream().filter(p->p.getId() == id).findFirst().orElse(null);
    }

    @Override
    public void save(Post p) {
        p.setId(postId);
        postId++;
        posts.add(p);
    }

    @Override
    public void delete(int id) {
        var post = posts.stream().filter(p-> p.getId() == id).findFirst().get();
        posts.remove(post);
    }

    @Override
    public void update(int id, Post p) {
        Post toUpdate = getById(id);
        toUpdate.setAuthor(p.getAuthor());
        toUpdate.setContent(p.getContent());
        toUpdate.setTitle(p.getTitle());
    }
}
