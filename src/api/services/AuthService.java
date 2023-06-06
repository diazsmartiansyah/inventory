/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package api.services;

import api.interfaces.AuthInterface;
import api.requests.AuthRequest;
import api.responses.ApiResponse;
import api.routes.StoreMasterRoute;
import app.helpers.ApiHelper;
import app.models.User;
import app.helpers.RetrofitHelper;
import app.models.Token;
import com.google.gson.Gson;
import retrofit2.Call;
import retrofit2.Retrofit;

/**
 *
 * @author kelompok_4_pbo
 */
public class AuthService implements AuthInterface {
    
    private final RetrofitHelper retrofitHelper;
    private final Retrofit retrofit;
    private final StoreMasterRoute route;

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
        Gson gson = new Gson();
        Token token = (Token) response.getData(Token.class);
        System.out.println("Debbug : " + token.getUser().getName());
//        Token token = (Token) response.getData();
        
        return token;
    }

    @Override
    public User getUserByToken(String token) {
        Call<ApiResponse> call = route.getUser();
        ApiResponse response = ApiHelper.hitApi(call);
        User user = (User) response.getData(User.class);
        
        return user;
    }

    @Override
    public boolean logout(String token) {
        Call<ApiResponse> call = route.logout();
        ApiResponse response = ApiHelper.hitApi(call);
        return response.isStatus();
    }
}
