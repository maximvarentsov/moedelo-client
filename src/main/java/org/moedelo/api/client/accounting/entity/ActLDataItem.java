package org.moedelo.api.client.accounting.entity;


import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class ActLDataItem {

    @SerializedName("Id")
    public Long id;

    @SerializedName("Name")
    public String name;

    @SerializedName("DocDate")
    public String String;

    @SerializedName("KontragentId")
    public Long kontragentId;

    @SerializedName("BillId")
    public Long billId;

    @SerializedName("ProjectId")
    public Long projectId;

    @SerializedName("NdsPositionType")
    public int ndsPositionType;

    @SerializedName("OnHands")
    public String onHands;

    @SerializedName("Sum")
    public BigDecimal sum;
}
