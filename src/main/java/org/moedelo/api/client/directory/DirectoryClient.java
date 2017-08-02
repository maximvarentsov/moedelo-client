package org.moedelo.api.client.directory;



import org.moedelo.api.client.directory.entity.DLDataItem;

import java.io.IOException;
import java.util.List;

import retrofit2.Response;

public interface DirectoryClient {

    DirectoryAPI api();

    Response<List<DLDataItem>> list(String query, int count) throws IOException;

    Response<List<DLDataItem>> list(String query) throws IOException;

    Response<List<DLDataItem>> list() throws IOException;
}
