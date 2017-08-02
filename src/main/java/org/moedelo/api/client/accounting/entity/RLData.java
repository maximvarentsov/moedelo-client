package org.moedelo.api.client.accounting.entity;


import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RLData {

    @SerializedName("TotalCount")
    public Integer totalCount;

    @SerializedName("ResourceList")
    public List<AOperation> resourceList;

}
