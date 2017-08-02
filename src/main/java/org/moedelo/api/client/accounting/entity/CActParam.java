package org.moedelo.api.client.accounting.entity;


import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CActParam {

    @SerializedName("KontragentId")
    public Long kontragentId;

    @SerializedName("NdsPositionType")
    public int ndsPositionType;

    @SerializedName("Items")
    public List<CActParamItem> items;

    @SerializedName("ПР238674")
    public String number;

    @SerializedName("DocDate")
    public String docDate;
}
