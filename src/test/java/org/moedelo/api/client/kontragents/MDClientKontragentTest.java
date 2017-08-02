package org.moedelo.api.client.kontragents;


import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.moedelo.api.client.MDClientTest;
import org.moedelo.api.client.kontragents.entity.KLData;
import org.moedelo.api.client.kontragents.impl.KontragentClientBuilder;

import java.util.Properties;

import lombok.SneakyThrows;
import retrofit2.Response;


public class MDClientKontragentTest extends MDClientTest {

    @SneakyThrows
    private KontragentClient getKontragentClient() {
        Properties properties = getProperties();

        return new KontragentClientBuilder()
                .baseUrl(properties.getProperty("moedelo.baseurl"))
                .apiKey(properties.getProperty("moedelo.apikey"))
                .build();
    }

    @Test
    @Ignore
    @SneakyThrows
    public void testList() {

        KontragentClient kontragentClient = getKontragentClient();

        Response<KLData> listKontragentsResponse = kontragentClient.list();

        Assert.assertTrue(listKontragentsResponse.body().resourceList.size() > 0);
    }

}
