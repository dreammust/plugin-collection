package com.plugin.collect;

import com.plugin.collect.mapper.CompanyMapper;
import com.plugin.collect.model.CompanyModel;
import com.plugin.collect.model.UserModel;
import com.plugin.collect.service.UserService;
import com.plugin.collect.service.impl.CompanyServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Collections;
import java.util.List;

import static org.mockito.Mockito.doReturn;

public class MockitoAnnotationTest {
    @InjectMocks
    private CompanyServiceImpl companyService;
    @Mock
    private UserService userService;
    @Mock
    private CompanyMapper companyMapper;

    @BeforeEach
    public void beforeClass() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void test01(){
        UserModel model1 = new UserModel();
        model1.setName("nm");
        doReturn(Collections.singletonList(model1)).when(userService).queryListByCompanyId(1l);

        List<CompanyModel> models = companyService.queryAllUserByCompanyId(1l);
        for (CompanyModel model : models) {
            System.out.println(model);
        }
    }

}
