package org.moedelo.api.client.accounting.entity;


import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CBillParam {

    @SerializedName("ProjectId")
    public Long projectId;

    @SerializedName("SettlementAccountId")
    public Long settlementAccountId;

    @SerializedName("Type")
    public Long type;

    @SerializedName("Status")
    public int status;

    @SerializedName("KontragentId")
    public Long kontragentId;

    @SerializedName("DeadLine")
    public String deadLine;

    @SerializedName("AdditionalInfo")
    public String additionalInfo;

    @SerializedName("ContractSubject")
    public String contractSubject;

    @SerializedName("NdsPositionType")
    public int ndsPositionType;

    @SerializedName("IsCovered")
    public boolean isCovered;

    @SerializedName("UseStampAndSign")
    public boolean useStampAndSign;

    @SerializedName("Items")
    public List<CBillParamItem> Items;

    @SerializedName("Number")
    public String number;

    @SerializedName("DocDate")
    public String docDate;
}
