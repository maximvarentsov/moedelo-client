package org.moedelo.api.client.accounting.entity;


import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class CBillParamItem {

    @SerializedName("StockProductId")
    public Long stockProductId;

    @SerializedName("Name")
    public String name;

    @SerializedName("Count")
    public int count;

    @SerializedName("Unit")
    public String unit;

    @SerializedName("Type")
    public int type;

    @SerializedName("Price")
    public BigDecimal price;

    @SerializedName("NdsType")
    public int ndsType;
}
