package com.zxb.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zxb.po.User;
import com.zxb.service.UserServiceI;
import com.zxb.vo.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserServiceI userService;

    @GetMapping("/login")
    @ResponseBody
    public AjaxResult login(User user){
        try{
            User dbUser = userService.login(user);
            return new AjaxResult(200,"登录成功",dbUser);
        }catch (Exception e){
            return new AjaxResult(400,"登录失败",e.getMessage());
        }
    }

    @GetMapping("/list")
    @ResponseBody
    public AjaxResult list(User user){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        List<User> list = userService.list(wrapper);
        if(list!=null&&list.size()>0){
            return new AjaxResult(200,"查询成功",list);
        }else{
            return new AjaxResult(400,"查询失败");
        }
    }

    @GetMapping("/add")
    @ResponseBody
    public AjaxResult add(User user) {
        User queryUser = userService.getById(user.getUserId());
        if(queryUser==null){
            boolean flag = userService.save(user);
            if(flag){
                return new AjaxResult(200,"添加成功");
            }else{
                return new AjaxResult(400,"添加失败");
            }
        }else{
            return new AjaxResult(500,"用户名已存在");
        }



    }

    @GetMapping("/edit")
    @ResponseBody
    public AjaxResult edit(User user) {
        boolean flag = userService.updateById(user);
        if(flag){
            return new AjaxResult(200,"更新成功");
        }else{
            return new AjaxResult(400,"更新失败");
        }
    }

    @GetMapping("/delete")
    @ResponseBody
    public AjaxResult delete(int id) {
        boolean flag = userService.removeById(id);
        if(flag){
            return new AjaxResult(200,"删除成功");
        }else{
            return new AjaxResult(400,"删除失败");
        }
    }

    @GetMapping("/changeEnabled")
    @ResponseBody
    public AjaxResult changeEnabled(User user) {
        if(user.getEnabled().equals("1")){
            user.setEnabled("0");
        }else{
            user.setEnabled("1");
        }
        boolean flag = userService.updateById(user);
        if(flag){
            return new AjaxResult(200,"修改成功");
        }else{
            return new AjaxResult(400,"修改失败");
        }
    }
}
