package com.example.level1.repository;

import com.example.level1.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BlogRepository extends JpaRepository<Post, Long> {
}
