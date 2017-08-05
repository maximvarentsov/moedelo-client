package org.moedelo.api.client.accounting;



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

import retrofit2.Response;


public interface AccountingClient {

    AccountingAPI api();

    Response<ALData> list() throws IOException;

    Response<ALDataItem> get(Long id) throws IOException;

    Response<RLData> retailRevenue(Long cashierId) throws IOException;

    Response<RLData> retailRevenue(Long cashierId, Integer pageNo, Integer pageSize) throws IOException;

    Response<RLData> retailRevenue(Long cashierId, Integer pageNo, Integer pageSize, String beforeDate) throws IOException;

    Response<RLData> retailRevenue(Long cashierId, Integer pageNo, Integer pageSize, String beforeDate, String afterDate) throws IOException;

    Response<COData> createOperation(Long cashierId, COParam operationModel) throws IOException;

    Response<String> deleteOperation(Long cashierId, Long id) throws IOException;

    Response<COData> saveOperation(Long cashierId, COParam operationModel) throws IOException;

    Response<GOData> getOperation(Long cashierId, Long id) throws IOException;

    Response<ActLData> acts() throws IOException;

    Response<ActLData> acts(Integer pageNo) throws IOException;

    Response<ActLData> acts(Integer pageNo, Integer pageSize) throws IOException;

    Response<Act> createAct(CActParam actModel) throws IOException;

    Response<String> deleteAct(Long id) throws IOException;

    Response<Act> act(Long id) throws IOException;

    Response<Act> saveAct(Long id, SActParam actModel) throws IOException;

    Response<BillLData> bills() throws IOException;

    Response<BillLData> bills(Integer pageNo) throws IOException;

    Response<BillLData> bills(Integer pageNo, Integer pageSize) throws IOException;

    Response<Bill> createBill(CBillParam billModel) throws IOException;

    Response<String> deleteBill(Long id) throws IOException;

    Response<Bill> bill(Long id) throws IOException;

    Response<Bill> saveBill(Long id, CBillParam billModel) throws IOException;

    Response<InvLData> invoices() throws IOException;

    Response<InvLData> invoices(Integer pageNo) throws IOException;

    Response<InvLData> invoices(Integer pageNo, Integer pageSize) throws IOException;

    Response<Invoice> createInvoice(CInvoiceParam invoiceModel) throws IOException;

    Response<String> deleteInvoice(Long id) throws IOException;

    Response<Invoice> invoice(Long id) throws IOException;
}
