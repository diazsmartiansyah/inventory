/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package resource.interfaces;

import api.requests.TransaksiRequest;
import app.models.Transaksi;
/**
 *
 * @author a_taupik_r
 */
public interface TransaksiInterface {
    public Transaksi[] getList(TransaksiRequest transaksiRequest);
    public Transaksi store(TransaksiRequest transaksiRequest);
    public Transaksi getDetail(int idTransaksi);
    public Transaksi update(TransaksiRequest transaksiRequest);
    public boolean delete(int idTransaksi); 
}
