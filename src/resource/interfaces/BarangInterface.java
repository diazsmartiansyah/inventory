/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package resource.interfaces;

import api.requests.BarangRequest;
import app.models.Barang;

/**
 *
 * @author kelompok_4_pbo
 */
public interface BarangInterface {
    public Barang[] getList(BarangRequest barangRequest);
    public Barang store(BarangRequest barangRequest);
    public Barang getDetail(int idBarang);
    public Barang update(BarangRequest barangRequest);
    public boolean delete(int idBarang); 
}
