/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package api.services;

import api.interfaces.SchedullingInterface;
import api.requests.SchedullingRequest;
import api.responses.ApiResponse;
import api.responses.DatatableResponse;
import api.routes.StoreMasterRoute;
import app.helpers.ApiHelper;
import app.helpers.RetrofitHelper;
import app.models.Notes;
import app.models.Schedulling;
import retrofit2.Call;
import retrofit2.Retrofit;

/**
 *
 * @author kelompok_4_pbo
 */
public class SchedullingService implements SchedullingInterface {
    private final RetrofitHelper retrofitHelper;
    private final Retrofit retrofit;
    private final StoreMasterRoute route;

    public SchedullingService() {
        retrofitHelper = new RetrofitHelper();
        retrofit = retrofitHelper.getInstance();
        route = retrofit.create(StoreMasterRoute.class);
    }
    
    @Override
    public Schedulling[] getList(SchedullingRequest schedullingRequest) {
        Call<DatatableResponse> call = route.getListSchedulling(schedullingRequest);
        DatatableResponse response = ApiHelper.hitApi(call, true);
        Object[] listObject = response.getData(Schedulling.class);
        Schedulling[] listSchedulling = new Schedulling[listObject.length];
        
        for(int i = 0 ; i < listObject.length; i++) {
            listSchedulling[i] = (Schedulling) listObject[i];
        }
        
        return listSchedulling;
    }
    
    @Override
    public Schedulling store(SchedullingRequest schedullingRequest) {
        Call<ApiResponse> call = route.storeSchedulling(schedullingRequest);
        ApiResponse response = ApiHelper.hitApi(call);
        Schedulling schedulling = (Schedulling) response.getData(Schedulling.class);

        return schedulling;
    }

    @Override
    public Schedulling update(SchedullingRequest schedullingRequest) {
        Call<ApiResponse> call = route.updateSchedulling(schedullingRequest, schedullingRequest.getId());
        ApiResponse response = ApiHelper.hitApi(call);
        Schedulling schedulling = (Schedulling) response.getData(Schedulling.class);

        return schedulling;
    }

    @Override
    public boolean delete(int id) {
        Call<ApiResponse> call = route.deleteNotes(id);
        ApiResponse response = ApiHelper.hitApi(call);

        return response.isStatus();
    }

    @Override
    public Schedulling getDetail(int id) {
        Call<ApiResponse> call = route.detailNotes(id);
        ApiResponse response = ApiHelper.hitApi(call);
        Schedulling schedulling = (Schedulling) response.getData(Schedulling.class);

        return schedulling;
    }
    
}
