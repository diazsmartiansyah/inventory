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
        
        Request originalRequest = chain.request();
        Request modifiedRequest = originalRequest.newBuilder()
                .header("Authorization", "Bearer " + SessionHelper.getCurrentToken())
                .build();

        // Log the request URL and method
        System.out.println("--> " + modifiedRequest.method() + " " + modifiedRequest.url());

        // Log the request headers
        modifiedRequest.headers().names().forEach(name ->
                System.out.println(name + ": " + modifiedRequest.headers().get(name))
        );

        // Log the request body (if any)
        if (modifiedRequest.body() != null) {
            Buffer buffer = new Buffer();
            modifiedRequest.body().writeTo(buffer);
            System.out.println(buffer.readString(StandardCharsets.UTF_8));
        }

        // Proceed with the request
        Response response = chain.proceed(modifiedRequest);

        // Log the response status
        System.out.println("<-- " + response.code() + " " + response.message());

        // Log the response headers
        response.headers().names().forEach(name ->
                System.out.println(name + ": " + response.headers().get(name))
        );
        
        response.close();
        
        return chain.proceed(modifiedRequest);
    }
    
}
