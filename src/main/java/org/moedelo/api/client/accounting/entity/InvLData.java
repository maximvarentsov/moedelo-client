package org.moedelo.api.client.accounting.entity;


import com.google.gson.annotations.SerializedName;

import java.util.List;


public class InvLData {

    @SerializedName("ResourceList")
    public List<InvLDataItem> resourceList;
}
