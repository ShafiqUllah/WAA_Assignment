package com.miu.waa.lab1.lab1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post {

    long id;
    String title;
    String content;
    String author;
}
