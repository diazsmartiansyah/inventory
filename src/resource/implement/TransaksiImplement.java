/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resource.implement;

import api.requests.TransaksiRequest;
import api.services.TransaksiService;
import app.models.Transaksi;
import resource.interfaces.TransaksiInterface;

/**
 *
 * @author a_taupik_r
 */
public class TransaksiImplement implements TransaksiInterface {
    private final TransaksiService service;

    public TransaksiImplement() {
        service = new TransaksiService();
    }

    @Override
    public Transaksi[] getList(TransaksiRequest transaksiRequest) {
       Transaksi[] listTransaksi = {};
        try {
            listTransaksi= service.getList(transaksiRequest);
           
        } catch (Exception e) {
            e.printStackTrace();       
        }
        return listTransaksi;
    }

    @Override
    public Transaksi store(TransaksiRequest transaksiRequest) {
        Transaksi transaksi = new Transaksi();
        try {
            transaksi = service.store(transaksiRequest);
        } catch (Exception e) {
             e.printStackTrace();       
        }
        
        return transaksi;
    }

    @Override
    public Transaksi getDetail(int idTransaksi) {
        Transaksi transaksi = new Transaksi();
        try {
            transaksi = service.getDetail(idTransaksi);
        } catch (Exception e) {
             e.printStackTrace();       
        }
        
        return transaksi;
    }

    @Override
    public Transaksi update(TransaksiRequest transaksiRequest) {
        Transaksi transaksi = new Transaksi();
        try {
            transaksi = service.update(transaksiRequest);
        } catch (Exception e) {
             e.printStackTrace();       
        }
        
        return transaksi;
    }

    @Override
    public boolean delete(int idTransaksi) {
        boolean status;
        try {
            status = service.delete(idTransaksi);
        } catch (Exception e) {
             e.printStackTrace();           
             status = false;
        }
        
        return status;
    }
    
}
