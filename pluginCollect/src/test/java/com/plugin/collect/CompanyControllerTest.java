package com.plugin.collect;

import com.plugin.collect.api.CompanyController;
import com.plugin.collect.service.CompanyService;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import javax.annotation.Resource;


@WebMvcTest(CompanyController.class)
public class CompanyControllerTest {

    @Resource
    MockMvc mockMvc;

    @MockBean
    CompanyService companyService;



}