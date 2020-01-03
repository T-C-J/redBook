package com.tcj.red_book.dao;

import com.tcj.red_book.entity.pojo.UserConfig;
import com.tcj.red_book.entity.pojo.UserConfigWithBLOBs;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserConfigMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserConfigWithBLOBs record);

    int insertSelective(UserConfigWithBLOBs record);

    UserConfigWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserConfigWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(UserConfigWithBLOBs record);

    int updateByPrimaryKey(UserConfig record);
}