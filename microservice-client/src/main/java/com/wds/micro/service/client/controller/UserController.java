package com.wds.micro.service.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangdongsong on 2016/4/2.
 */
@RestController
@RequestMapping(value="/user")
public class UserController {

    @Value("${client}")
    private String userName;

    @RequestMapping(value="getUserName", method = {RequestMethod.GET, RequestMethod.POST})
    public String getUserName() {
        return userName;
    }
}
