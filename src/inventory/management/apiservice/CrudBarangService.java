/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventory.management.apiservice;

import inventory.management.apiinterface.CrudBarangInterface;
import inventory.management.apirequest.AuthRequest;
import inventory.management.apirequest.BarangRequest;
import inventory.management.apiresponse.ApiResponse;
import inventory.management.apiresponse.DatatableResponse;
import inventory.management.apiroutes.StoreMasterRoute;
import inventory.management.helper.ApiHelper;
import inventory.management.helper.RetrofitHelper;
import inventory.management.model.Barang;
import inventory.management.model.Datatable;
import retrofit2.Call;
import retrofit2.Retrofit;

/**
 *
 * @author a_taupik_r
 */
public class CrudBarangService implements CrudBarangInterface {
    private RetrofitHelper retrofitHelper;
    private Retrofit retrofit;
    private StoreMasterRoute route;

    public CrudBarangService() {
        retrofitHelper = new RetrofitHelper();
        retrofit = retrofitHelper.getInstance();
        route = retrofit.create(StoreMasterRoute.class);
    }
    
    @Override
    public Barang[] getList(BarangRequest barangRequest) {
        Call<DatatableResponse> call = route.getListBarang(barangRequest);
        DatatableResponse response = ApiHelper.hitApi(call, true);
        Barang[] listBarang = (Barang[]) response.getData();

        return listBarang;
    }
    
    @Override
    public Barang store(BarangRequest barangRequest) {
        Call<ApiResponse> call = route.storeBarang(barangRequest);
        ApiResponse response = ApiHelper.hitApi(call);
        Barang barang = (Barang) response.getData();

        return barang;
    }

    @Override
    public Barang update(BarangRequest barangRequest) {
        Call<ApiResponse> call = route.updateBarang(barangRequest, barangRequest.getId());
        ApiResponse response = ApiHelper.hitApi(call);
        Barang barang = (Barang) response.getData();

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
        Barang barang = (Barang) response.getData();

        return barang;
    }
}
