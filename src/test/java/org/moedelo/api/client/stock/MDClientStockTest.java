package org.moedelo.api.client.stock;


import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.moedelo.api.client.MDClientTest;
import org.moedelo.api.client.stock.entity.SLData;
import org.moedelo.api.client.stock.impl.StockClientBuilder;

import java.util.Properties;

import lombok.SneakyThrows;
import retrofit2.Response;


public class MDClientStockTest extends MDClientTest {

    @SneakyThrows
    private StockClient getStockClient() {
        Properties properties = getProperties();

        return new StockClientBuilder()
                .baseUrl(properties.getProperty("moedelo.baseurl"))
                .apiKey(properties.getProperty("moedelo.apikey"))
                .build();
    }

    @Test
    @Ignore
    @SneakyThrows
    public void testList() {

        StockClient stockClient = getStockClient();

        Response<SLData> listStocksResponse = stockClient.list();

        Assert.assertTrue(listStocksResponse.body().resourceList.size() > 0);
    }

}
