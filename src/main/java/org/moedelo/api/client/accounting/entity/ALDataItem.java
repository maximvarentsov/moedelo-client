package org.moedelo.api.client.accounting.entity;


import com.google.gson.annotations.SerializedName;

public class ALDataItem {

    @SerializedName("Id")
    public Long id;

    @SerializedName("Name")
    public String name;

    @SerializedName("IsMain")
    public boolean isMain;

}
