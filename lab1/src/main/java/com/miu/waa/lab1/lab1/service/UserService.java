package com.miu.waa.lab1.lab1.service;

import com.miu.waa.lab1.lab1.entity.Post;
import com.miu.waa.lab1.lab1.entity.User;
import com.miu.waa.lab1.lab1.entity.dto.PostDto;
import com.miu.waa.lab1.lab1.entity.dto.UserDto;

import java.util.List;

public interface UserService {

    List<UserDto> getUsers();

    UserDto getUserById(long id);

    void save(UserDto userDto);

    void deleteById(long userId);

    List<UserDto> getUsersWithMoreThanNum(int num);

    List<PostDto> getAllPostByUserId(long userId);
}
