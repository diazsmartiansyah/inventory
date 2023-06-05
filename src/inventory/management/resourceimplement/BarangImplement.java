/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventory.management.resourceimplement;

import inventory.management.apirequest.BarangRequest;
import inventory.management.apiservice.CrudBarangService;
import inventory.management.model.Barang;
import inventory.management.resourceinterface.BarangInterface;

/**
 *
 * @author a_taupik_r
 */
public class BarangImplement implements BarangInterface {
    CrudBarangService service;

    public BarangImplement() {
        service = new CrudBarangService();
    }
    
    @Override
    public Barang[] getList(BarangRequest barangRequest) {
        Barang[] listBarang = {};
        try {
            listBarang = service.getList(barangRequest);
           
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
        return listBarang;
    }

    @Override
    public Barang getDetail(int id) {
        Barang barang = new Barang();
        try {
            barang = service.getDetail(id);
        } catch (Exception e) {
             System.out.println("Error : " + e.getMessage());
        }
        
        return barang;
    }

    @Override
    public Barang update(BarangRequest barangRequest) {
        Barang barang = new Barang();
        try {
            barang = service.update(barangRequest);
        } catch (Exception e) {
             System.out.println("Error : " + e.getMessage());
        }
        
        return barang;
    }

    @Override
    public boolean delete(int idBarang) {
        boolean status;
        try {
            status = service.delete(idBarang);
        } catch (Exception e) {
             System.out.println("Error : " + e.getMessage());
             status = false;
        }
        
        return status;
    }
    
}
