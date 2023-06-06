package com.codeup.codeupspringblog.models;

import jakarta.persistence.*;

@Entity
@Table(name="post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(nullable = false,columnDefinition = "VARCHAR(100)")
    private String title;
    @Column(nullable = false,columnDefinition = "TEXT")
    private String body;


    public Post(String secondPost, String thisIsMySecondPost) {
    }
}
