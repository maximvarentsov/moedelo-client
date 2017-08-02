package org.moedelo.api.client.nomenclature;




import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.moedelo.api.client.MDClientTest;
import org.moedelo.api.client.nomenclature.entity.NLDataItem;
import org.moedelo.api.client.nomenclature.impl.NomenclatureClientBuilder;

import java.io.IOException;
import java.util.List;
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
    public void testList() {

        NomenclatureClient nomenclatureClient = getNomenclatureClient();
        Response<List<NLDataItem>> listNomenclatureResponse = null;
        try {
            listNomenclatureResponse = nomenclatureClient.list();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(listNomenclatureResponse.body().size() > 0);
    }

    // :TODO test get()

}
