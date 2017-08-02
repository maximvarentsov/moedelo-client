package org.moedelo.api.client.contract;


import org.moedelo.api.client.contract.entity.CCDataItem;
import org.moedelo.api.client.contract.entity.CCParam;
import org.moedelo.api.client.contract.entity.CLData;
import org.moedelo.api.client.contract.entity.CLDataItem;
import org.moedelo.api.client.contract.entity.CNLData;
import org.moedelo.api.client.contract.entity.CNParam;
import org.moedelo.api.client.contract.entity.CNote;
import org.moedelo.api.client.contract.entity.CSDataItem;

import java.io.IOException;

import retrofit2.Response;

public interface ContractClient {

    ContractAPI api() throws IOException;

    Response<CLData> list() throws IOException;

    Response<CLDataItem> get(Long id) throws IOException;

    Response<CCDataItem> create(CCParam contractModel) throws IOException;

    Response<String> delete(Long id) throws IOException;

    Response<CSDataItem> save(Long id, CCParam contractModel) throws IOException;

    Response<CNLData> notes(Long contractId) throws IOException;

    Response<CNote> createNote(Long contractId, CNParam noteModel) throws IOException;

    Response<String> deleteNote(Long contractId, Long noteId) throws IOException;

    Response<CNote> note(Long contractId, Long noteId) throws IOException;

    Response<CNote> saveNote(Long contractId, Long noteId, CNParam noteModel) throws IOException;
}
