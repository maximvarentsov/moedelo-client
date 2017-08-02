package org.moedelo.api.client.directory.impl;


import org.moedelo.api.client.directory.DirectoryAPI;
import org.moedelo.api.client.MDClientBuilder;
import org.moedelo.api.client.directory.DirectoryClient;

import lombok.Setter;
import lombok.experimental.Accessors;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;


@Setter
@Accessors(chain = true, fluent = true)
public class DirectoryClientBuilder extends MDClientBuilder {

    private String baseUrl;

    private String apiKey;

    private OkHttpClient httpClient;

    public DirectoryClient build() {

        if (httpClient == null) {
            httpClient = getOkHttpClient();
        }

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .client(httpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        DirectoryAPI directoryAPI = retrofit.create(DirectoryAPI.class);


        return new DirectoryClientImpl(apiKey, directoryAPI);
    }
}
