/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package inventory.management.resourceinterface;

import inventory.management.apirequest.BarangRequest;
import inventory.management.model.Barang;

/**
 *
 * @author a_taupik_r
 */
public interface BarangInterface {
    public Barang[] getList(BarangRequest barangRequest);
    public Barang getDetail(int idBarang);
    public Barang update(BarangRequest barangRequest);
    public boolean delete(int idBarang); 
}
