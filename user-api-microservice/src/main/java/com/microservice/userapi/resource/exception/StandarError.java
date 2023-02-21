package com.microservice.userapi.resource.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class StandarError {

    private LocalDateTime timestamp;
    private String error;
    private Integer status;
    private String path;
}
