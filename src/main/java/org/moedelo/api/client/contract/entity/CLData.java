package org.moedelo.api.client.contract.entity;


import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CLData {

    @SerializedName("ResourceList")
    public List<CLDataItem> resourceList;

}
