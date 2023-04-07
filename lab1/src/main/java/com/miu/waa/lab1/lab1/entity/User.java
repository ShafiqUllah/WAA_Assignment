package com.miu.waa.lab1.lab1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue
    long id;
    String name;

    @OneToMany
    @JoinColumn(name = "user-id")
    List<Post> posts;
}
