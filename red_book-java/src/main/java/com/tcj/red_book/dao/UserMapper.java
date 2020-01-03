package com.tcj.red_book.dao;

import com.tcj.red_book.entity.pojo.User;
import com.tcj.red_book.entity.pojo.UserWithBLOBs;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserWithBLOBs record);

    int insertSelective(UserWithBLOBs record);

    UserWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(UserWithBLOBs record);

    int updateByPrimaryKey(User record);
}