package org.moedelo.api.client.contract.entity;


import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CNLData {

    @SerializedName("ResourceList")
    public List<CNote> resourceList;

}
