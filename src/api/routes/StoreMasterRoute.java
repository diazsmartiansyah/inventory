/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package api.routes;

import api.requests.BarangRequest;
import api.requests.AuthRequest;
import api.requests.NotesRequest;
import api.requests.PedagangRequest;
import api.requests.SchedullingRequest;
import api.requests.TransaksiRequest;
import api.responses.ApiResponse;
import api.responses.DatatableResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 *
 * @author kelompok_4_pbo
 */
public interface StoreMasterRoute {
    @POST("auth/login")
    Call<ApiResponse> login(@Body AuthRequest loginRequest);
    
    @POST("auth/get-user")
    Call<ApiResponse> getUser();
    
    @POST("auth/logout")
    Call<ApiResponse> logout();
    
    //Route Barang/Produk
    @POST("produk/get-list")
    Call<DatatableResponse> getListBarang(@Body BarangRequest barangRequest);
    
    @POST("produk")
    Call<ApiResponse> storeBarang(@Body BarangRequest barangRequest);
    
    @POST("produk/update/{id}")
    Call<ApiResponse> updateBarang(@Body BarangRequest barangRequest, @Path("id") int id);
    
     @POST("produk/delete/{id}")
    Call<ApiResponse> deleteBarang(@Path("id") int id);
    
    @POST("produk/detail/{id}")
    Call<ApiResponse> detailBarang(@Path("id") int id);
    
    //Route Pedagang
    @POST("pedagang/detail/{id}")
    Call<ApiResponse> detailPedagang(@Path("id") int id);
    
    @POST("pedagang/update/{id}")
    Call<ApiResponse> updatePedagang(@Body PedagangRequest pedagangRequest, @Path("id") int id);
    
    //Route Customer
    @POST("customer/detail/{id}")
    Call<ApiResponse> detailCustomer(@Path("id") int id);
    
    //Route Notes
    @POST("notes/get-list")
    Call<DatatableResponse> getListNotes(@Body NotesRequest notesRequest);
    
    @POST("notes")
    Call<ApiResponse> storeNotes(@Body NotesRequest notesRequest);
    
    @POST("notes/update/{id}")
    Call<ApiResponse> updateNotes(@Body NotesRequest notesRequest, @Path("id") int id);
    
     @POST("notes/delete/{id}")
    Call<ApiResponse> deleteNotes(@Path("id") int id);
    
    @POST("notes/detail/{id}")
    Call<ApiResponse> detailNotes(@Path("id") int id);
    
    //Route Schedule
    @POST("schedulling/get-list")
    Call<DatatableResponse> getListSchedulling(@Body SchedullingRequest scheduleRequest);
    
    @POST("schedulling")
    Call<ApiResponse> storeSchedulling(@Body SchedullingRequest scheduleRequest);
    
    @POST("schedulling/update/{id}")
    Call<ApiResponse> updateSchedulling(@Body SchedullingRequest scheduleRequest, @Path("id") int id);
    
    @POST("schedulling/delete/{id}")
    Call<ApiResponse> deleteSchedulling(@Path("id") int id);
    
    @POST("schedulling/detail/{id}")
    Call<ApiResponse> detailSchedulling(@Path("id") int id);
    
    //Route Schedule
    @POST("transaksi/get-list")
    Call<DatatableResponse> getListTransaksi(@Body TransaksiRequest transaksiRequest);
    
    @POST("transaksi")
    Call<ApiResponse> storeTransaksi(@Body TransaksiRequest transaksiRequest);
    
    @POST("transaksi/update/{id}")
    Call<ApiResponse> updateTransaksi(@Body TransaksiRequest transaksiRequest, @Path("id") int id);
    
    @POST("transaksi/delete/{id}")
    Call<ApiResponse> deleteTransaksi(@Path("id") int id);
    
    @POST("transaksi/detail/{id}")
    Call<ApiResponse> detailTransaksi(@Path("id") int id);
    
}
