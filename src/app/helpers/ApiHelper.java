/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.helpers;

import api.responses.ApiResponse;
import api.responses.DatatableResponse;
import api.services.AuthService;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import retrofit2.Call;
import retrofit2.Response;

/**
 *
 * @author kelompok_4_pbo
 */
public class ApiHelper {
    public static ApiResponse hitApi(Call<ApiResponse> call) {
        try {
            Response<ApiResponse> response = call.execute();
            Object data = new Object();
            
            if(response.isSuccessful()) {
                ApiResponse apiResponse = response.body();
                if(apiResponse.isStatus()) {
                } else {
                    System.out.println("API request failed. Response code: " + apiResponse.getMessage());
                }
                
                return apiResponse;
            }  else {
                System.out.println("API request failed. Response code: " + response.code());
            }
        } catch (IOException ex) {
            Logger.getLogger(AuthService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return new ApiResponse();
    }
    
    public static DatatableResponse hitApi(Call<DatatableResponse> call, boolean diff) {
        try {
            Response<DatatableResponse> response = call.execute();
            Object data = new Object();
            
            if(response.isSuccessful()) {
                DatatableResponse apiResponse = response.body();
                
                return apiResponse;
            }  else {
                System.out.println("API request failed. Response code: " + response.code());
            }
        } catch (IOException ex) {
            Logger.getLogger(AuthService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return new DatatableResponse();
    }
}
