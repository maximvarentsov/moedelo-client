package org.moedelo.api.client.accounting.entity;


import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ActLData {

    @SerializedName("ResourceList")
    public List<ActLDataItem> resourceList;
}
