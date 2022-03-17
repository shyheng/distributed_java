package com.shy.provider.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shy.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author shyheng
 * @since 2022-03-15
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
