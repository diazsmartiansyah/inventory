/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.models;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author a_taupik_r
 */
public class Transaksi {
    @SerializedName("id")
    private int id;
    
    @SerializedName("kode_transaksi")
    private String kodeTransaksi;
    
    @SerializedName("nama_pembeli")
    private String namaPembeli;
    
    @SerializedName("alamat_pembeli")
    private String alamatPembeli;
    
    @SerializedName("no_hp")
    private String noHp;
    
    @SerializedName("kurir_id")
    private int kurirId;
    
    @SerializedName("status_pengantaran")
    private String statusPengantaran;
    
    @SerializedName("tanggal_transaksi")
    private String tanggalTransaksi;
    
    @SerializedName("metode_transaksi")
    private String metodeTransaksi;
    
    @SerializedName("total_pembayaran")
    private Double totalPembayaran;
    
    @SerializedName("customer_id")
    private int customerId;
    
    @SerializedName("is_checkouted")
    private int isCheckouted;
    
    @SerializedName("snap_token")
    private String snapToken;
    
    @SerializedName("is_done")
    private int isDone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKodeTransaksi() {
        return kodeTransaksi;
    }

    public void setKodeTransaksi(String kodeTransaksi) {
        this.kodeTransaksi = kodeTransaksi;
    }

    public int getKurirId() {
        return kurirId;
    }

    public void setKurirId(int kurirId) {
        this.kurirId = kurirId;
    }

    public String getStatusPengantaran() {
        return statusPengantaran;
    }

    public void setStatusPengantaran(String statusPengantaran) {
        this.statusPengantaran = statusPengantaran;
    }

    public String getTanggalTransaksi() {
        return tanggalTransaksi;
    }

    public void setTanggalTransaksi(String tanggalTransaksi) {
        this.tanggalTransaksi = tanggalTransaksi;
    }

    public String getMetodeTransaksi() {
        return metodeTransaksi;
    }

    public void setMetodeTransaksi(String metodeTransaksi) {
        this.metodeTransaksi = metodeTransaksi;
    }

    public Double getTotalPembayaran() {
        return totalPembayaran;
    }

    public void setTotalPembayaran(Double totalPembayaran) {
        this.totalPembayaran = totalPembayaran;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getIsCheckouted() {
        return isCheckouted;
    }

    public void setIsCheckouted(int isCheckouted) {
        this.isCheckouted = isCheckouted;
    }

    public String getSnapToken() {
        return snapToken;
    }

    public void setSnapToken(String snapToken) {
        this.snapToken = snapToken;
    }

    public int getIsDone() {
        return isDone;
    }

    public void setIsDone(int isDone) {
        this.isDone = isDone;
    }

    public String getNamaPembeli() {
        return namaPembeli;
    }

    public void setNamaPembeli(String namaPembeli) {
        this.namaPembeli = namaPembeli;
    }

    public String getAlamatPembeli() {
        return alamatPembeli;
    }

    public void setAlamatPembeli(String alamatPembeli) {
        this.alamatPembeli = alamatPembeli;
    } 

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }
    
    
}
