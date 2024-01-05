package com.plugin.collect.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.plugin.collect.mapper.UserMapper;
import com.plugin.collect.model.UserModel;
import com.plugin.collect.service.UserService;
import com.plugin.collect.thirdparty.ThirdPartyServiceUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collection;
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
        System.out.println("selectAll :"+userName);
        List<UserModel> all = userMapper.selectAll();
        return all;
    }

    @Override
    public List<UserModel> queryListByCompanyId(long companyId) {
        List<UserModel> list = userMapper.queryListByCompanyId(companyId);
        return list;
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
