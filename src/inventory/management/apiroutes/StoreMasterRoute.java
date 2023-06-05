/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package inventory.management.apiroutes;

import inventory.management.apirequest.BarangRequest;
import inventory.management.apirequest.AuthRequest;
import inventory.management.apiresponse.ApiResponse;
import inventory.management.apiresponse.DatatableResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 *
 * @author a_taupik_r
 */
public interface StoreMasterRoute {
    @POST("/auth/login")
    Call<ApiResponse> login(@Body AuthRequest loginRequest);
    
    @POST("/auth/get-user")
    Call<ApiResponse> getUser();
    
    @POST("/auth/logout")
    Call<ApiResponse> logout();
    
    @POST("/produk/get-list")
    Call<DatatableResponse> getListBarang(@Body BarangRequest barangRequest);
    
    @POST("/produk/")
    Call<ApiResponse> storeBarang(@Body BarangRequest barangRequest);
    
    @POST("/produk/update/{id}")
    Call<ApiResponse> updateBarang(@Body BarangRequest barangRequest, @Path("id") int id);
    
     @POST("/produk/delete/{id}")
    Call<ApiResponse> deleteBarang(@Path("id") int id);
    
    @POST("/produk/detail/{id}")
    Call<ApiResponse> detailBarang(@Path("id") int id);
    
    @POST("/pedagang/detail/{id}")
    Call<ApiResponse> detailPedagang(@Path("id") int id);
    
    @POST("/customer/detail/{id}")
    Call<ApiResponse> detailCustomer(@Path("id") int id);
}
