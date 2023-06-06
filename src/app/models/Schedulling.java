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
public class Schedulling {
    @SerializedName("id")
    private int id;
    
    @SerializedName("judul")
    private String judul;
    
    @SerializedName("isi_schedule")
    private String isiSchedule;
    
    @SerializedName("tanggal")
    private String tanggal;
    
    @SerializedName("mode")
    private String mode;
    
    @SerializedName("pedagang_id")
    private int pedagangId;
    
    @SerializedName("created_at")
    private String createdAt;
    
    @SerializedName("updated_at")
    private String updatedAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getIsiSchedule() {
        return isiSchedule;
    }

    public void setIsiSchedule(String isiSchedule) {
        this.isiSchedule = isiSchedule;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public int getPedagangId() {
        return pedagangId;
    }

    public void setPedagangId(int pedagangId) {
        this.pedagangId = pedagangId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
}
