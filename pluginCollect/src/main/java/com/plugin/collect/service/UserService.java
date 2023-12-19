package com.plugin.collect.service;

import com.plugin.collect.model.UserModel;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author dreammust@163.com
 * @since 2023-12-19
 */
public interface UserService extends IService<UserModel> {

    List<UserModel> selectAll();

    void batchAdd();

}
