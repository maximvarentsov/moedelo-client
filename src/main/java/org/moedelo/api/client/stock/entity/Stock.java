package org.moedelo.api.client.stock.entity;


import com.google.gson.annotations.SerializedName;

public class Stock {

    @SerializedName("Id")
    public Long id;

    @SerializedName("Name")
    public String name;

    @SerializedName("IsMain")
    public boolean isMain;

    @SerializedName("StockType")
    public int stockType;
}
