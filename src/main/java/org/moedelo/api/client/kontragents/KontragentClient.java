package org.moedelo.api.client.kontragents;


import org.moedelo.api.client.kontragents.entity.CKInnParam;
import org.moedelo.api.client.kontragents.entity.CKParam;
import org.moedelo.api.client.kontragents.entity.KLData;
import org.moedelo.api.client.kontragents.entity.Kontragent;

import java.io.IOException;

import retrofit2.Response;

public interface KontragentClient {

    KontragentAPI api();

    Response<KLData> list() throws IOException;;

    Response<KLData> list(Integer pageNo) throws IOException;

    Response<KLData> list(Integer pageNo, Integer pageSize) throws IOException;

    Response<KLData> listByInn(String inn) throws IOException;

    Response<KLData> listByInn(String inn, Integer pageNo) throws IOException;

    Response<KLData> listByInn(String inn, Integer pageNo, Integer pageSize) throws IOException;

    Response<KLData> list(String name) throws IOException;

    Response<KLData> list(String name, Integer pageNo) throws IOException;

    Response<KLData> list(String name, Integer pageNo, Integer pageSize) throws IOException;

    Response<Kontragent> create(CKParam kontragentModel) throws IOException;

    Response<String> delete(Long id) throws IOException;

    Response<KLData> get(Long id) throws IOException;

    Response<Kontragent> save(Long id, CKParam kontragentModel) throws IOException;

    Response<Kontragent> create(CKInnParam model) throws IOException;
}
