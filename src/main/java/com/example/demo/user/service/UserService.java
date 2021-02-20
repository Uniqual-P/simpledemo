package com.example.demo.user.service;

import com.example.demo.user.entity.UserEntity;


import java.util.List;
import java.util.Map;

public interface UserService {
    List<UserEntity> getAll(Map map);

    void deleteByid(Integer id);
    public void register(UserEntity userEntity);
    public UserEntity getByid(Integer id);
    public String updateByid(UserEntity userEntity);
}

