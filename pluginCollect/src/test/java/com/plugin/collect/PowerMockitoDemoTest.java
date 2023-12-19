package com.plugin.collect;

import com.plugin.collect.api.DemoController;
import com.plugin.collect.model.User;
import com.plugin.collect.response.CustomResponseEntity;
import com.plugin.collect.thirdparty.ThirdPartyServiceUtils;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.when;

/**
 * PowerMockito 支持 调用方法中调用static的方法
 */
//指定执行方式
@RunWith(PowerMockRunner.class)
@PrepareForTest({ThirdPartyServiceUtils.class })
public class PowerMockitoDemoTest {


    @InjectMocks
    private DemoController demoController;

    private User mockUser;
    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        mockStatic(ThirdPartyServiceUtils.class);
        mockUser = new User();
        mockUser.setName("TestUser");
    }

    @Test
    public void testPowerMockito1() throws Exception {
        when(ThirdPartyServiceUtils.getUserNameV2(mockUser.getName())).thenReturn("TestUser");
        // 调用被模拟的方法
        CustomResponseEntity customResponse = demoController.getUserNameV2(mockUser);

        if (customResponse.getCode() == 200) {
            System.out.println("success"+customResponse.getData());
        } else {
            System.out.println("fail");
        }
    }


}
