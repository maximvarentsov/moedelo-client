package org.moedelo.api.client.kontragents.entity;


import com.google.gson.annotations.SerializedName;

public class Kontragent {

    @SerializedName("Id")
    public Long id;

    @SerializedName("Inn")
    public String inn;

    @SerializedName("Ogrn")
    public String ogrn;

    @SerializedName("Okpo")
    public String okpo;

    @SerializedName("Name")
    public String name;

    @SerializedName("Type")
    public int type;

    @SerializedName("Form")
    public int form;

    @SerializedName("IsArchived")
    public int isArchived;

    @SerializedName("LegalAddress")
    public String legalAddress;

    @SerializedName("ActualAddress")
    public String actualAddress;
}
