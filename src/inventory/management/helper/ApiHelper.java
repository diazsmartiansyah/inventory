/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventory.management.helper;

import inventory.management.apiresponse.ApiResponse;
import inventory.management.apiresponse.DatatableResponse;
import inventory.management.apiservice.AuthService;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import retrofit2.Call;
import retrofit2.Response;

/**
 *
 * @author a_taupik_r
 */
public class ApiHelper {
    public static ApiResponse hitApi(Call<ApiResponse> call) {
        try {
            Response<ApiResponse> response = call.execute();
            Object data = new Object();
            
            if(response.isSuccessful()) {
                ApiResponse apiResponse = response.body();
                if(apiResponse.isStatus()) {
                    data = apiResponse.getData();
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
                data = apiResponse.getData();
                
                System.out.println("Debug: " + response.body());
                
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
