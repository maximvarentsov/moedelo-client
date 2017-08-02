package org.moedelo.api.client.accounting.entity;


import com.google.gson.annotations.SerializedName;

public class CActDataInvoice {

    @SerializedName("Id")
    public Long id;

    @SerializedName("Number")
    public String number;

    @SerializedName("Total")
    public int total;
}
