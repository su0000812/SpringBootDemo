package com.example.demo.controller;

import com.example.demo.bean.DataFixTask;
import com.example.demo.bean.Order;
import com.example.demo.db.admin.TestMapper;
import com.example.demo.db.wx.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

@RestController
@RequestMapping("/test")
public class Hello {

//    @Resource
//    private JdbcTemplate jdbcTemplate;

    @Autowired
    OrderMapper orderMapper;

    @Autowired
    TestMapper testMapper;

    @RequestMapping("hello")
    public String testHelloWorld() {
//        String testSql = "SELECT * FROM aa_app";
//        jdbcTemplate.query(testSql, new RowMapper<Object>() {
//            @Override
//            public Object mapRow(ResultSet resultSet, int i) throws SQLException {
//                System.out.println(resultSet.getInt("id"));
//                return null;
//            }
//        });
//        ArrayList<Order> orders = orderMapper.getOrders();
//        for (Order order : orders) {
//            System.out.println(order.toString());
//        }
        ArrayList<DataFixTask> dataFixTasks = testMapper.getFixTask();
        for (DataFixTask dataFixTask : dataFixTasks) {
            System.out.println(dataFixTask.toString());
        }
        return "hello world!";
    }
}
