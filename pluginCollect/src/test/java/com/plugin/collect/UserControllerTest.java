package com.plugin.collect;

import com.alibaba.fastjson.JSONObject;
import com.plugin.collect.api.UserController;
import com.plugin.collect.model.UserModel;
import com.plugin.collect.service.UserService;
import com.plugin.collect.thirdparty.ThirdPartyServiceUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = PluginCollectApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Resource
    private UserService userService;


    @Test
    public void test() throws UnsupportedEncodingException {
        MvcResult mvcResult = null;
        try {
            String url = "/user/getAll";
            mvcResult = mockMvc.perform(MockMvcRequestBuilders.get(url)
                            .contentType(MediaType.APPLICATION_JSON))
                    .andDo(MockMvcResultHandlers.print()).andReturn();
        } catch (Exception e) {
            e.printStackTrace();
        }
        int status = mvcResult.getResponse().getStatus();
        System.out.println(status+" ************** "+mvcResult.getResponse().getContentAsString());

    }

    @Test
    public void test1() {
        Mockito.mockStatic(ThirdPartyServiceUtils.class);
        Mockito.when(ThirdPartyServiceUtils.getName("user")).thenReturn("test");
        List<UserModel> userModels = userService.selectAll();
        System.out.println(userModels.get(0));
    }
}
