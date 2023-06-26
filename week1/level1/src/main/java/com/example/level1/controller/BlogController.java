package com.example.level1.controller;

import com.example.level1.dto.PostRequestDto;
import com.example.level1.dto.PostResponseDto;
import com.example.level1.entity.Post;
import com.example.level1.service.BlogService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BlogController {
    private final BlogService blogService;

    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @PostMapping("/post")
    public PostResponseDto createPost(@RequestBody PostRequestDto requestDto) {
        return blogService.createPost(requestDto);
    }

    @GetMapping("/posts")
    public List<PostResponseDto> getPosts() {
        return blogService.getPosts();
    }

    @GetMapping("/post/{id}")
    public PostResponseDto getPostById(@PathVariable Long id) {
        return blogService.getPostById(id);
    }

    @PutMapping("/post/{id}")
    public Long updatePost(@PathVariable Long id, @RequestBody PostRequestDto requestDto) {
        return blogService.updatePost(id, requestDto);
    }

    @DeleteMapping("/post/{id}")
    public Long deletePost(@PathVariable Long id) {
        return blogService.deletePost(id);
    }



}
