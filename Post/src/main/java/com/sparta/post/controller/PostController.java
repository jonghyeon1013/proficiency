package com.sparta.post.controller;

import com.sparta.post.dto.PostRequestDto;
import com.sparta.post.dto.PostResponseDto;
import com.sparta.post.dto.SignupResponseDto;
import com.sparta.post.jwt.JwtUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.sparta.post.service.PostService;
import com.sparta.post.entity.Post;

import java.util.List;
import javax.swing.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class PostController {

    private final PostService postService;


    public PostController(PostService postService) {
        this.postService = postService;
    }


    @GetMapping("/posts")
    public List<PostResponseDto> getPosts() {
        return postService.getPosts();
    }

    @GetMapping("/posts/{id}")
    public PostResponseDto getPost(@PathVariable Long id) {
        return postService.getPost(id);
    }


    // @CookieValue 가 아니라 헤더로 받아올 것
    @PostMapping("/posts")
    public PostResponseDto createPost(@RequestHeader(JwtUtil.AUTHORIZATION_HEADER) String tokenValue, @RequestBody PostRequestDto requestDto) {
        return postService.createPost(tokenValue, requestDto);
    }

    @PutMapping("/posts/{id}")
    public PostResponseDto updatePost(@RequestHeader(JwtUtil.AUTHORIZATION_HEADER) String tokenValue, @PathVariable Long id, @RequestBody PostRequestDto requestDto) {
        return postService.updatePost(tokenValue, id, requestDto);
    }

    @DeleteMapping("/posts/{id}")
    public ResponseEntity<SignupResponseDto> deletePost(@RequestHeader(JwtUtil.AUTHORIZATION_HEADER) String tokenValue, @PathVariable Long id) {
        return postService.deletePost(tokenValue, id);
    }
}