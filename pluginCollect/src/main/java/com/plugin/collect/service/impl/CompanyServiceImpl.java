package com.plugin.collect.service.impl;

import com.plugin.collect.model.CompanyModel;
import com.plugin.collect.mapper.CompanyMapper;
import com.plugin.collect.model.UserModel;
import com.plugin.collect.service.CompanyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.plugin.collect.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <p>
 * 公司表 服务实现类
 * </p>
 *
 * @author dreammust@163.com
 * @since 2023-12-20
 */
@Service
public class CompanyServiceImpl extends ServiceImpl<CompanyMapper, CompanyModel> implements CompanyService {

    @Resource
    private UserService userService;

    @Resource
    private CompanyMapper companyMapper;

    @Override
    public boolean save(CompanyModel entity) {
        return super.save(entity);
    }

    @Override
    public List<CompanyModel> queryAllUserByCompanyId(long companyId) {
        CompanyModel companyModel = companyMapper.selectById(companyId);

        List<UserModel> userModels = userService.queryListByCompanyId(companyId);

        System.out.println(userModels.get(0).getName());

        return Collections.singletonList(companyModel);
    }

    @Override
    public void batchAdd() {
        CompanyModel model = new CompanyModel();
        model.setName("helloTDT");
        model.setDomain("123@163.com");
        model.setContactPhone("123456789");
        model.setAddress("北京市海淀区");
        model.setLogo("http://www.baidu.com");
        model.setCreator(1L);
        model.setState(1);
        companyMapper.insert(model);

        for (int i = 0; i < 10; i++) {
            UserModel userModel = new UserModel();
            userModel.setCompanyId(model.getId());
            userModel.setName("user" + i);
            userModel.setAge(i);
            userModel.setEmail("user" + i + "@163.com");
            userService.save(userModel);
        }
    }
}
