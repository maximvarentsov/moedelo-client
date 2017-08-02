package org.moedelo.api.client.accounting.entity;


import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class RLNds {

    @SerializedName("Rate")
    public BigDecimal rate;

    @SerializedName("Sum")
    public BigDecimal sum;

}
