/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventory.management.apiresponse;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author a_taupik_r
 */
public class ApiResponse {
    @SerializedName("data")
    private Object data;
    
    @SerializedName("message")
    private String message;
    
    @SerializedName("status")
    private boolean status;

    public Object getData() {
        return data;
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
