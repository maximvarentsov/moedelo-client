package org.moedelo.api.client.kontragents.entity;


import com.google.gson.annotations.SerializedName;

import java.util.List;

public class KLData {

    @SerializedName("ResourceList")
    public List<Kontragent> resourceList;
}
