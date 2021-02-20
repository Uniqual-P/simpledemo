package com.example.demo.user.controller;

import com.example.demo.user.entity.UserEntity;
import com.example.demo.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;
    private UserEntity userEntity;

    @ResponseBody
    @RequestMapping("/getAll")
    public List<UserEntity> getAll(Map map){
        return userService.getAll(map);
    }
    @RequestMapping("/deleteByid")
    public String deleteByid(Integer id){
        userService.deleteByid(id);
        return "redirect:/index.html";
    }


    @RequestMapping("/register")
    @ResponseBody
    public String register(UserEntity userEntity){
        System.out.println("用户注册 - " + userEntity.toString());
        userService.register(userEntity);
        return "redirect:/index.html";
    }
    @RequestMapping("/getByid")
    @ResponseBody
    public UserEntity getByid(Integer id){
        return userService.getByid(id);
    }
    @RequestMapping("/updateByid")
    @ResponseBody
    public void updateByid(UserEntity userEntity){

    }
}
