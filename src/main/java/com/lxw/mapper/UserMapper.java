package com.lxw.mapper;

import com.lxw.pojo.User;
import com.lxw.pojo.UserOrder;
import com.lxw.pojo.UserPermissions;
import com.lxw.pojo.UserRoles;
import com.lxw.pojo.UserRoles;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    /**
     * 单表刘表查询
     * @return
     */
    @Select("select * from 528_user")
    List<User> list();

    /**
     * 根据id删除
     * @param id
     * @return
     */
    @Delete("delete from `528_user` where id = #{id}")
    int deltebyId(Integer id);

    /**
     * 单表新增功能
     * @param user
     * @return
     */
    @Insert("insert into 528_user(id, username, password, avatar, last_ip, last_at, status, fail_times, lock_expire_time, balance, create_at, create_ip) " +
            "values (#{id},#{username},#{password},#{avatar},#{lastIp},#{lastAt},#{status},#{failTimes},#{lockExpireTime},#{balance},#{createAt},#{createIp})")
    int insert(User user);


    User getUserWithProfileById(int id);

    /**
     * 根据id进行单个结果集查询
     * @param id
     * @return
     */
    @Select("select * from 528_user where id = #{id};")
    User getById(int id);

    /**
     * 根据id进行username修改
     * @param user
     * @return
     */
    @Update("update 528_user set username=#{username} where id=#{id}")
    User updateById(User user);

    /**
     * 注解实现一对一关联查询
     * @param id
     * @return
     */
    @Select("SELECT u.*, up.id as profile_id, up.full_name, up.email FROM 528_user u " +
            "LEFT JOIN 528_user_profile up ON u.id = up.user_id WHERE u.id = #{id}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "username", column = "username"),
            @Result(property = "password", column = "password"),
            // Other properties of User class

            @Result(property = "userProfile.id", column = "profile_id"),
            @Result(property = "userProfile.fullName", column = "full_name"),
            @Result(property = "userProfile.email", column = "email"),
            // Other properties of UserProfile class
    })
    User getUserById1(int id);

    /**
     * 一对多关联查询
     * @param id
     * @return
     */
    @Select("SELECT * FROM 528_user WHERE id = #{id}")
    User getUserById2(@Param("id") int id);

    @Select("SELECT * FROM 528_user_orders WHERE user_id = #{userId}")
    @Results(value = {
            @Result(property = "orderId", column = "order_id"),
            @Result(property = "userId", column = "user_id"),
            @Result(property = "orderDate", column = "order_date"),
            @Result(property = "totalAmount", column = "total_amount"),
            @Result(property = "shippingAddress", column = "shipping_address")
    })
    List<UserOrder> getUserOrdersByUserId(@Param("userId") int userId);


    /**
     * 多对多关联查询
     * @param id
     * @return
     */

    @Select("SELECT * FROM 528_user WHERE id = #{id}")
    @Results(id = "userResultMap", value = {
            @Result(property = "id", column = "id"),
            @Result(property = "username", column = "username"),
            @Result(property = "password", column = "password"),
            // Other properties of User class
    })
    User getUserById(@Param("id") int id);

    @Select("SELECT ur.* FROM 528_user_roles ur WHERE ur.user_id = #{userId}")
    List<UserRoles> getUserRolesByUserId(@Param("userId") int userId);

    @Select("SELECT up.* FROM 528_user_permissions up WHERE up.user_id = #{userId}")
    List<UserPermissions> getUserPermissionsByUserId(@Param("userId") int userId);


}
