package org.moedelo.api.client.contract.entity;


import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CCParam {

    @SerializedName("Number")
    public String number;

    @SerializedName("DocDate")
    public String docDate;

    @SerializedName("Sum")
    public BigDecimal sum;

    @SerializedName("IsArchived")
    public boolean isArchived;

    @SerializedName("Status")
    public Integer status;

    @SerializedName("KontragentId")
    public Long kontragentId;

    @SerializedName("Direction")
    public Integer direction;
}
