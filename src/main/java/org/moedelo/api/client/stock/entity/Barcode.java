package org.moedelo.api.client.stock.entity;

import com.google.gson.annotations.SerializedName;

public class Barcode {

    @SerializedName("Id")
    public Long id;

    @SerializedName("Code")
    public String code;
}
