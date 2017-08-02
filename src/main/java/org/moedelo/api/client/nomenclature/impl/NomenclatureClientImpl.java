package org.moedelo.api.client.nomenclature.impl;


import org.moedelo.api.client.directory.DirectoryAPI;
import org.moedelo.api.client.nomenclature.NomenclatureAPI;
import org.moedelo.api.client.nomenclature.NomenclatureClient;
import org.moedelo.api.client.nomenclature.entity.NLData;
import org.moedelo.api.client.nomenclature.entity.NLDataItem;

import java.io.IOException;
import java.util.List;

import lombok.AllArgsConstructor;
import retrofit2.Response;

@AllArgsConstructor
class NomenclatureClientImpl implements NomenclatureClient {

    private String apiKey;

    private NomenclatureAPI nomenclatureAPI;

    public NomenclatureAPI api() {
        return nomenclatureAPI;
    }

    public Response<NLData> list() throws IOException {
        return nomenclatureAPI.list(apiKey).execute();
    }

    public Response<NLDataItem> get(Long id) throws IOException {
        return nomenclatureAPI.get(apiKey, id).execute();
    }

}
