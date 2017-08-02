package org.moedelo.api.client.kontragents.entity;

import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CKParam {

    @SerializedName("Name")
    public String name;

    @SerializedName("Type")
    public int type;

}
