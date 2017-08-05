package org.moedelo.api.client.stock;


import org.moedelo.api.client.stock.entity.BLData;
import org.moedelo.api.client.stock.entity.Barcode;
import org.moedelo.api.client.stock.entity.CBParam;
import org.moedelo.api.client.stock.entity.CGParam;
import org.moedelo.api.client.stock.entity.CSParam;
import org.moedelo.api.client.stock.entity.CStock;
import org.moedelo.api.client.stock.entity.GLData;
import org.moedelo.api.client.stock.entity.Good;
import org.moedelo.api.client.stock.entity.SLData;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface StockAPI {

    @GET("/stock/api/v1/stock")
    Call<SLData> list(@Header("md-api-key") String apiKey);

    @GET("/stock/api/v1/stock")
    Call<SLData> list(@Header("md-api-key") String apiKey, @Query("pageNo") Integer pageNo);

    @GET("/stock/api/v1/stock")
    Call<SLData> list(@Header("md-api-key") String apiKey, @Query("pageNo") Integer pageNo, @Query("pageSize") Integer pageSize);

    @POST("/stock/api/v1/stock")
    Call<CStock> create(@Header("md-api-key") String apiKey, @Body CSParam stockModel);

    @DELETE("/stock/api/v1/stock/{id}")
    Call<String> delete(@Header("md-api-key") String apiKey, @Path("id") Long id);

    @GET("/stock/api/v1/stock/{id}")
    Call<CStock> get(@Header("md-api-key") String apiKey, @Path("id") Long id);

    @PUT("/stock/api/v1/stock/{id}")
    Call<CStock> save(@Header("md-api-key") String apiKey, @Path("id") Long id, @Body CSParam stockModel);

    @GET("/stock/api/v1/good/{goodId}/barcode")
    Call<BLData> barcodes(@Header("md-api-key") String apiKey, @Path("goodId") Long goodId);

    @POST("/stock/api/v1/good/{goodId}/barcode")
    Call<Barcode> createBarcode(@Header("md-api-key") String apiKey, @Body CBParam barcodeModel);

    @DELETE("/stock/api/v1/good/{goodId}/barcode/{barcodeId}")
    Call<String> deleteBarcode(@Header("md-api-key") String apiKey, @Path("goodId") Long goodId, @Path("barcodeId") Long barcodeId);

    @GET("/stock/api/v1/good/{goodId}/barcode")
    Call<Barcode> barcode(@Header("md-api-key") String apiKey, @Path("goodId") Long goodId, @Path("barcodeId") Long barcodeId);

    @PUT("/stock/api/v1/good/{goodId}/barcode/{barcodeId}")
    Call<Barcode> saveBarcode(@Header("md-api-key") String apiKey, @Path("goodId") Long goodId, @Path("barcodeId") Long barcodeId, @Body CBParam barcodeModel);

    @GET("/stock/api/v1/good")
    Call<GLData> goods(@Header("md-api-key") String apiKey);

    @GET("/stock/api/v1/good")
    Call<GLData> goods(@Header("md-api-key") String apiKey, @Query("pageNo") Integer pageNo);

    @GET("/stock/api/v1/good")
    Call<GLData> goods(@Header("md-api-key") String apiKey, @Query("pageNo") Integer pageNo, @Query("pageSize") Integer pageSize);

    @GET("/stock/api/v1/good")
    Call<GLData> goods(@Header("md-api-key") String apiKey, @Query("afterDate") String afterDate, @Query("pageNo") Integer pageNo, @Query("pageSize") Integer pageSize);

    @GET("/stock/api/v1/good")
    Call<GLData> goods(@Header("md-api-key") String apiKey, @Query("beforeDate") String beforeDate, @Query("afterDate") String afterDate, @Query("pageNo") Integer pageNo, @Query("pageSize") Integer pageSize);

    @GET("/stock/api/v1/good")
    Call<GLData> goods(@Header("md-api-key") String apiKey, @Query("name") String name, @Query("beforeDate") String beforeDate, @Query("afterDate") String afterDate, @Query("pageNo") Integer pageNo, @Query("pageSize") Integer pageSize);

    @POST("/stock/api/v1/good")
    Call<Good> createGood(@Header("md-api-key") String apiKey, @Body CGParam goodModel);

    @DELETE("/stock/api/v1/good/{id}")
    Call<String> deleteGood(@Header("md-api-key") String apiKey, @Path("id") Long id);

    @GET("/stock/api/v1/good/{id}")
    Call<Good> good(@Header("md-api-key") String apiKey, @Path("id") Long id);

    @PUT("/stock/api/v1/good/{goodId}/barcode/{barcodeId}")
    Call<Good> saveGood(@Header("md-api-key") String apiKey, @Path("id") Long id, @Body CGParam goodModel);

}
