package org.moedelo.api.client.accounting.entity;


import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CActDataAdvanceInvoice {

    @SerializedName("AdvanceInvoices")
    public List<CActDataInvoice> advanceInvoices;

    @SerializedName("Number")
    public String number;

    @SerializedName("DocDate")
    public String docDate;
}
