package org.moedelo.api.client.contract.entity;


import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class CLDataItem {

    @SerializedName("Id")
    public Long id;

    @SerializedName("Number")
    public String number;

    @SerializedName("DocDate")
    public String docDate;

    @SerializedName("Sum")
    public BigDecimal sum;

    @SerializedName("EndDate")
    public String endDate;

    @SerializedName("IsArchived")
    public boolean isArchived;

    @SerializedName("Status")
    public Integer status;

    @SerializedName("KontragentId")
    public Long kontragentId;

    @SerializedName("Project")
    public CLProject project;

    @SerializedName("Direction")
    public Integer direction;
}
