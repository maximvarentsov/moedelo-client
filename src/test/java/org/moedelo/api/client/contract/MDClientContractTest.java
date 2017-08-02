package org.moedelo.api.client.contract;


import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.moedelo.api.client.MDClientTest;
import org.moedelo.api.client.contract.entity.CCDataItem;
import org.moedelo.api.client.contract.entity.CCParam;
import org.moedelo.api.client.contract.entity.CLData;
import org.moedelo.api.client.contract.entity.CLDataItem;
import org.moedelo.api.client.contract.entity.CNParam;
import org.moedelo.api.client.contract.entity.CNote;
import org.moedelo.api.client.contract.entity.CSDataItem;
import org.moedelo.api.client.contract.impl.ContractClientBuilder;

import java.math.BigDecimal;
import java.util.Properties;

import lombok.SneakyThrows;
import retrofit2.Response;


public class MDClientContractTest extends MDClientTest {

    @SneakyThrows
    private ContractClient getContractClient() {
        Properties properties = getProperties();

        return new ContractClientBuilder()
                .baseUrl(properties.getProperty("moedelo.baseurl"))
                .apiKey(properties.getProperty("moedelo.apikey"))
                .build();
    }

    @Test
    @Ignore
    @SneakyThrows
    public void testContractList() {
        ContractClient contractClient = getContractClient();
        Response<CLData> listContractsResponse = contractClient.list();
        Assert.assertTrue(listContractsResponse.body().resourceList.size() > 0);
    }

    @Test
    @Ignore
    @SneakyThrows
    public void testCreateContract() {

        ContractClient contractClient = getContractClient();

        CCParam contractModel = new CCParam("23423SDF", null, new BigDecimal(100), false, 0, 0L, 0);
        Response<CCDataItem> createContractResponse = contractClient.create(contractModel);

        Assert.assertTrue(createContractResponse.body().id > 0L);
    }

    @Test
    @Ignore
    @SneakyThrows
    public void testDeleteContract() {

        ContractClient contractClient = getContractClient();

        Response<CCDataItem> createContractResponse = null;
        CCParam contractModel = new CCParam("23423SDF", null, new BigDecimal(100), false, 0, 0L, 0);
        createContractResponse = contractClient.create(contractModel);

        Assert.assertTrue(createContractResponse.body().id > 0L);

        Integer numberOfContracts = 0;
        Response<CLData> listContractsResponse = contractClient.list();
        numberOfContracts = listContractsResponse.body().resourceList.size();

        Assert.assertTrue(numberOfContracts > 0);

        Long contractId = listContractsResponse.body().resourceList.get(numberOfContracts - 1).id;
        Response<String> deleteResponse = contractClient.delete(contractId);

        Assert.assertTrue(deleteResponse != null);
    }

    @Test
    @Ignore
    @SneakyThrows
    public void testSaveContract() {

        ContractClient contractClient = getContractClient();

        CCParam contractModel = new CCParam("23423SDF", null, new BigDecimal(100), false, 0, 0L, 0);
        Response<CCDataItem> createContractResponse = contractClient.create(contractModel);

        Assert.assertTrue(createContractResponse.body().id > 0L);

        CCParam extContractModel = new CCParam("23423SDF", null, new BigDecimal(150), false, 0, 0L, 0);
        Response<CSDataItem> saveContractResponse = contractClient.save(createContractResponse.body().id, extContractModel);

        Response<CLDataItem> getContractResponse = contractClient.get(createContractResponse.body().id);

        Assert.assertEquals(getContractResponse.body().id, saveContractResponse.body().id);
    }

    @Test
    @Ignore
    @SneakyThrows
    public void testCreateAndGetNote() {

        ContractClient contractClient = getContractClient();

        CCParam contractModel = new CCParam("23423SDF", null, new BigDecimal(100), false, 0, 0L, 0);
        Response<CCDataItem> createContractResponse = contractClient.create(contractModel);

        Assert.assertTrue(createContractResponse.body().id > 0L);

        String noteText = "some node";
        CNParam noteModel = new CNParam(null, noteText, false);
        Response<CNote> createNoteResponse = contractClient.createNote(createContractResponse.body().id, noteModel);

        Assert.assertEquals(createNoteResponse.body().text, noteText);

        Response<CNote> getNoteResponse = contractClient.note(createContractResponse.body().id, createNoteResponse.body().id);

        Assert.assertEquals(getNoteResponse.body().text, noteText);
    }

}

