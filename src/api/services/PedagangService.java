/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package api.services;

import api.interfaces.PedagangInterface;
import api.requests.PedagangRequest;
import api.responses.ApiResponse;
import api.routes.StoreMasterRoute;
import app.helpers.ApiHelper;
import app.helpers.RetrofitHelper;
import app.models.Pedagang;
import retrofit2.Call;
import retrofit2.Retrofit;

/**
 *
 * @author kelompok_4_pbo
 */
public class PedagangService implements PedagangInterface {
    private final RetrofitHelper retrofitHelper;
    private final Retrofit retrofit;
    private final StoreMasterRoute route;

    public PedagangService() {
        retrofitHelper = new RetrofitHelper();
        retrofit = retrofitHelper.getInstance();
        route = retrofit.create(StoreMasterRoute.class);
    }
    
    @Override
    public Pedagang getDetail(int id) {
        Call<ApiResponse> call = route.detailPedagang(id);
        ApiResponse response = ApiHelper.hitApi(call);
        Pedagang pedagang = (Pedagang) response.getData(Pedagang.class);

        return pedagang;
    }

    @Override
    public Pedagang updateProfile(PedagangRequest pedagangRequest) {
        Call<ApiResponse> call = route.updatePedagang(pedagangRequest, pedagangRequest.getId());
        ApiResponse response = ApiHelper.hitApi(call);
        Pedagang pedagang = (Pedagang) response.getData(Pedagang.class);
        
        return pedagang;
    }
    
}
