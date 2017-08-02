package org.moedelo.api.client.accounting;


import com.google.gson.annotations.SerializedName;

import org.moedelo.api.client.accounting.entity.CActDataAdvanceInvoice;


public class Act {

    @SerializedName("Id")
    public Long id;

    @SerializedName("Number")
    public String number;

    @SerializedName("DocDate")
    public String docDate;

    @SerializedName("Invoice")
    public CActDataAdvanceInvoice advanceInvoice;
}
