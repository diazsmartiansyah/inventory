/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventory.management.model;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author a_taupik_r
 */
public class Barang {
    @SerializedName("id")
    private int id;
    
    @SerializedName("kode_barang")
    private String kodeBarang;
    @SerializedName("pedagang_id")
    private int pedagangId;
    
    @SerializedName("supplier_id")
    private int supplierId;
    
    @SerializedName("nama")
    private String nama;
    
    @SerializedName("stok")
    private int stok;
    
    @SerializedName("kategori")
    private String kategori;
    
    @SerializedName("created_at")
    private String created_at;
    
    @SerializedName("updated_at")
    private String updated_at;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public int getPedagangId() {
        return pedagangId;
    }

    public void setPedagangId(int pedagangId) {
        this.pedagangId = pedagangId;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
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
}
