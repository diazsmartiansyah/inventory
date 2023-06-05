/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventory.management.helper;

import inventory.management.enviroment.StoreMaster;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
/**
 *
 * @author a_taupik_r
 */
public class RetrofitHelper {
    public Retrofit getInstance() {
        Retrofit retrofit = new Retrofit.Builder()
        .baseUrl(StoreMaster.apiUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .client(getOkHttpClient(StoreMaster.bearerToken))
        .build();
        
        return retrofit;
    }
   
   public OkHttpClient getOkHttpClient(String token) {
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(new BearerTokenInterceptor(token));
        
        return httpClient.build();
    }
}
