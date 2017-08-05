package org.moedelo.api.client.stock.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GLData {

    @SerializedName("ResourceList")
    public List<Good> resourceList;
}
