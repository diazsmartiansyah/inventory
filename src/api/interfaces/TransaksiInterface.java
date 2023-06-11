/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package api.interfaces;

import api.requests.TransaksiRequest;
import app.models.Transaksi;

/**
 *
 * @author a_taupik_r
 */
public interface TransaksiInterface {
    public Transaksi[] getList(TransaksiRequest TransaksiRequest);
    
    public Transaksi store(TransaksiRequest TransaksiRequest);
    
    public Transaksi update(TransaksiRequest TransaksiRequest);
    
    public boolean delete(int id);
    
    public Transaksi getDetail(int id);
}
