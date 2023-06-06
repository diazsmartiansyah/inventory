/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resource.implement;

import api.services.PedagangService;
import app.models.Pedagang;
import resource.interfaces.PedagangInterface;

/**
 *
 * @author kelompok_4_pbo
 */
public class PedagangImplement implements PedagangInterface {
    private final PedagangService service;

    public PedagangImplement() {
       service = new PedagangService();
    }

    @Override
    public Pedagang getDetail(int id) {
       Pedagang pedagang = new Pedagang();
        try {
            pedagang = service.getDetail(id);
        } catch (Exception e) {
             System.out.println("Error : " + e.getMessage());
        }
        
        return pedagang;
    }
    
}
