package org.moedelo.api.client.directory;


import org.moedelo.api.client.contract.entity.CLDataItem;
import org.moedelo.api.client.directory.entity.DLDataItem;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface DirectoryAPI {

    @GET("/accounting/api/v1/directory/services")
    Call<List<DLDataItem>> list(@Header("md-api-key") String apiKey, @Query("query") String query, @Query("count") int count);

    @GET("/accounting/api/v1/directory/services")
    Call<List<DLDataItem>> list(@Header("md-api-key") String apiKey, @Query("query") String query);

    @GET("/accounting/api/v1/directory/services")
    Call<List<DLDataItem>> list(@Header("md-api-key") String apiKey);
}
