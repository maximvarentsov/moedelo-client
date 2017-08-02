package org.moedelo.api.client;


import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

public class MDClientBuilder {

    public OkHttpClient getOkHttpClient() {

        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        return new OkHttpClient.Builder()
                .addInterceptor(logging)
                .build();

    }
}
