package org.moedelo.api.client.stock.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class SLData {

    @SerializedName("ResourceList")
    public List<Stock> resourceList;
}
