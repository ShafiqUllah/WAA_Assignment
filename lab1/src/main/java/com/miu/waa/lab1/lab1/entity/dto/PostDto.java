package com.miu.waa.lab1.lab1.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostDto {

//    long id;
    String title;
    String content;
    String author;
}
