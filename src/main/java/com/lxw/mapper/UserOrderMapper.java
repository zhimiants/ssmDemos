package com.lxw.mapper;

import com.lxw.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserOrderMapper {

    User getUserWithOrdersById(int i);
}
