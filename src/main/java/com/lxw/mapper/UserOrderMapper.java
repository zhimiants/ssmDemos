package com.lxw.mapper;

import com.lxw.pojo.User;
import com.lxw.pojo.UserOrder;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserOrderMapper {

    User getUserWithOrdersById(int i);

    UserOrder getOrdersByUserId(int i);
}
