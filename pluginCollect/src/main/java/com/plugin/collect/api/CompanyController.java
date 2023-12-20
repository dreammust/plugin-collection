package com.plugin.collect.api;


import com.plugin.collect.model.CompanyModel;
import com.plugin.collect.model.UserModel;
import com.plugin.collect.service.CompanyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 公司表 前端控制器
 * </p>
 *
 * @author dreammust@163.com
 * @since 2023-12-20
 */
@Controller
@RequestMapping("/company")
public class CompanyController {
    @Resource
    private CompanyService companyService;

    @GetMapping("batchAdd")
    public void batchAdd() {
        companyService.batchAdd();
    }

    @GetMapping(value = "getAll")
    public List<CompanyModel> getAll(long companyId) {
        return companyService.queryAllUserByCompanyId(companyId);
    }

}

