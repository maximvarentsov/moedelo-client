package org.moedelo.api.client.accounting.entity;


import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BillLData {

    @SerializedName("ResourceList")
    public List<BillLDataItem> resourceList;

}
