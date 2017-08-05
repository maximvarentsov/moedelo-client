package org.moedelo.api.client.stock;


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

import retrofit2.Response;

public interface StockClient {

    StockAPI api();

    Response<SLData> list() throws IOException;;

    Response<SLData> list(Integer pageNo) throws IOException;

    Response<SLData> list(Integer pageNo, Integer pageSize) throws IOException;

    Response<CStock> create(CSParam stockModel) throws IOException;

    Response<String> delete(Long id) throws IOException;

    Response<CStock> get(Long id) throws IOException;

    Response<CStock> save(Long id, CSParam stockModel) throws IOException;

    Response<BLData> barcodes(Long goodId) throws IOException;

    Response<Barcode> createBarcode(CBParam barcodeModel) throws IOException;

    Response<String> deleteBarcode(Long goodId, Long barcodeId) throws IOException;

    Response<Barcode> barcode(Long goodId, Long barcodeId) throws IOException;

    Response<Barcode> saveBarcode(Long goodId, Long barcodeId, CBParam barcodeModel) throws IOException;

    Response<GLData> goods() throws IOException;

    Response<GLData> goods(Integer pageNo) throws IOException;

    Response<GLData> goods(Integer pageNo, Integer pageSize) throws IOException;

    Response<GLData> goods(String afterDate, Integer pageNo, Integer pageSize) throws IOException;

    Response<GLData> goods(String beforeDate, String afterDate, Integer pageNo, Integer pageSize) throws IOException;

    Response<GLData> goods(String name, String beforeDate, String afterDate, Integer pageNo, Integer pageSize) throws IOException;

    Response<Good> createGood(CGParam goodModel) throws IOException;

    Response<String> deleteGood(Long id) throws IOException;

    Response<Good> good(Long id) throws IOException;

    Response<Good> saveGood(Long id, CGParam goodModel) throws IOException;
}
