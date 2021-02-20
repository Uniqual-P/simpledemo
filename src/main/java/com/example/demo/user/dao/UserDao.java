package com.example.demo.user.dao;

import com.example.demo.user.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserDao {
    List<UserEntity> getAll(@Param("content") Map map);
    void deleteByid(Integer id);

    public static void register(UserEntity userEntity) {

    }

    public UserEntity getByid (Integer id);

    String updateByid(UserEntity userEntity);
}
