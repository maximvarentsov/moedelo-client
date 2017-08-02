package org.moedelo.api.client.accounting.entity;


import com.google.gson.annotations.SerializedName;


import java.util.List;

public class ALData {

    @SerializedName("TotalCount")
    public Integer totalCount;

    @SerializedName("ResourceList")
    public List<ALDataItem> resourceList;

}
