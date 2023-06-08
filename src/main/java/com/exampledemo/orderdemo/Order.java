package com.exampledemo.orderdemo;

public class Order {
    private String orderId;
    private String orderName;
    private int qty;
    private double price;

    public Order() {
    }

    public Order(String orderId, String orderName, int qty, double price) {
        this.orderId = orderId;
        this.orderName = orderName;
        this.qty = qty;
        this.price = price;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
