package org.moedelo.api.client.nomenclature.entity;


import com.google.gson.annotations.SerializedName;

public class NLDataItem {

    @SerializedName("Id")
    public Long id;

    @SerializedName("ParentNomenclatureId")
    public Long parentNomenclatureId;

    @SerializedName("Name")
    public String name;

    @SerializedName("NomenclatureType")
    public Integer nomenclatureType;
}
