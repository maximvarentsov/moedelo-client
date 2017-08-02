package org.moedelo.api.client.accounting;


import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.moedelo.api.client.MDClientTest;
import org.moedelo.api.client.accounting.entity.ALData;
import org.moedelo.api.client.accounting.entity.ALDataItem;
import org.moedelo.api.client.accounting.entity.COData;
import org.moedelo.api.client.accounting.entity.COParam;
import org.moedelo.api.client.accounting.entity.RLData;
import org.moedelo.api.client.accounting.impl.AccountingClientBuilder;

import java.math.BigDecimal;
import java.util.Properties;

import lombok.SneakyThrows;
import retrofit2.Response;

import static org.junit.Assert.assertEquals;


public class MDClientAccountingTest extends MDClientTest {

    @SneakyThrows
    private AccountingClient getAccountingClient() {
        Properties properties = getProperties();

        return new AccountingClientBuilder()
                .baseUrl(properties.getProperty("moedelo.baseurl"))
                .apiKey(properties.getProperty("moedelo.apikey"))
                .build();
    }

    @Test
    @Ignore
    @SneakyThrows
    public void testCashierList() {

        AccountingClient cashierClient = getAccountingClient();
        Response<ALData> listCashierResponse = cashierClient.list();

        Assert.assertTrue(listCashierResponse.body().resourceList.size() > 0);
    }

    @Test
    @Ignore
    @SneakyThrows
    public void testCashierGet() {

        AccountingClient cashierClient = getAccountingClient();

        Response<ALData> listCashierResponse = cashierClient.list();

        Assert.assertTrue(listCashierResponse.body().resourceList.size() > 0);

        Long cashierId = listCashierResponse.body().resourceList.get(0).id;

        Response<ALDataItem> getCashierResponse = null;

        getCashierResponse = cashierClient.get(cashierId);

        assertEquals(cashierId, getCashierResponse.body().id);

    }

    @Test
    @Ignore
    @SneakyThrows
    public void testCreateOperationAndRetailRevenue() {

        AccountingClient cashierClient = getAccountingClient();

        Response<ALData> listCashierResponse = cashierClient.list();

        Assert.assertTrue(listCashierResponse.body().resourceList.size() > 0);

        Long cashierId = listCashierResponse.body().resourceList.get(0).id;

        Response<RLData> operationsResponse = cashierClient.retailRevenue(cashierId);

        COParam operationModel = new COParam("", null, new BigDecimal(100));

        Response<COData> crateOperationResponse = cashierClient.createOperation(cashierId, operationModel);

        Long operationId = crateOperationResponse.body().id;

        Response<RLData> operationsAfterResponse = cashierClient.retailRevenue(cashierId);

        assertEquals(operationsResponse.body().resourceList.size() + 1, operationsAfterResponse.body().resourceList.size());

        Response<String> deleteResponse = cashierClient.deleteOperation(cashierId, operationId);

    }
}

