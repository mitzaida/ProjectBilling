package com.example.model;

public class Item {

    private long id;
    private String name;
    private String code;
    private double price;
    private int discount;
    private int type;

    public Item(long id, String name, String code, int discount, int type) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.discount = discount;
        this.type = type;
    }

    public Item(long id, String name, String code, int discount, int type, double price) {
        this(id, name, code, discount, type);
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
