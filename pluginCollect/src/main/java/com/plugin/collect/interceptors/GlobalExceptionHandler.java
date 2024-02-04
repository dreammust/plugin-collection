package com.plugin.collect.interceptors;

import com.plugin.collect.response.CustomResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler(value = {RuntimeException.class})
    public CustomResponseEntity handleAnyException(Exception ex) {
        return CustomResponseEntity.fail(ex.getMessage());
    }

}
