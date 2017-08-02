package org.moedelo.api.client.kontragents;


import org.moedelo.api.client.accounting.entity.COData;
import org.moedelo.api.client.accounting.entity.COParam;
import org.moedelo.api.client.directory.entity.DLDataItem;
import org.moedelo.api.client.kontragents.entity.CKInnParam;
import org.moedelo.api.client.kontragents.entity.CKParam;
import org.moedelo.api.client.kontragents.entity.KLData;
import org.moedelo.api.client.kontragents.entity.Kontragent;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface KontragentAPI {

    @GET("/kontragents/api/v1/kontragent")
    Call<KLData> list(@Header("md-api-key") String apiKey);

    @GET("/kontragents/api/v1/kontragent")
    Call<KLData> list(@Header("md-api-key") String apiKey, @Query("pageNo") Integer pageNo);

    @GET("/kontragents/api/v1/kontragent")
    Call<KLData> list(@Header("md-api-key") String apiKey, @Query("pageNo") Integer pageNo, @Query("pageSize") Integer pageSize);

    @GET("/kontragents/api/v1/kontragent")
    Call<KLData> listByInn(@Header("md-api-key") String apiKey, @Query("inn") String inn);

    @GET("/kontragents/api/v1/kontragent")
    Call<KLData> listByInn(@Header("md-api-key") String apiKey, @Query("inn") String inn, @Query("pageNo") Integer pageNo);

    @GET("/kontragents/api/v1/kontragent")
    Call<KLData> listByInn(@Header("md-api-key") String apiKey, @Query("inn") String inn, @Query("pageNo") Integer pageNo, @Query("pageSize") Integer pageSize);

    @GET("/kontragents/api/v1/kontragent")
    Call<KLData> list(@Header("md-api-key") String apiKey, @Query("name") String name);

    @GET("/kontragents/api/v1/kontragent")
    Call<KLData> list(@Header("md-api-key") String apiKey, @Query("name") String name, @Query("pageNo") Integer pageNo);

    @GET("/kontragents/api/v1/kontragent")
    Call<KLData> list(@Header("md-api-key") String apiKey, @Query("name") String name, @Query("pageNo") Integer pageNo, @Query("pageSize") Integer pageSize);

    @POST("/kontragents/api/v1/kontragent")
    Call<Kontragent> create(@Header("md-api-key") String apiKey, @Body CKParam kontragentModel);

    @DELETE("/kontragents/api/v1/kontragent/{id}")
    Call<String> delete(@Header("md-api-key") String apiKey, @Path("id") Long id);

    @GET("/kontragents/api/v1/kontragent/{id}")
    Call<KLData> get(@Header("md-api-key") String apiKey, @Path("id") Long id);

    @PUT("/kontragents/api/v1/kontragent/{id}")
    Call<Kontragent> save(@Header("md-api-key") String apiKey, @Path("id") Long id, @Body CKParam kontragentModel);

    @POST("/kontragents/api/v1/kontragent/inn")
    Call<Kontragent> create(@Header("md-api-key") String apiKey, @Body CKInnParam model);
}
