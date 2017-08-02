package org.moedelo.api.client.contract.entity;


import com.google.gson.annotations.SerializedName;

import org.moedelo.api.client.entity.CContext;

public class CGDataItem extends CLDataItem {

    @SerializedName("Context")
    public CContext context;

    @SerializedName("HasRelatedDocuments")
    public boolean hasRelatedDocuments;

}
