package org.moedelo.api.client.directory;


import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.moedelo.api.client.MDClientTest;
import org.moedelo.api.client.directory.entity.DLDataItem;
import org.moedelo.api.client.directory.impl.DirectoryClientBuilder;

import java.util.List;
import java.util.Properties;

import lombok.SneakyThrows;
import retrofit2.Response;


public class MDClientDirectoryTest extends MDClientTest {

    @SneakyThrows
    private DirectoryClient getDirectoryClient() {
        Properties properties = getProperties();

        return new DirectoryClientBuilder()
                .baseUrl(properties.getProperty("moedelo.baseurl"))
                .apiKey(properties.getProperty("moedelo.apikey"))
                .build();
    }

    @Test
    @Ignore
    @SneakyThrows
    public void testList() {

        DirectoryClient directoryClient = getDirectoryClient();

        Response<List<DLDataItem>> listDirectoryResponse = directoryClient.list();

        Assert.assertTrue(listDirectoryResponse.body().size() > 0);
    }

}
