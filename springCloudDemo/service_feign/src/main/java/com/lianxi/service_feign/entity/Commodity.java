package com.lianxi.service_feign.entity;

import java.io.Serializable;

//商品表
public class Commodity implements Serializable {
    private int id;//编号

    private String tradeName;//商品名称

    private double commodityPrice;//商品价格

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public double getCommodityPrice() {
        return commodityPrice;
    }

    public void setCommodityPrice(double commodityPrice) {
        this.commodityPrice = commodityPrice;
    }
}
