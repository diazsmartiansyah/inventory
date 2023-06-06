/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resource.implement;

import api.requests.SchedullingRequest;
import api.services.SchedullingService;
import app.models.Barang;
import app.models.Schedulling;
import resource.interfaces.SchedullingInterface;

/**
 *
 * @author kelompok_4_pbo
 */
public class SchedullingImplement implements SchedullingInterface {
    private final SchedullingService service;

    public SchedullingImplement() {
        service = new SchedullingService();
    }
    
    @Override
    public Schedulling[] getList(SchedullingRequest schedullingRequest) {
        Schedulling[] listSchedulling = {};
        try {
            listSchedulling= service.getList(schedullingRequest);
           
        } catch (Exception e) {
            e.printStackTrace();       }
        return listSchedulling;
    }
    
    @Override
    public Schedulling store(SchedullingRequest scheduleRequest) {
        Schedulling schedulling = new Schedulling();
        try {
            schedulling = service.store(scheduleRequest);
        } catch (Exception e) {
             e.printStackTrace();       }
        
        return schedulling;
    }

    @Override
    public Schedulling getDetail(int id) {
        Schedulling schedulling = new Schedulling();
        try {
            schedulling = service.getDetail(id);
        } catch (Exception e) {
             e.printStackTrace();       }
        
        return schedulling;
    }

    @Override
    public Schedulling update(SchedullingRequest schedullingRequest) {
        Schedulling schedulling = new Schedulling();
        try {
            schedulling = service.update(schedullingRequest);
        } catch (Exception e) {
             e.printStackTrace();       }
        
        return schedulling;
    }

    @Override
    public boolean delete(int idBarang) {
        boolean status;
        try {
            status = service.delete(idBarang);
        } catch (Exception e) {
             e.printStackTrace();            status = false;
        }
        
        return status;
    }
    
}
