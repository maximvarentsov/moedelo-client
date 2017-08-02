package org.moedelo.api.client.kontragents.impl;


import org.moedelo.api.client.MDClientBuilder;
import org.moedelo.api.client.kontragents.KontragentAPI;
import org.moedelo.api.client.kontragents.KontragentClient;

import lombok.Setter;
import lombok.experimental.Accessors;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;


@Setter
@Accessors(chain = true, fluent = true)
public class KontragentClientBuilder extends MDClientBuilder {

    private String baseUrl;

    private String apiKey;

    private OkHttpClient httpClient;

    public KontragentClient build() {

        if (httpClient == null) {
            httpClient = getOkHttpClient();
        }

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .client(httpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        KontragentAPI kontragentAPI = retrofit.create(KontragentAPI.class);


        return new KontragentClientImpl(apiKey, kontragentAPI);
    }
}
