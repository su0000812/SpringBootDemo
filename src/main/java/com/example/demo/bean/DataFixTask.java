package com.example.demo.bean;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


public class DataFixTask {

    public long id;
    public int app_id;
    public String sel_date_start;
    public String sel_date_end;
    public int status;
    public String create_time;
    public String update_time;

    @Override
    public String toString() {
        return "DataFixTask{" +
                "id=" + id +
                ", app_id=" + app_id +
                ", sel_date_start='" + sel_date_start + '\'' +
                ", sel_date_end='" + sel_date_end + '\'' +
                ", status=" + status +
                ", create_time='" + create_time + '\'' +
                ", update_time='" + update_time + '\'' +
                '}';
    }
}
