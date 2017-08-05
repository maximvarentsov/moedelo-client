package org.moedelo.api.client.stock.impl;


import org.moedelo.api.client.stock.StockAPI;
import org.moedelo.api.client.stock.StockClient;
import org.moedelo.api.client.stock.entity.BLData;
import org.moedelo.api.client.stock.entity.Barcode;
import org.moedelo.api.client.stock.entity.CBParam;
import org.moedelo.api.client.stock.entity.CGParam;
import org.moedelo.api.client.stock.entity.CSParam;
import org.moedelo.api.client.stock.entity.CStock;
import org.moedelo.api.client.stock.entity.GLData;
import org.moedelo.api.client.stock.entity.Good;
import org.moedelo.api.client.stock.entity.SLData;

import java.io.IOException;

import lombok.AllArgsConstructor;
import retrofit2.Response;

@AllArgsConstructor
class StockClientImpl implements StockClient {

    private String apiKey;

    private StockAPI stockAPI;

    public StockAPI api() {
        return stockAPI;
    }

    public Response<SLData> list() throws IOException {
        return stockAPI.list(apiKey).execute();
    }

    public Response<SLData> list(Integer pageNo) throws IOException {
        return stockAPI.list(apiKey, pageNo).execute();
    }

    public Response<SLData> list(Integer pageNo, Integer pageSize) throws IOException {
        return stockAPI.list(apiKey, pageNo, pageSize).execute();
    }

    public Response<CStock> create(CSParam stockModel) throws IOException {
        return stockAPI.create(apiKey, stockModel).execute();
    }

    public Response<String> delete(Long id) throws IOException {
        return stockAPI.delete(apiKey, id).execute();
    }

    public Response<CStock> get(Long id) throws IOException {
        return stockAPI.get(apiKey, id).execute();
    }

    public Response<CStock> save(Long id, CSParam stockModel) throws IOException {
        return stockAPI.save(apiKey, id, stockModel).execute();
    }

    public Response<BLData> barcodes(Long goodId) throws IOException {
        return stockAPI.barcodes(apiKey, goodId).execute();
    }

    public Response<Barcode> createBarcode(CBParam barcodeModel) throws IOException {
        return stockAPI.createBarcode(apiKey, barcodeModel).execute();
    }

    public Response<String> deleteBarcode(Long goodId, Long barcodeId) throws IOException {
        return stockAPI.deleteBarcode(apiKey, goodId, barcodeId).execute();
    }

    public Response<Barcode> barcode(Long goodId, Long barcodeId) throws IOException {
        return stockAPI.barcode(apiKey, goodId, barcodeId).execute();
    }

    public Response<Barcode> saveBarcode(Long goodId, Long barcodeId, CBParam barcodeModel) throws IOException {
        return stockAPI.saveBarcode(apiKey, goodId, barcodeId, barcodeModel).execute();
    }

    public Response<GLData> goods() throws IOException {
        return stockAPI.goods(apiKey).execute();
    }

    public Response<GLData> goods(Integer pageNo) throws IOException {
        return stockAPI.goods(apiKey, pageNo).execute();
    }

    public Response<GLData> goods(Integer pageNo, Integer pageSize) throws IOException {
        return stockAPI.goods(apiKey, pageNo, pageSize).execute();
    }

    public Response<GLData> goods(String afterDate, Integer pageNo, Integer pageSize) throws IOException {
        return stockAPI.goods(apiKey, afterDate, pageNo, pageSize).execute();
    }

    public Response<GLData> goods(String beforeDate, String afterDate, Integer pageNo, Integer pageSize) throws IOException {
        return stockAPI.goods(apiKey, beforeDate, afterDate, pageNo, pageSize).execute();
    }

    public Response<GLData> goods(String name, String beforeDate, String afterDate, Integer pageNo, Integer pageSize) throws IOException {
        return stockAPI.goods(apiKey, name, beforeDate, afterDate, pageNo, pageSize).execute();
    }

    public Response<Good> createGood(CGParam goodModel) throws IOException {
        return stockAPI.createGood(apiKey, goodModel).execute();
    }

    public Response<String> deleteGood(Long id) throws IOException {
        return stockAPI.deleteGood(apiKey, id).execute();
    }

    public Response<Good> good(Long id) throws IOException {
        return stockAPI.good(apiKey, id).execute();
    }

    public Response<Good> saveGood(Long id, CGParam goodModel) throws IOException {
        return stockAPI.saveGood(apiKey, id, goodModel).execute();
    }
}
