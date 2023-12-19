package com.plugin.collect.api;

import com.plugin.collect.model.User;
import com.plugin.collect.response.CustomResponseEntity;
import com.plugin.collect.thirdparty.ThirdPartyServiceUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping
public class DemoController {

    @PostMapping("getUserName")
    @ResponseBody
    public CustomResponseEntity getUserName(@RequestBody User param) {

        try {
            ThirdPartyServiceUtils thirdPartyServiceUtils = new ThirdPartyServiceUtils();
            String name =  thirdPartyServiceUtils.getUserName(param.getName());
            if (!StringUtils.equals(name,param.getName())){
                return CustomResponseEntity.fail("用户名不匹配");
            }
            Map<String, Object> map = new HashMap<>();
            map.put("name",name);

            return CustomResponseEntity.success(map);
        } catch (Exception e) {
            return CustomResponseEntity.fail("");
        }
    }

    @PostMapping("getUserNameV2")
    @ResponseBody
    public CustomResponseEntity getUserNameV2(@RequestBody User param) {
        try {
            String name =  ThirdPartyServiceUtils.getUserNameV2(param.getName());

            Map<String, Object> map = new HashMap<>();
            map.put("name",name);

            return CustomResponseEntity.success(map);
        } catch (Exception e) {
            return CustomResponseEntity.fail("");
        }
    }
}
