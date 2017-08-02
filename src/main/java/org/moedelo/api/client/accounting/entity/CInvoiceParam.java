package org.moedelo.api.client.accounting.entity;


import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;
import java.util.List;

public class CInvoiceParam {

    @SerializedName("Sum")
    public BigDecimal sum;

    @SerializedName("KontragentId")
    public Long kontragentId;

    @SerializedName("NdsPositionType")
    public int ndsPositionType;

    @SerializedName("Items")
    public List<CBillParamItem> Items;

    @SerializedName("Number")
    public String number;

    @SerializedName("DocDate")
    public String docDate;
}
