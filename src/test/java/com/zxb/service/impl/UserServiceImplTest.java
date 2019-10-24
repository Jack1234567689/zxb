package com.zxb.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zxb.mapper.UserMapper;
import com.zxb.po.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.DigestUtils;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-service.xml")
public class UserServiceImplTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void login() {
        User user = new User();
        user.setUserName("888");
        user.setPassword("888");

        String username = user.getUserName();
        String md5Password = DigestUtils.md5DigestAsHex(user.getPassword().getBytes());

        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("user_name",username);
        User dbUser = userMapper.selectOne(wrapper);

        if(dbUser == null){
            throw  new RuntimeException("用户名或密码不存在");
        }else if(!dbUser.getPassword().equals(md5Password)){
            throw  new RuntimeException("用户名或密码不正确");
        }
        System.out.println(dbUser);

    }


}