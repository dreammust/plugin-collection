package com.plugin.collect.service.impl;

import cn.hutool.core.date.DateTime;
import com.plugin.collect.model.UserModel;
import com.plugin.collect.mapper.UserMapper;
import com.plugin.collect.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.plugin.collect.thirdparty.ThirdPartyServiceUtils;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import sun.net.www.http.Hurryable;

import javax.annotation.Resource;
import javax.xml.crypto.Data;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author dreammust@163.com
 * @since 2023-12-20
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserModel> implements UserService {

    @Resource
    private UserMapper userMapper;
    @Override
    public List<UserModel> selectAll() {
        //调用第三方接口
        String userName = ThirdPartyServiceUtils.getName("user");
        System.out.println("-------"+userName);
        return userMapper.selectAll();
    }


    @Override
    public boolean save(UserModel entity) {
        return super.save(entity);
    }

    @Override
    public boolean saveBatch(Collection<UserModel> entityList) {
        return super.saveBatch(entityList);
    }
}
