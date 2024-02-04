package com.plugin.collect.api;


import com.plugin.collect.model.UserModel;
import com.plugin.collect.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author dreammust@163.com
 * @since 2023-12-20
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

    /**
     *
     * @param userModel
     * @return
     */
    @PostMapping(value = "postAll")
    public UserModel postAll(@RequestBody UserModel userModel) {

        return userModel;
    }
    @GetMapping(value = "add")
    public void add(UserModel userModel) {
        userService.save(userModel);
    }
}

