package com.miu.waa.lab1.lab1.repo;

import com.miu.waa.lab1.lab1.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepo extends JpaRepository<Post, Long> {


}
