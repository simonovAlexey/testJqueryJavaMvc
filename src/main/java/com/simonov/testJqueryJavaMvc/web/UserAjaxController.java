package com.simonov.testJqueryJavaMvc.web;

import com.simonov.testJqueryJavaMvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserAjaxController {

    @Autowired
    private UserService service;


}
