package org.moedelo.api.client.contract.entity;


import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CNParam {

    @SerializedName("NotifyDate")
    public String notifyDate;

    @SerializedName("Text")
    public String text;

    @SerializedName("IsCompleted")
    public boolean isCompleted;
}
