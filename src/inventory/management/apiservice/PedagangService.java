/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventory.management.apiservice;

import inventory.management.apiinterface.PedagangInterface;
import inventory.management.apiresponse.ApiResponse;
import inventory.management.apiroutes.StoreMasterRoute;
import inventory.management.helper.ApiHelper;
import inventory.management.helper.RetrofitHelper;
import inventory.management.model.Barang;
import inventory.management.model.Pedagang;
import retrofit2.Call;
import retrofit2.Retrofit;

/**
 *
 * @author a_taupik_r
 */
public class PedagangService implements PedagangInterface {
    private RetrofitHelper retrofitHelper;
    private Retrofit retrofit;
    private StoreMasterRoute route;

    public PedagangService() {
        retrofitHelper = new RetrofitHelper();
        retrofit = retrofitHelper.getInstance();
        route = retrofit.create(StoreMasterRoute.class);
    }
    
    @Override
    public Pedagang getDetail(int id) {
        Call<ApiResponse> call = route.detailPedagang(id);
        ApiResponse response = ApiHelper.hitApi(call);
        Pedagang pedagang = (Pedagang) response.getData();

        return pedagang;
    }
    
}
