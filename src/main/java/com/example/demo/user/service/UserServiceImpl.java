package com.example.demo.user.service;

import com.example.demo.user.dao.UserDao;
import com.example.demo.user.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserDao userDao;
    @Override
    public List<UserEntity>getAll(Map map){
        return userDao.getAll(map);
    }

    @Override
    public void deleteByid(Integer id) {
        userDao.deleteByid(id);
    }

    @Override
    public void register(UserEntity userEntity) {
        userEntity.setCreatetime(new Date());
        userEntity.setStatus(1);
        UserDao.register(userEntity);
    }

    @Override
    public UserEntity getByid(Integer id) {
        return userDao.getByid(id);
    }

    @Override
    public String updateByid(UserEntity userEntity) {
         return userDao.updateByid(userEntity);
    }

}
