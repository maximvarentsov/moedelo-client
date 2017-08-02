package org.moedelo.api.client.accounting.entity;

import com.google.gson.annotations.SerializedName;

public class SettlementAccount {

    @SerializedName("AccountId")
    public Long accountId;

    @SerializedName("AccountNumber")
    public Long accountNumber;
}