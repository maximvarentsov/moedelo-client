package org.moedelo.api.client.accounting.entity;

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class AOperation {

    @SerializedName("Id")
    public Long id;

    @SerializedName("ZReportNumber")
    public String zReportNumber;

    @SerializedName("DocDate")
    public String docDate;

    @SerializedName("Sum")
    public BigDecimal sum;

    @SerializedName("PayByCard")
    public BigDecimal payByCard;

    @SerializedName("Description")
    public String description;

    @SerializedName("NDS")
    public RLNds NDS;

}
