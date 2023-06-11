/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package api.responses;

import app.models.Token;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author kelompok_4_pbo
 */
public class ApiResponse {
    @SerializedName("data")
    private Object data;
    
    @SerializedName("message")
    private String message;
    
    @SerializedName("status")
    private boolean status;

    public Object getData(Class clazz) {
        Gson gson = new Gson();
        Object obj = new Object();
        
        try {
            
            obj = gson.fromJson(gson.toJson(data), clazz);
        } catch (Exception e) {
            obj = gson.fromJson(data.toString(), clazz);
        }
        
        return obj;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
