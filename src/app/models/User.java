/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.models;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author kelompok_4_pbo
 */
public class User {
    @SerializedName("id")
    private int id;
    
    @SerializedName("name")
    private String name;
    
    @SerializedName("email")
    private String email;
    
    @SerializedName("username")
    private String username;
    
    @SerializedName("password")
    private String password;
    
    @SerializedName("created_at")
    private String created_at;
    
    @SerializedName("updated_at")
    private String updated_at;
    
    @SerializedName("role")
    private String role;
    
    @SerializedName("customer_id")
    private int customer_id;
    
    @SerializedName("pedagang_id")
    private int pedagang_id;

    public User(){
        
    }
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public User(int id, String name, String email, String username, String password, String created_at, String updated_at, String role, int customer_id, int pedagang_id) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.role = role;
        this.customer_id = customer_id;
        this.pedagang_id = pedagang_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getPedagang_id() {
        return pedagang_id;
    }

    public void setPedagang_id(int pedagang_id) {
        this.pedagang_id = pedagang_id;
    }
    
    
    
}
