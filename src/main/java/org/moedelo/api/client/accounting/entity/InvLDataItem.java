package org.moedelo.api.client.accounting.entity;


import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class InvLDataItem {

    @SerializedName("Id")
    public Long id;

    @SerializedName("Number")
    public String number;

    @SerializedName("DocDate")
    public String DocDate;

    @SerializedName("Sum")
    public BigDecimal sum;

    @SerializedName("NdsPositionType")
    public int ndsPositionType;

    @SerializedName("SenderId")
    public Long senderId;

    @SerializedName("SupplierId")
    public Long supplierId;

    @SerializedName("receiverId")
    public Long receiverId;

    @SerializedName("PayerId")
    public Long payerId;

    @SerializedName("BillId")
    public Long billId;

    @SerializedName("KontragentId")
    public Long KontragentId;

    @SerializedName("OnHands")
    public String onHands;
}
