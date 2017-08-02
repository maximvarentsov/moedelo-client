package org.moedelo.api.client.contract.impl;


import org.moedelo.api.client.contract.ContractAPI;
import org.moedelo.api.client.contract.ContractClient;
import org.moedelo.api.client.contract.entity.CCDataItem;
import org.moedelo.api.client.contract.entity.CCParam;
import org.moedelo.api.client.contract.entity.CLData;
import org.moedelo.api.client.contract.entity.CLDataItem;
import org.moedelo.api.client.contract.entity.CNLData;
import org.moedelo.api.client.contract.entity.CNParam;
import org.moedelo.api.client.contract.entity.CNote;
import org.moedelo.api.client.contract.entity.CSDataItem;

import java.io.IOException;

import lombok.AllArgsConstructor;
import retrofit2.Response;

@AllArgsConstructor
class ContractClientImpl implements ContractClient {

    private String apiKey;

    private ContractAPI contractAPI;

    public ContractAPI api() {
        return contractAPI;
    }

    public Response<CLData> list() throws IOException {
        return contractAPI.list(apiKey).execute();
    }

    public Response<CLDataItem> get(Long id) throws IOException {
        return contractAPI.get(apiKey, id).execute();
    }

    public Response<CCDataItem> create(CCParam contractModel) throws IOException {
        return contractAPI.create(apiKey, contractModel).execute();
    }

    public Response<String> delete(Long id) throws IOException {
        return contractAPI.delete(apiKey, id).execute();
    }

    public Response<CSDataItem> save(Long id, CCParam contractModel) throws IOException {
        return contractAPI.save(apiKey, id, contractModel).execute();
    }

    public Response<CNLData> notes(Long contractId) throws IOException {
        return contractAPI.notes(apiKey, contractId).execute();
    }

    public Response<CNote> createNote(Long contractId, CNParam noteModel) throws IOException {
        return contractAPI.createNote(apiKey, contractId, noteModel).execute();
    }

    public Response<String> deleteNote(Long contractId, Long noteId) throws IOException {
        return contractAPI.deleteNote(apiKey, contractId, noteId).execute();
    }

    public Response<CNote> note(Long contractId, Long noteId) throws IOException {
        return contractAPI.note(apiKey, contractId, noteId).execute();
    }

    public Response<CNote> saveNote(Long contractId, Long noteId, CNParam noteModel) throws IOException {
        return contractAPI.saveNote(apiKey, contractId, noteId, noteModel).execute();
    }
}
