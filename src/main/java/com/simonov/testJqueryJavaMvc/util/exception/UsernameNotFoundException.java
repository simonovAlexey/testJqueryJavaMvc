package com.simonov.testJqueryJavaMvc.util.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.UNPROCESSABLE_ENTITY, reason = "Not found user")  // 422
public class UsernameNotFoundException extends RuntimeException {
    public UsernameNotFoundException(String s) {
        super(s);
    }
}
