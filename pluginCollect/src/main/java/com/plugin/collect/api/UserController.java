package com.plugin.collect.api;


import com.plugin.collect.model.UserModel;
import com.plugin.collect.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author dreammust@163.com
 * @since 2023-12-19
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping(value = "getAll")
    public List<UserModel> getAll() {

        return userService.selectAll();
    }
    @GetMapping(value = "add")
    public void add(UserModel userModel) {
        userService.save(userModel);
    }
}

