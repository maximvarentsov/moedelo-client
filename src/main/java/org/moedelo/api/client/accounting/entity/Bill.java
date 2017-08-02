package org.moedelo.api.client.accounting.entity;


import com.google.gson.annotations.SerializedName;

import org.moedelo.api.client.entity.CContext;

import java.math.BigDecimal;
import java.util.List;

public class Bill {

    @SerializedName("Id")
    public Long id;

    @SerializedName("Number")
    public String number;

    @SerializedName("DocDate")
    public String docDate;

    @SerializedName("Items")
    public List<CActParamItem> items;

    @SerializedName("Online")
    public String online;

    @SerializedName("Context")
    public CContext context;

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
    public String ContractSubject;

    @SerializedName("NdsPositionType")
    public int ndsPositionType;

    @SerializedName("IsCovered")
    public boolean isCovered;

    @SerializedName("Sum")
    public BigDecimal Sum;

    @SerializedName("PaidSum")
    public BigDecimal paidSum;
}
