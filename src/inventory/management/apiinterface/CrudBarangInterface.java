/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventory.management.apiinterface;

import inventory.management.apirequest.BarangRequest;
import inventory.management.model.Barang;

/**
 *
 * @author a_taupik_r
 */
public interface CrudBarangInterface {
    public Barang[] getList(BarangRequest barangRequest);
    
    public Barang store(BarangRequest barangRequest);
    
    public Barang update(BarangRequest barangRequest);
    
    public boolean delete(int id);
    
    public Barang getDetail(int id);
}
