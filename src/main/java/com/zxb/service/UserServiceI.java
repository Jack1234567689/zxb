package com.zxb.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zxb.po.User;

public interface UserServiceI extends IService<User> {
    User login(User user);
}
