package com.zxb.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zxb.mapper.UserMapper;
import com.zxb.po.User;
import com.zxb.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserServiceI {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(User user) {
        String username = user.getUserName();
        String md5Password = DigestUtils.md5DigestAsHex(user.getPassword().getBytes());

        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("user_name",username);
        User dbUser = userMapper.selectOne(wrapper);

        if(dbUser == null){
            throw new RuntimeException("用户名不存在");
        }else if(!dbUser.getPassword().equals(md5Password)){
            throw new RuntimeException("用户名或密码不正确");
        }
        return dbUser;
    }
}
