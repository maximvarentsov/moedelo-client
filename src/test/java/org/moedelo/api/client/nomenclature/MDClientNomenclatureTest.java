package org.moedelo.api.client.nomenclature;




import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.moedelo.api.client.MDClientTest;
import org.moedelo.api.client.nomenclature.entity.NLData;
import org.moedelo.api.client.nomenclature.impl.NomenclatureClientBuilder;

import java.util.Properties;

import lombok.SneakyThrows;
import retrofit2.Response;


public class MDClientNomenclatureTest extends MDClientTest {

    @SneakyThrows
    private NomenclatureClient getNomenclatureClient() {
        Properties properties = getProperties();

        return new NomenclatureClientBuilder()
                .baseUrl(properties.getProperty("moedelo.baseurl"))
                .apiKey(properties.getProperty("moedelo.apikey"))
                .build();
    }

    @Test
    @Ignore
    @SneakyThrows
    public void testList() {

        NomenclatureClient nomenclatureClient = getNomenclatureClient();
        Response<NLData> listNomenclatureResponse = nomenclatureClient.list();
        Assert.assertTrue(listNomenclatureResponse.body().resourceList.size() > 0);
    }

    // :TODO test get()

}
