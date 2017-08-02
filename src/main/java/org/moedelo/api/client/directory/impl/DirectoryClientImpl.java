package org.moedelo.api.client.directory.impl;


import org.moedelo.api.client.directory.DirectoryAPI;
import org.moedelo.api.client.directory.DirectoryClient;
import org.moedelo.api.client.directory.entity.DLDataItem;

import java.io.IOException;
import java.util.List;

import lombok.AllArgsConstructor;
import retrofit2.Response;

@AllArgsConstructor
class DirectoryClientImpl implements DirectoryClient {

    private String apiKey;

    private DirectoryAPI directoryAPI;

    public DirectoryAPI api() {
        return directoryAPI;
    }

    public Response<List<DLDataItem>> list() throws IOException {
        return directoryAPI.list(apiKey).execute();
    }

    public Response<List<DLDataItem>> list(String query) throws IOException {
        return directoryAPI.list(apiKey, query).execute();
    }

    public Response<List<DLDataItem>> list(String query, int count) throws IOException {
        return directoryAPI.list(apiKey, query, count).execute();
    }


}
