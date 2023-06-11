/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package api.services;

import api.interfaces.TransaksiInterface;
import api.requests.TransaksiRequest;
import api.responses.DatatableResponse;
import api.routes.StoreMasterRoute;
import app.helpers.ApiHelper;
import app.helpers.RetrofitHelper;
import app.models.Schedulling;
import app.models.Transaksi;
import retrofit2.Call;
import retrofit2.Retrofit;

/**
 *
 * @author a_taupik_r
 */
public class TransaksiService implements TransaksiInterface{

    private final RetrofitHelper retrofitHelper;
    private final Retrofit retrofit;
    private final StoreMasterRoute route;

    public TransaksiService() {
        retrofitHelper = new RetrofitHelper();
        retrofit = retrofitHelper.getInstance();
        route = retrofit.create(StoreMasterRoute.class);
    }
    
    @Override
    public Transaksi[] getList(TransaksiRequest TransaksiRequest) {
        Call<DatatableResponse> call = route.getListTransaksi(TransaksiRequest);
        DatatableResponse response = ApiHelper.hitApi(call, true);
        Object[] listObject = response.getData(Transaksi.class);
        Transaksi[] listTransaksi = new Transaksi[listObject.length];
        
        for(int i = 0 ; i < listObject.length; i++) {
            listTransaksi[i] = (Transaksi) listObject[i];
        }
        
        return listTransaksi;
    }

    @Override
    public Transaksi store(TransaksiRequest TransaksiRequest) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Transaksi update(TransaksiRequest TransaksiRequest) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Transaksi getDetail(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
