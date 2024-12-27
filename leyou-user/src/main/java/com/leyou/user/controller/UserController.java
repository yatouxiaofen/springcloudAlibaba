package com.leyou.user.controller;

import com.leyou.user.entity.TUser;
import com.leyou.user.service.TUserService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <一句话功能简述> <功能详细描述>
 *
 * @author lenovo
 * @version [版本号, 2024/12/27]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
@RestController
@RequestMapping("/user")
public class UserController
{
    @Resource
    private TUserService tUserService;
    
    @RequestMapping("/list")
    public List<TUser> listUser(){
        return tUserService.listUser();
    }
    
    @RequestMapping("/queryUser")
    public TUser queryUser(Integer userId){
        return tUserService.queryUser(userId);
    }
}
