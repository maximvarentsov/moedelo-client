package org.moedelo.api.client.contract;


import org.moedelo.api.client.contract.entity.CCDataItem;
import org.moedelo.api.client.contract.entity.CCParam;
import org.moedelo.api.client.contract.entity.CLData;
import org.moedelo.api.client.contract.entity.CLDataItem;
import org.moedelo.api.client.contract.entity.CNLData;
import org.moedelo.api.client.contract.entity.CNParam;
import org.moedelo.api.client.contract.entity.CNote;
import org.moedelo.api.client.contract.entity.CSDataItem;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ContractAPI {

    @GET("/contract/api/v1/contract")
    Call<CLData> list(@Header("md-api-key") String apiKey);

    @GET("/contract/api/v1/contract/{id}")
    Call<CLDataItem> get(@Header("md-api-key") String apiKey, @Path("id") Long id);

    @POST("/contract/api/v1/contract")
    Call<CCDataItem> create(@Header("md-api-key") String apiKey, @Body CCParam contractModel);

    @DELETE("/contract/api/v1/contract/{id}")
    Call<String> delete(@Header("md-api-key") String apiKey, @Path("id") Long id);

    @PUT("/contract/api/v1/contract/{id}")
    Call<CSDataItem> save(@Header("md-api-key") String apiKey, @Path("id") Long id, @Body CCParam contractModel);

    @GET("/contract/api/v1/contract/{contractId}/note")
    Call<CNLData> notes(@Header("md-api-key") String apiKey, @Path("contractId") Long contractId);

    @POST("/contract/api/v1/contract/{contractId}/note")
    Call<CNote> createNote(@Header("md-api-key") String apiKey, @Path("contractId") Long contractId, @Body CNParam noteModel);

    @DELETE("/contract/api/v1/contract/{contractId}/note/{noteId}")
    Call<String> deleteNote(@Header("md-api-key") String apiKey, @Path("contractId") Long contractId, @Path("noteId") Long noteId);

    @GET("/contract/api/v1/contract/{contractId}/note/{noteId}")
    Call<CNote> note(@Header("md-api-key") String apiKey, @Path("contractId") Long contractId, @Path("noteId") Long noteId);

    @PUT("/contract/api/v1/contract/{contractId}/note/{noteId}")
    Call<CNote> saveNote(@Header("md-api-key") String apiKey, @Path("contractId") Long contractId, @Path("noteId") Long noteId, @Body CNParam noteModel);

}
