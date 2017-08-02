package org.moedelo.api.client.contract.entity;


import com.google.gson.annotations.SerializedName;

public class CNote {

    @SerializedName("Id")
    public Long id;

    @SerializedName("NotifyDate")
    public String notifyDate;

    @SerializedName("Text")
    public String text;

    @SerializedName("IsCompleted")
    public Boolean isCompleted;

}
