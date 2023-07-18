package com.lxw.mapper;

import com.lxw.pojo.User;
import com.lxw.pojo.UserPermissions;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserPermissionsMapper {
    User getUserWithPermissionsById(int i);

    UserPermissions getPermissionsByUserId(int i);
}
