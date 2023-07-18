package com.lxw.mapper;

import com.lxw.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    /*查询所有数据1*/
    @Select("select * from 528_user")
    List<User> list();

    /*根据id删除*/
    @Delete("delete from `528_user` where id = #{id}")
    int deltebyId(Integer id);

//    @Insert("insert into 528_user(id, username, password, avatar, last_ip, last_at, status, fail_times, lock_expire_time, balance, create_at, create_ip) " +
//            "values (#{id},#{username},#{password},#{avatar},#{lastIp},#{lastAt},#{status},#{failTimes},#{lockExpireTime},#{balance},#{createAt},#{createIp})")
    int insert(User user);


    User getUserWithProfileById(int id);
}
