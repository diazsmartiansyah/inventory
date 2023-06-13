/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resource.implement;

import api.requests.BarangRequest;
import api.services.BarangService;
import app.models.Barang;
import resource.interfaces.BarangInterface;

/**
 *
 * @author kelompok_4_pbo
 */
public class BarangImplement implements BarangInterface {
    BarangService service;

    public BarangImplement() {
        service = new BarangService();
    }
    
    @Override
    public Barang[] getList(BarangRequest barangRequest) {
        Barang[] listBarang = {};
        try {
            listBarang = service.getList(barangRequest);
           
        } catch (Exception e) {
            e.printStackTrace();       
        }
        return listBarang;
    }
    
    @Override
    public Barang store(BarangRequest barangRequest) {
        Barang barang = new Barang();
        try {
            barang = service.store(barangRequest);
        } catch (Exception e) {
             e.printStackTrace();       
        }
        
        return barang;
    }

    @Override
    public Barang getDetail(int id) {
        Barang barang = new Barang();
        try {
            barang = service.getDetail(id);
        } catch (Exception e) {
             e.printStackTrace();       
        }
        
        return barang;
    }

    @Override
    public Barang update(BarangRequest barangRequest) {
        Barang barang = new Barang();
        try {
            barang = service.update(barangRequest);
        } catch (Exception e) {
             e.printStackTrace();       
        }
        
        return barang;
    }

    @Override
    public boolean delete(int idBarang) {
        boolean status;
        try {
            status = service.delete(idBarang);
        } catch (Exception e) {
             e.printStackTrace();            
             status = false;
        }
        
        return status;
    }
    
}
