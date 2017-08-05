package org.moedelo.api.client.accounting.impl;


import org.moedelo.api.client.accounting.AccountingAPI;
import org.moedelo.api.client.accounting.AccountingClient;
import org.moedelo.api.client.accounting.Act;
import org.moedelo.api.client.accounting.entity.ALData;
import org.moedelo.api.client.accounting.entity.ALDataItem;
import org.moedelo.api.client.accounting.entity.ActLData;
import org.moedelo.api.client.accounting.entity.Bill;
import org.moedelo.api.client.accounting.entity.BillLData;
import org.moedelo.api.client.accounting.entity.CActParam;
import org.moedelo.api.client.accounting.entity.CBillParam;
import org.moedelo.api.client.accounting.entity.CInvoiceParam;
import org.moedelo.api.client.accounting.entity.COData;
import org.moedelo.api.client.accounting.entity.COParam;
import org.moedelo.api.client.accounting.entity.GOData;
import org.moedelo.api.client.accounting.entity.InvLData;
import org.moedelo.api.client.accounting.entity.Invoice;
import org.moedelo.api.client.accounting.entity.RLData;
import org.moedelo.api.client.accounting.entity.SActParam;

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

    public Response<ActLData> acts() throws IOException {
        return accountingAPI.acts(apiKey).execute();
    }

    public Response<ActLData> acts(Integer pageNo) throws IOException {
        return accountingAPI.acts(apiKey, pageNo).execute();
    }

    public Response<ActLData> acts(Integer pageNo, Integer pageSize) throws IOException {
        return accountingAPI.acts(apiKey, pageNo, pageSize).execute();
    }

    public Response<Act> createAct(CActParam actModel) throws IOException {
        return accountingAPI.createAct(apiKey, actModel).execute();
    }

    public Response<String> deleteAct(Long id) throws IOException {
        return accountingAPI.deleteAct(apiKey, id).execute();
    }

    public Response<Act> act(Long id) throws IOException {
        return accountingAPI.act(apiKey, id).execute();
    }

    public Response<Act> saveAct(Long id, SActParam actModel) throws IOException {
        return accountingAPI.saveAct(apiKey, id, actModel).execute();
    }

    public Response<BillLData> bills() throws IOException {
        return accountingAPI.bills(apiKey).execute();
    }

    public Response<BillLData> bills(Integer pageNo) throws IOException {
        return accountingAPI.bills(apiKey, pageNo).execute();
    }

    public Response<BillLData> bills(Integer pageNo, Integer pageSize) throws IOException {
        return accountingAPI.bills(apiKey, pageNo, pageSize).execute();
    }

    public Response<Bill> createBill(CBillParam billModel) throws IOException {
        return accountingAPI.createBill(apiKey, billModel).execute();
    }

    public Response<String> deleteBill(Long id) throws IOException {
        return accountingAPI.deleteBill(apiKey, id).execute();
    }

    public Response<Bill> bill(Long id) throws IOException {
        return accountingAPI.bill(apiKey, id).execute();
    }

    public Response<Bill> saveBill(Long id, CBillParam billModel) throws IOException {
        return accountingAPI.saveBill(apiKey, id, billModel).execute();
    }

    public Response<InvLData> invoices() throws IOException {
        return accountingAPI.invoices(apiKey).execute();
    }

    public Response<InvLData> invoices(Integer pageNo) throws IOException {
        return accountingAPI.invoices(apiKey, pageNo).execute();
    }

    public Response<InvLData> invoices(Integer pageNo, Integer pageSize) throws IOException {
        return accountingAPI.invoices(apiKey, pageNo, pageSize).execute();
    }

    public Response<Invoice> createInvoice(CInvoiceParam invoiceModell) throws IOException {
        return accountingAPI.createInvoice(apiKey, invoiceModell).execute();
    }

    public Response<String> deleteInvoice(Long id) throws IOException {
        return accountingAPI.deleteInvoice(apiKey, id).execute();
    }

    public Response<Invoice> invoice(Long id) throws IOException {
        return accountingAPI.invoice(apiKey, id).execute();
    }

    public Response<Invoice> saveInvoice(Long id, CInvoiceParam invoiceModel) throws IOException {
        return accountingAPI.saveInvoice(apiKey, id, invoiceModel).execute();
    }
}
