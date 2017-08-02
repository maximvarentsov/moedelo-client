package org.moedelo.api.client.nomenclature.entity;


import com.google.gson.annotations.SerializedName;

import java.util.List;

public class NLData {

    @SerializedName("ResourceList")
    public List<NLDataItem> resourceList;

}
