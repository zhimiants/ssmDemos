package com.lxw.mapper;

import com.lxw.pojo.UserProfile;
import org.apache.ibatis.annotations.Mapper;
@Mapper
// 用户资料Mapper接口 (UserProfileMapper.java)
public interface UserProfileMapper {

    UserProfile getUserProfileWithUserById(int id);
}

