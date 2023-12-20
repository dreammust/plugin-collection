package com.plugin.collect.mapper;

import com.plugin.collect.model.UserModel;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author dreammust@163.com
 * @since 2023-12-20
 */
@Component
public interface UserMapper extends BaseMapper<UserModel> {

    public List<UserModel> selectAll();

    List<UserModel> queryListByCompanyId(long companyId);

}
