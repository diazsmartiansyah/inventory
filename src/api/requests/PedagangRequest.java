/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package api.requests;
import app.models.Pedagang;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author AkbarAbe
 */
public class PedagangRequest extends Pedagang {
    @SerializedName("email")
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
