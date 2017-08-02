package org.moedelo.api.client.accounting.impl;


import org.moedelo.api.client.accounting.AccountingAPI;
import org.moedelo.api.client.accounting.AccountingClient;
import org.moedelo.api.client.accounting.entity.ALData;
import org.moedelo.api.client.accounting.entity.ALDataItem;
import org.moedelo.api.client.accounting.entity.COData;
import org.moedelo.api.client.accounting.entity.COParam;
import org.moedelo.api.client.accounting.entity.GOData;
import org.moedelo.api.client.accounting.entity.RLData;

import java.io.IOException;

import lombok.AllArgsConstructor;
import retrofit2.Response;

@AllArgsConstructor
class AccountingClientImpl implements AccountingClient {

    private String apiKey;

    private AccountingAPI accountingAPI;

    public AccountingAPI api() {
        return accountingAPI;
    }

    public Response<ALData> list() throws IOException {
        return accountingAPI.list(apiKey).execute();
    }

    public Response<ALDataItem> get(Long id) throws IOException {
        return accountingAPI.get(apiKey, id).execute();
    }

    public Response<RLData> retailRevenue(Long cashierId) throws IOException {
        return accountingAPI.retailRevenue(apiKey, cashierId).execute();
    }

    public Response<RLData> retailRevenue(Long cashierId, Integer pageNo, Integer pageSize) throws IOException {
        return accountingAPI.retailRevenue(apiKey, cashierId, pageNo, pageSize).execute();
    }

    public Response<RLData> retailRevenue(Long cashierId, Integer pageNo, Integer pageSize, String beforeDate) throws IOException {
        return accountingAPI.retailRevenue(apiKey, cashierId, pageNo, pageSize, beforeDate).execute();
    }

    public Response<RLData> retailRevenue(Long cashierId, Integer pageNo, Integer pageSize, String beforeDate, String afterDate) throws IOException {
        return accountingAPI.retailRevenue(apiKey, cashierId, pageNo, pageSize, beforeDate, afterDate).execute();
    }

    public Response<COData> createOperation(Long cashierId, COParam operationModel) throws IOException {
        return accountingAPI.createOperation(apiKey, cashierId, operationModel).execute();
    }

    public Response<String> deleteOperation(Long cashierId, Long id) throws IOException {
        return accountingAPI.deleteOperation(apiKey, cashierId, id).execute();
    }

    public Response<COData> saveOperation(Long cashierId, COParam operationModel) throws IOException {
        return accountingAPI.saveOperation(apiKey, cashierId, operationModel).execute();
    }

    public Response<GOData> getOperation(Long cashierId, Long id) throws IOException {
        return accountingAPI.getOperation(apiKey, cashierId, id).execute();
    }
}
