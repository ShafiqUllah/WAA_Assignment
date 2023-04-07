package com.miu.waa.lab1.lab1.service;

import com.miu.waa.lab1.lab1.entity.Post;
import com.miu.waa.lab1.lab1.entity.User;
import com.miu.waa.lab1.lab1.entity.dto.UserDto;

import java.util.List;

public interface UserService {

    List<UserDto> getAllUsers();

    UserDto getById(Long id);

    void save(User user);

    List<Post> getAllPostsByUserId(Long id);

    List<User> getUsersWithMoreThanOnePost();
}
