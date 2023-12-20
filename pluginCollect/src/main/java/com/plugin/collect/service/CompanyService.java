package com.plugin.collect.service;

import com.plugin.collect.model.CompanyModel;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 公司表 服务类
 * </p>
 *
 * @author dreammust@163.com
 * @since 2023-12-20
 */
public interface CompanyService extends IService<CompanyModel> {


    List<CompanyModel> queryAllUserByCompanyId(long companyId);

    void batchAdd();

}
