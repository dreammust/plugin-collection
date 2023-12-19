//package com.plugin.collect;
//
//import com.plugin.collect.response.CustomResponseEntity;
//import com.plugin.collect.thirdparty.ThirdPartyServiceUtils;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.mockito.junit.MockitoJUnitRunner;
//import org.springframework.http.HttpStatus;
//
//import java.util.Map;
//
//import static org.junit.Assert.assertEquals;
//import static org.mockito.Mockito.when;
//
///**
// * Mockito 对支持 调用方法中调用static 不友好
// */
//@RunWith(MockitoJUnitRunner.class)
//public class DemoControllerTest {
//
//    /**
//     * @Mock
//     * 注解用于创建一个模拟对象，
//     * 也就是一个虚拟的ThirdPartyServiceUtils对象，
//     * 可以用来模拟ThirdPartyServiceUtils类中的方法调用。
//     */
//    @Mock
//    private ThirdPartyServiceUtils thirdPartyServiceUtils;
//
//    @InjectMocks
//    private DemoController demoController;
//
//    private User mockUser;
//
//    @Before
//    public void setup() {
//        MockitoAnnotations.initMocks(this);
//        mockUser = new User();
//        mockUser.setName("TestUser");
//    }
//
//    @Test
//    public void testGetUserName() throws Exception {
//        // Set up
//        when(thirdPartyServiceUtils.getUserName(mockUser.getName())).thenReturn("TestUser");
//
//        // Execute
//        CustomResponseEntity customResponse = demoController.getUserName(mockUser);
//        if (customResponse.getCode() != 200){
//            System.out.println("customResponse.getCode() = " + customResponse.getCode() + customResponse.getMessage());
//        }else {
//            // Verify
//            assertEquals(HttpStatus.OK.value(), customResponse.getCode());
//            Object data = customResponse.getData();
//
//            if (data instanceof Map) {
//                Map<String, String> map = (Map<String, String>) data;
//                assertEquals("TestUser", map.get("name"));
//            }
//        }
//    }
//
//}
