/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventory.management.helper;

import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Response;
import okhttp3.Request;

/**
 *
 * @author a_taupik_r
 */
public class BearerTokenInterceptor implements Interceptor {
    private String token;
    
    public BearerTokenInterceptor(String token) {
        this.token = token;
    }
    
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request originalRequest = chain.request();
        Request modifiedRequest = originalRequest.newBuilder()
                .header("Authorization", "Bearer " + token)
                .build();
        
        return chain.proceed(modifiedRequest);
    }
    
}
