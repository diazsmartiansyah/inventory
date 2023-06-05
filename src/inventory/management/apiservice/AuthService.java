/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventory.management.apiservice;

import inventory.management.apiinterface.AuthInterface;
import inventory.management.apirequest.AuthRequest;
import inventory.management.apiresponse.ApiResponse;
import inventory.management.apiroutes.StoreMasterRoute;
import inventory.management.helper.ApiHelper;
import inventory.management.model.User;
import inventory.management.helper.RetrofitHelper;
import inventory.management.model.Token;
import retrofit2.Call;
import retrofit2.Retrofit;

/**
 *
 * @author a_taupik_r
 */
public class AuthService implements AuthInterface {
    
    private RetrofitHelper retrofitHelper;
    private Retrofit retrofit;
    private StoreMasterRoute route;

    public AuthService() {
        retrofitHelper = new RetrofitHelper();
        retrofit = retrofitHelper.getInstance();
        route = retrofit.create(StoreMasterRoute.class);
    }

    @Override
    public Token login(String username, String password) {
        AuthRequest loginRequest = new AuthRequest(username, password);
        Call<ApiResponse> call = route.login(loginRequest);
        ApiResponse response = ApiHelper.hitApi(call);
        Token token = (Token) response.getData();
        
        return token;
    }

    @Override
    public User getUserByToken(String token) {
        Call<ApiResponse> call = route.getUser();
        ApiResponse response = ApiHelper.hitApi(call);
        User user = (User) response.getData();
        
        return user;
    }

    @Override
    public boolean logout(String token) {
        Call<ApiResponse> call = route.logout();
        ApiResponse response = ApiHelper.hitApi(call);
        return response.isStatus();
    }
}
