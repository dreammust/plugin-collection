package com.plugin.collect.service.impl;

import com.plugin.collect.model.CompanyModel;
import com.plugin.collect.mapper.CompanyMapper;
import com.plugin.collect.service.CompanyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

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

}
