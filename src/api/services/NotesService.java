/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package api.services;

import api.interfaces.NotesInterface;
import api.requests.NotesRequest;
import api.responses.ApiResponse;
import api.responses.DatatableResponse;
import api.routes.StoreMasterRoute;
import app.helpers.ApiHelper;
import app.helpers.RetrofitHelper;
import app.models.Barang;
import app.models.Notes;
import retrofit2.Call;
import retrofit2.Retrofit;

/**
 *
 * @author kelompok_4_pbo
 */
public class NotesService implements NotesInterface {
    private final RetrofitHelper retrofitHelper;
    private final Retrofit retrofit;
    private final StoreMasterRoute route;

    public NotesService() {
        retrofitHelper = new RetrofitHelper();
        retrofit = retrofitHelper.getInstance();
        route = retrofit.create(StoreMasterRoute.class);
    }
    
    @Override
    public Notes[] getList(NotesRequest notesRequest) {
        Call<DatatableResponse> call = route.getListNotes(notesRequest);
        DatatableResponse response = ApiHelper.hitApi(call, true);
        Object[] listObject = response.getData(Notes.class);
        Notes[] listNotes = new Notes[listObject.length];
        
        int i = 0;
        for(Object obj: listObject) {
            listNotes[i] = (Notes) obj;
            i++;
        }

        return listNotes;
    }
    
    @Override
    public Notes store(NotesRequest notesRequest) {
        Call<ApiResponse> call = route.storeNotes(notesRequest);
        ApiResponse response = ApiHelper.hitApi(call);
        Notes notes = (Notes) response.getData(Notes.class);

        return notes;
    }

    @Override
    public Notes update(NotesRequest notesRequest) {
        Call<ApiResponse> call = route.updateNotes(notesRequest, notesRequest.getId());
        ApiResponse response = ApiHelper.hitApi(call);
        Notes notes = (Notes) response.getData(Notes.class);

        return notes;
    }

    @Override
    public boolean delete(int id) {
        Call<ApiResponse> call = route.deleteNotes(id);
        ApiResponse response = ApiHelper.hitApi(call);

        return response.isStatus();
    }

    @Override
    public Notes getDetail(int id) {
        Call<ApiResponse> call = route.detailNotes(id);
        ApiResponse response = ApiHelper.hitApi(call);
        Notes notes = (Notes) response.getData(Notes.class);

        return notes;
    }
    
}
