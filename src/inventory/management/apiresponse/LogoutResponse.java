/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventory.management.apiresponse;

import com.google.gson.annotations.SerializedName;
import inventory.management.model.Token;

/**
 *
 * @author a_taupik_r
 */
public class LogoutResponse {
    @SerializedName("data")
    private Token data;
    
    @SerializedName("message")
    private String message;
    
    @SerializedName("status")
    private boolean status;

    public Token getData() {
        return data;
    }

    public void setData(Token data) {
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
