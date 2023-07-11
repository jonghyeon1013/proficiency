package com.sparta.post.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
public class SignupResponseDto {
    private String message;
    private String statusCode;

    public SignupResponseDto(String message, String statusCode) {
        this.message = message;
        this.statusCode = statusCode;
    }
}