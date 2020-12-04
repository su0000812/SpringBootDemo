package com.example.demo.db.admin;

import com.example.demo.bean.DataFixTask;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

@Mapper
public interface TestMapper {

    @Select("select * from aa_bms_data_fix")
    ArrayList<DataFixTask> getFixTask();
}
