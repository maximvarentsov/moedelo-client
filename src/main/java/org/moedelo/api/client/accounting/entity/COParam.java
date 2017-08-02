package org.moedelo.api.client.accounting.entity;


import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class COParam {

    @SerializedName("ZReportNumber")
    public String zReportNumber;

    @SerializedName("DocDate")
    public String docDate;

    @SerializedName("Sum")
    public BigDecimal sum;
}
