package com.sparta.schedulemanagement_jpa.domain.user.controller.dto;

import com.sparta.schedulemanagement_jpa.domain.user.entity.UserRole;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

@Getter
public class SignupRequestDto {
	private String username;

	private String email;

	private String password;

	private String role;
}