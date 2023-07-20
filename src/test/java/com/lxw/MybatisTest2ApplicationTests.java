package com.lxw;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.lxw.mapper.UserMapper;
import com.lxw.mapper.UserOrderMapper;
import com.lxw.mapper.UserPermissionsMapper;
import com.lxw.mapper.UserProfileMapper;
import com.lxw.pojo.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.SQLOutput;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class MybatisTest2ApplicationTests {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserProfileMapper userProfileMapper;

    /**
     * 单表列表查询
     */
    @Test
    public void contextLoads() {
        List<User> userList = userMapper.list();
        userList.stream().forEach(user -> {
            System.out.println(user);
        });
    }

    /**
     * 根据id进行单个结果集查询
     */
    @Test
    public void getbyId(){
        User byId = userMapper.getById(2);
        System.out.println(byId);

    }
    /**
     * 根据id删除
     */
    @Test
    public void deletebyId(){
        int i = userMapper.deltebyId(11);
        System.out.println(i);
    }

    /**
     * 向user表中插入数据
     */
    @Test
    public void insertTest(){
        User user = new User();
        user.setId(11);
        user.setPassword("123456");
        user.setAvatar("avater.11");
        user.setLastIp("192.168.255.255");
        user.setStatus(1);
        userMapper.insert(user);
    }

    /**
     * 通过id更新username测试
     */
    @Test
    public void updateById(){
        User user = new User();
        user.setId(9);
        user.setUsername("updatedUsername");
        userMapper.updateById(user);
    }

    /**
     * 通过注解实现一对一关联查询测试
     */
    @Test
    void testGetUserById() {
        int userId = 2;
        User user = userMapper.getUserById1(userId);
        if (user != null) {
            System.out.println("User ID: " + user.getId());
            System.out.println("Username: " + user.getUsername());
            System.out.println("Profile ID: " + user.getUserProfile().getId());
            System.out.println("Full Name: " + user.getUserProfile().getFullName());
            System.out.println("Email: " + user.getUserProfile().getEmail());
        } else {
            System.out.println("User not found.");
        }
    }

    /**
     * 通过注解实现一对多关联查询测试
     */
    @Test
    void testGetUserById2() {
        int userId = 2;
        User user = userMapper.getUserById2(userId);
        if (user != null) {
            System.out.println("User ID: " + user.getId());
            System.out.println("Username: " + user.getUsername());

            List<UserOrder> userOrdersList = userMapper.getUserOrdersByUserId(userId);
            for (UserOrder userOrders : userOrdersList) {
                System.out.println("Order ID: " + userOrders.getOrderId());
                System.out.println("Order Date: " + userOrders.getOrderDate());
            }
        } else {
            System.out.println("User not found.");
        }
    }

    /**
     * 多对多查询测试
     */
    @Test
    void testGetUserById3() {
        int userId = 1; // Change this to the user ID you want to query
        User user = userMapper.getUserById(userId);
        if (user != null) {
            System.out.println("User ID: " + user.getId());
            System.out.println("Username: " + user.getUsername());
            // Print other user properties

            System.out.println("Roles:");
            List<UserRoles> userRoles = userMapper.getUserRolesByUserId(userId);
            for (UserRoles userRole : userRoles) {
                System.out.println(" - Role ID: " + userRole.getRoleId());
                // Print other UserRole properties here
            }

            System.out.println("Permissions:");
            List<UserPermissions> userPermissions = userMapper.getUserPermissionsByUserId(userId);
            for (UserPermissions userPermission : userPermissions) {
                System.out.println(" - Permission ID: " + userPermission.getPermissionId());
                // Print other UserPermission properties here
            }
        } else {
            System.out.println("User not found.");
        }
    }


    /*一对一嵌套查询*/
    @Test
    public void testGetUserWithProfileById() {
        User user = userMapper.getUserWithProfileById(1);
        System.out.println(user);
    }

    /*一对一嵌套结果查询*/
    @Test
    public void testGetUserProfileWithUserById() {
        UserProfile userProfile = userProfileMapper.getUserProfileWithUserById(1);
        System.out.println(userProfile);
    }

    @Autowired
    private UserOrderMapper userOrderMapper;

    @Test
    public void testGetUserWithOrdersById() {
        User user = userOrderMapper.getUserWithOrdersById(3);
        User userWithOrdersById = userOrderMapper.getUserWithOrdersById(1);
        System.out.println(user);

        System.out.println(userWithOrdersById);
    }


    @Autowired
    private UserPermissionsMapper userPermissionsMapper;

    @Test
    public void testGetUserWithPermissionsById() {
        User user = userPermissionsMapper.getUserWithPermissionsById(2);
        User userWithPermissionsById = userPermissionsMapper.getUserWithPermissionsById(1);
        System.out.println(user);
        System.out.println(userWithPermissionsById);

    }

}
