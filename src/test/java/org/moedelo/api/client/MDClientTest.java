package org.moedelo.api.client;



import java.io.InputStream;
import java.util.Properties;

import lombok.SneakyThrows;

import static org.junit.Assert.fail;


public class MDClientTest {

    @SneakyThrows
    protected Properties getProperties() {
        try {
            Properties properties = new Properties();
            InputStream in = getClass().getResourceAsStream("/moedelo.properties");
            properties.load(in);
            in.close();
            return properties;
        } catch (Exception e) {
            fail("Failed to load amocrm client properties: " + e.getMessage());
        }
        return null;
    }

}
