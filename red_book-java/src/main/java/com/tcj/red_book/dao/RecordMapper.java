package com.tcj.red_book.dao;

import com.tcj.red_book.entity.pojo.Record;
import com.tcj.red_book.entity.pojo.RecordWithBLOBs;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RecordWithBLOBs record);

    int insertSelective(RecordWithBLOBs record);

    RecordWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RecordWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(RecordWithBLOBs record);

    int updateByPrimaryKey(Record record);
}