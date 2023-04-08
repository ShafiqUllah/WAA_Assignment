package com.miu.waa.lab1.lab1.repo;

import com.miu.waa.lab1.lab1.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepo extends JpaRepository<Comment, Long> {
}