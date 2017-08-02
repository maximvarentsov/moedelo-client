package org.moedelo.api.client.nomenclature;


import org.moedelo.api.client.nomenclature.entity.NLData;
import org.moedelo.api.client.nomenclature.entity.NLDataItem;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;

public interface NomenclatureAPI {

    @GET("/accounting/api/v1/nomenclature")
    Call<NLData> list(@Header("md-api-key") String apiKey);

    @GET("/accounting/api/v1/nomenclature/{id}")
    Call<NLDataItem> get(@Header("md-api-key") String apiKey, @Path("id") Long id);

}
