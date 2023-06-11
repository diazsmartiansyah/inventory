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
    
    @SerializedName("harga")
    private double harga;
    
    @SerializedName("kategori")
    private String kategori;
    
    @SerializedName("deskripsi")
    private String deskripsi;
    
    @SerializedName("kategori_id")
    private int kategori_id;
    
    @SerializedName("foto")
    private String foto;
    
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

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
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

    public int getKategori_id() {
        return kategori_id;
    }

    public void setKategori_id(int kategori_id) {
        this.kategori_id = kategori_id;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
}
