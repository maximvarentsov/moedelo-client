package org.moedelo.api.client.accounting.entity;


import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class CActParamItem {

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

    @SerializedName("SumWithoutNds")
    public BigDecimal sumWithoutNds;

    @SerializedName("NdsSum")
    public BigDecimal ndsSum;

    @SerializedName("SumWithNds")
    public BigDecimal sumWithNds;

}
