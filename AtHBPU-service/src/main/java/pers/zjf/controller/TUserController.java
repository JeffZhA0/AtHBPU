package pers.zjf.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.zjf.entity.TUser;
import pers.zjf.service.TUserService;

import java.util.List;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author zhaojunfu
 * @since 2023-01-16
 */
@RestController
@RequestMapping("/tUser")
public class TUserController {
    @Autowired
    TUserService tUserService;

    @GetMapping("/getAllUser")
    public List<TUser> getAllUser(){
        return tUserService.list();
    }
}

