package com.example.level1.service;

import com.example.level1.dto.PostRequestDto;
import com.example.level1.dto.PostResponseDto;
import com.example.level1.entity.Post;
import com.example.level1.repository.BlogRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BlogService {
    private final BlogRepository blogRepository;

    public BlogService(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    public PostResponseDto createPost(PostRequestDto requestDto) {
        Post post = new Post(requestDto);

        Post savedPost = blogRepository.save(post);

        return new PostResponseDto(post);
    }

    public List<PostResponseDto> getPosts() {
        return blogRepository.findAll().stream().map(PostResponseDto::new).toList();
    }

    public PostResponseDto getPostById(Long id) {
        return new PostResponseDto(findPost(id));
    }

    @Transactional
    public Long updatePost(Long id, PostRequestDto requestDto) {
        Post post = findPost(id);
        post.update(requestDto);
        return id;
    }

    private Post findPost(Long id) {
        return blogRepository.findById(id).orElseThrow(() ->
                new IllegalArgumentException("선택한 post는 존재하지 않습니다."));
    }

    public Long deletePost(Long id) {
        Post post = findPost(id);
        blogRepository.delete(post);
        return id;
    }
}
