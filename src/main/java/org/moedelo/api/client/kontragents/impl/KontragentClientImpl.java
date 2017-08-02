package org.moedelo.api.client.kontragents.impl;


import org.moedelo.api.client.kontragents.KontragentAPI;
import org.moedelo.api.client.kontragents.KontragentClient;
import org.moedelo.api.client.kontragents.entity.CKInnParam;
import org.moedelo.api.client.kontragents.entity.CKParam;
import org.moedelo.api.client.kontragents.entity.KLData;
import org.moedelo.api.client.kontragents.entity.Kontragent;

import java.io.IOException;

import lombok.AllArgsConstructor;
import retrofit2.Response;

@AllArgsConstructor
class KontragentClientImpl implements KontragentClient {

    private String apiKey;

    private KontragentAPI kontragentAPI;

    public KontragentAPI api() {
        return kontragentAPI;
    }

    public Response<KLData> list() throws IOException {
        return kontragentAPI.list(apiKey).execute();
    }

    public Response<KLData> list(Integer pageNo) throws IOException {
        return kontragentAPI.list(apiKey, pageNo).execute();
    }

    public Response<KLData> list(Integer pageNo, Integer pageSize) throws IOException {
        return kontragentAPI.list(apiKey, pageNo, pageSize).execute();
    }

    public Response<KLData> listByInn(String inn) throws IOException {
        return kontragentAPI.list(apiKey, inn).execute();
    }

    public Response<KLData> listByInn(String inn, Integer pageNo) throws IOException {
        return kontragentAPI.list(apiKey, inn, pageNo).execute();
    }

    public Response<KLData> listByInn(String inn, Integer pageNo, Integer pageSize) throws IOException {
        return kontragentAPI.list(apiKey, inn, pageNo, pageSize).execute();
    }

    public Response<KLData> list(String name) throws IOException {
        return kontragentAPI.list(apiKey, name).execute();
    }

    public Response<KLData> list(String name, Integer pageNo) throws IOException {
        return kontragentAPI.list(apiKey, name, pageNo).execute();
    }

    public Response<KLData> list(String name, Integer pageNo, Integer pageSize) throws IOException {
        return kontragentAPI.list(apiKey, name, pageNo, pageSize).execute();
    }

    public Response<Kontragent> create(CKParam kontragentModel) throws IOException {
        return kontragentAPI.create(apiKey, kontragentModel).execute();
    }

    public Response<String> delete(Long id) throws IOException {
        return kontragentAPI.delete(apiKey, id).execute();
    }

    public Response<KLData> get(Long id) throws IOException {
        return kontragentAPI.get(apiKey, id).execute();
    }

    public Response<Kontragent> save(Long id, CKParam kontragentModel) throws IOException {
        return kontragentAPI.save(apiKey, id, kontragentModel).execute();
    }

    public Response<Kontragent> create(CKInnParam kontragentModel) throws IOException {
        return kontragentAPI.create(apiKey, kontragentModel).execute();
    }
}
