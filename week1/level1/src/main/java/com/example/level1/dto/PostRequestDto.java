package com.example.level1.dto;

import jakarta.persistence.Column;
import lombok.Getter;

@Getter
public class PostRequestDto {
    private String title;
    private String content;
    private String author;
    private String password;
}
