/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.helpers;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import okhttp3.Interceptor;
import okhttp3.Response;
import okhttp3.Request;
import okio.Buffer;
import okio.Utf8;

/**
 *
 * @author kelompok_4_pbo
 */
public class BearerTokenInterceptor implements Interceptor {
    private String token;
    
    public BearerTokenInterceptor(String token) {
        this.token = token;
    }
    
    @Override
    public Response intercept(Chain chain) throws IOException {
//        Request request = chain.request();
//
//        // Log the request URL and method
//        System.out.println("--> " + request.method() + " " + request.url());
//
//        // Log the request headers
//        request.headers().names().forEach(name ->
//                System.out.println(name + ": " + request.headers().get(name))
//        );
//
//        // Log the request body (if any)
//        if (request.body() != null) {
//            Buffer buffer = new Buffer();
//            request.body().writeTo(buffer);
//            System.out.println(buffer.readString(StandardCharsets.UTF_8));
//        }
//
//        // Proceed with the request
//        Response response = chain.proceed(request);
//
//        // Log the response status
//        System.out.println("<-- " + response.code() + " " + response.message());
//
//        // Log the response headers
//        response.headers().names().forEach(name ->
//                System.out.println(name + ": " + response.headers().get(name))
//        );
//        
//        response.close();
        
        Request originalRequest = chain.request();
        Request modifiedRequest = originalRequest.newBuilder()
                .header("Authorization", "Bearer " + token)
                .build();
        
        return chain.proceed(modifiedRequest);
    }
    
}
