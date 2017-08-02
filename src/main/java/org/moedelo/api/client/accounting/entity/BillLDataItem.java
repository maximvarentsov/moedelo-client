package org.moedelo.api.client.accounting.entity;


import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class BillLDataItem {

    @SerializedName("Id")
    public Long id;

    @SerializedName("Number")
    public String Number;

    @SerializedName("DocDate")
    public String docDate;

    @SerializedName("Type")
    public int type;

    @SerializedName("Status")
    public int status;

    @SerializedName("KontragentId")
    public Long kontragentId;

    @SerializedName("SettlementAccount")
    public SettlementAccount settlementAccount;

    @SerializedName("ProjectId")
    public Long projectId;

    @SerializedName("DeadLine")
    public String deadLine;

    @SerializedName("AdditionalInfo")
    public String additionalInfo;

    @SerializedName("ContractSubject")
    public String contractSubject;

    @SerializedName("NdsPositionType")
    public int ndsPositionType;

    @SerializedName("IsCovered")
    public int isCovered;

    @SerializedName("Sum")
    public BigDecimal sum;

    @SerializedName("PaidSum")
    public BigDecimal paidSum;
}
