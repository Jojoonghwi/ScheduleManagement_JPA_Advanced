package com.sparta.schedulemanagement_jpa.exception.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ResponseExceptionCode {
    private String code;

    private String message;
}