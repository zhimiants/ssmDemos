package com.lxw;

import com.lxw.mapper.UserMapper;
import com.lxw.mapper.UserOrderMapper;
import com.lxw.mapper.UserPermissionsMapper;
import com.lxw.mapper.UserProfileMapper;
import com.lxw.pojo.User;
import com.lxw.pojo.UserOrder;
import com.lxw.pojo.UserProfile;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class MybatisTest2ApplicationTests {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserProfileMapper userProfileMapper;
    /*查询所有内容测试*/
    @Test
    public void contextLoads() {
        List<User> userList = userMapper.list();
        userList.stream().forEach(user -> {
            System.out.println(user);
        });
    }

    @Test
    public void deletebyId(){
        int i = userMapper.deltebyId(10);
        System.out.println(i);
    }

    @Test
    public void insertTest(){
        User user = new User();
        user.setId(10);
        userMapper.insert(user);

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
        User user = userOrderMapper.getUserWithOrdersById(2);
        System.out.println(user);
    }


    @Autowired
    private UserPermissionsMapper userPermissionsMapper;

    @Test
    public void testGetUserWithPermissionsById() {
        User user = userPermissionsMapper.getUserWithPermissionsById(2);
        System.out.println(user);
    }
}
