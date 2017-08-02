package org.moedelo.api.client.accounting;


import org.moedelo.api.client.accounting.entity.ALData;
import org.moedelo.api.client.accounting.entity.ALDataItem;
import org.moedelo.api.client.accounting.entity.ActLData;
import org.moedelo.api.client.accounting.entity.Bill;
import org.moedelo.api.client.accounting.entity.BillLData;
import org.moedelo.api.client.accounting.entity.BillLDataItem;
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

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface AccountingAPI {

    @GET("/accounting/api/v1/cashier")
    Call<ALData> list(@Header("md-api-key") String apiKey);

    @GET("/accounting/api/v1/cashier/{id}")
    Call<ALDataItem> get(@Header("md-api-key") String apiKey, @Path("id") Long id);

    @GET("/accounting/api/v1/cashier/{cashierId}/retailRevenue")
    Call<RLData> retailRevenue(@Header("md-api-key") String apiKey, @Path("cashierId") Long cashierId);

    @GET("/accounting/api/v1/cashier/{cashierId}/retailRevenue")
    Call<RLData> retailRevenue(@Header("md-api-key") String apiKey, @Path("cashierId") Long cashierId, @Query("pageNo") Integer pageNo, @Query("pageSize") Integer pageSize);

    @GET("/accounting/api/v1/cashier/{cashierId}/retailRevenue")
    Call<RLData> retailRevenue(@Header("md-api-key") String apiKey, @Path("cashierId") Long cashierId, @Query("pageNo") Integer pageNo, @Query("pageSize") Integer pageSize, @Query("beforeDate") String beforeDate);

    @GET("/accounting/api/v1/cashier/{cashierId}/retailRevenue")
    Call<RLData> retailRevenue(@Header("md-api-key") String apiKey, @Path("cashierId") Long cashierId, @Query("pageNo") int pageNo, @Query("pageSize") int pageSize, @Query("beforeDate") String beforeDate, @Query("afterDate") String afterDate);

    @POST("/accounting/api/v1/cashier/{cashierId}/retailRevenue")
    Call<COData> createOperation(@Header("md-api-key") String apiKey, @Path("cashierId") Long cashierId, @Body COParam operationModel);

    @DELETE("/accounting/api/v1/cashier/{cashierId}/retailRevenue")
    Call<String> deleteOperation(@Header("md-api-key") String apiKey, @Path("cashierId") Long cashierId, @Path("id") Long id);

    @PUT("/accounting/api/v1/cashier/{cashierId}/retailRevenue")
    Call<COData> saveOperation(@Header("md-api-key") String apiKey, @Path("cashierId") Long cashierId, @Body COParam operationModel);

    @GET("/accounting/api/v1/cashier/{cashierId}/retailRevenue/{id}")
    Call<GOData> getOperation(@Header("md-api-key") String apiKey, @Path("cashierId") Long cashierId, @Path("id") Long id);

    @GET("/accounting/api/v1/sales/act")
    Call<ActLData> acts(@Header("md-api-key") String apiKey);

    @GET("/accounting/api/v1/sales/act")
    Call<ActLData> acts(@Header("md-api-key") String apiKey, @Query("pageNo") Integer pageNo);

    @GET("/accounting/api/v1/sales/act")
    Call<ActLData> acts(@Header("md-api-key") String apiKey, @Query("pageNo") Integer pageNo, @Query("pageSize") Integer pageSize);

    @POST("/accounting/api/v1/sales/act")
    Call<Act> createAct(@Header("md-api-key") String apiKey, @Body CActParam actModel);

    @DELETE("/accounting/api/v1/sales/act/{id}")
    Call<String> deleteAct(@Header("md-api-key") String apiKey, @Path("id") Long id);

    @GET("/accounting/api/v1/sales/act/{id}")
    Call<Act> act(@Header("md-api-key") String apiKey, @Path("id") Long id);

    @PUT("/accounting/api/v1/sales/act/{id}")
    Call<Act> saveAct(@Header("md-api-key") String apiKey, @Path("id") Long id, @Body SActParam actModel);

    @GET("/accounting/api/v1/sales/bill")
    Call<BillLData> bills(@Header("md-api-key") String apiKey);

    @GET("/accounting/api/v1/sales/bill")
    Call<BillLData> bills(@Header("md-api-key") String apiKey, @Query("pageNo") Integer pageNo);

    @GET("/accounting/api/v1/sales/bill")
    Call<BillLData> bills(@Header("md-api-key") String apiKey, @Query("pageNo") Integer pageNo, @Query("pageSize") Integer pageSize);

    @POST("/accounting/api/v1/sales/act")
    Call<Bill> createBill(@Header("md-api-key") String apiKey, @Body CBillParam billModel);

    @DELETE("/accounting/api/v1/sales/bill/{id}")
    Call<String> deleteBill(@Header("md-api-key") String apiKey, @Path("id") Long id);

    @GET("/accounting/api/v1/sales/bill/{id}")
    Call<Bill> bill(@Header("md-api-key") String apiKey, @Path("id") Long id);

    @PUT("/accounting/api/v1/sales/bill/{id}")
    Call<Bill> saveBill(@Header("md-api-key") String apiKey, @Path("id") Long id, @Body CBillParam billModel);

    @GET("/accounting/api/v1/sales/invoice/common")
    Call<InvLData> invoices(@Header("md-api-key") String apiKey);

    @GET("/accounting/api/v1/sales/invoice/common")
    Call<InvLData> invoices(@Header("md-api-key") String apiKey, @Query("pageNo") Integer pageNo);

    @GET("/accounting/api/v1/sales/invoice/common")
    Call<InvLData> invoices(@Header("md-api-key") String apiKey, @Query("pageNo") Integer pageNo, @Query("pageSize") Integer pageSize);

    @POST("/accounting/api/v1/sales/invoice/common")
    Call<Invoice> createInvoice(@Header("md-api-key") String apiKey, @Body CInvoiceParam invoiceModel);

    @DELETE("/accounting/api/v1/sales/invoice/common/{id}")
    Call<String> deleteInvoice(@Header("md-api-key") String apiKey, @Path("id") Long id);

    @GET("/accounting/api/v1/sales/invoice/common/{id}")
    Call<Invoice> invoice(@Header("md-api-key") String apiKey, @Path("id") Long id);
}
