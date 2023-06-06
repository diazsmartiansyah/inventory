/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package api.services;

import api.requests.BarangRequest;
import api.responses.ApiResponse;
import api.responses.DatatableResponse;
import api.routes.StoreMasterRoute;
import app.helpers.ApiHelper;
import app.helpers.RetrofitHelper;
import app.models.Barang;
import retrofit2.Call;
import retrofit2.Retrofit;
import api.interfaces.BarangInterface;

/**
 *
 * @author kelompok_4_pbo
 */
public class BarangService implements BarangInterface {
    private final RetrofitHelper retrofitHelper;
    private final Retrofit retrofit;
    private final StoreMasterRoute route;

    public BarangService() {
        retrofitHelper = new RetrofitHelper();
        retrofit = retrofitHelper.getInstance();
        route = retrofit.create(StoreMasterRoute.class);
    }
    
    @Override
    public Barang[] getList(BarangRequest barangRequest) {
        Call<DatatableResponse> call = route.getListBarang(barangRequest);
        DatatableResponse response = ApiHelper.hitApi(call, true);
        Object[] listObject = response.getData(Barang.class);
        Barang[] listBarang = new Barang[listObject.length];
        int i = 0;
        for(Object obj: listObject) {
            listBarang[i] = (Barang) obj;
            i++;
        }
        return listBarang;
    }
    
    @Override
    public Barang store(BarangRequest barangRequest) {
        Call<ApiResponse> call = route.storeBarang(barangRequest);
        ApiResponse response = ApiHelper.hitApi(call);
        Barang barang = (Barang) response.getData(Barang.class);

        return barang;
    }

    @Override
    public Barang update(BarangRequest barangRequest) {
        Call<ApiResponse> call = route.updateBarang(barangRequest, barangRequest.getId());
        ApiResponse response = ApiHelper.hitApi(call);
        Barang barang = (Barang) response.getData(Barang.class);

        return barang;
    }

    @Override
    public boolean delete(int id) {
        Call<ApiResponse> call = route.deleteBarang(id);
        ApiResponse response = ApiHelper.hitApi(call);

        return response.isStatus();
    }

    @Override
    public Barang getDetail(int id) {
        Call<ApiResponse> call = route.detailBarang(id);
        ApiResponse response = ApiHelper.hitApi(call);
        Barang barang = (Barang) response.getData(Barang.class);

        return barang;
    }
}
