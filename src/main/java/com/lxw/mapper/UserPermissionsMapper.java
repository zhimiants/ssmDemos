package com.lxw.mapper;

import com.lxw.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserPermissionsMapper {
    User getUserWithPermissionsById(int i);
}
