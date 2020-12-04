package com.example.demo.bean;

import javax.persistence.Entity;


public class Order {

    public long id;
    public int price;

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", price=" + price +
                '}';
    }
}
