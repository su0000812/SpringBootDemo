package com.example.demo.db.wx;

import com.example.demo.bean.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

@Mapper
public interface OrderMapper {

    @Select("select id,price from test_order")
    ArrayList<Order> getOrders();
}
