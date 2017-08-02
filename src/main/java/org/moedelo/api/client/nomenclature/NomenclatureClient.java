package org.moedelo.api.client.nomenclature;


import org.moedelo.api.client.nomenclature.entity.NLData;

import java.io.IOException;

import retrofit2.Response;


public interface NomenclatureClient {

    NomenclatureAPI api();

    Response<NLData> list() throws IOException;
}
