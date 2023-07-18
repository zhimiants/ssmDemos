package com.lxw;

import com.lxw.mapper.UserMapper;
import com.lxw.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisTest2ApplicationTests {

    @Autowired
    private UserMapper userMapper;
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
}
