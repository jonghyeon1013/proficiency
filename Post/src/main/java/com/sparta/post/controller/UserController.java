package com.sparta.post.controller;

import com.sparta.post.dto.LoginRequestDto;
import com.sparta.post.dto.SignupRequestDto;
import com.sparta.post.dto.SignupResponseDto;
import com.sparta.post.service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

    private final UserService userService;

    public  UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user/signup")
    public ResponseEntity<SignupResponseDto> signUp(@RequestBody @Valid  SignupRequestDto requestDto){
        return userService.signup(requestDto);
    }

    @ResponseBody
    @PostMapping("/user/login")
    public ResponseEntity<SignupResponseDto> login(@RequestBody LoginRequestDto requestDto) {
        return userService.login(requestDto);
    }
}