package org.moedelo.api.client.stock.entity;

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class CGParam {

    @SerializedName("NomenclatureId")
    public Long nomenclatureId;

    @SerializedName("Name")
    public String name;

    @SerializedName("UnitOfMeasurement")
    public String unitOfMeasurement;

    @SerializedName("Nds")
    public BigDecimal nds;

    @SerializedName("SalePrice")
    public BigDecimal salePrice;

    @SerializedName("Type")
    public int type;

    @SerializedName("NdsPositionType")
    public int ndsPositionType;
}
