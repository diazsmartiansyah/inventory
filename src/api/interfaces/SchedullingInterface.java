/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package api.interfaces;

import api.requests.SchedullingRequest;
import app.models.Schedulling;

/**
 *
 * @author kelompok_4_pbo
 */
public interface SchedullingInterface {
    public Schedulling[] getList(SchedullingRequest schedullingRequest);
    
    public Schedulling store(SchedullingRequest schedullingRequest);
    
    public Schedulling update(SchedullingRequest schedullingRequest);
    
    public boolean delete(int id);
    
    public Schedulling getDetail(int id);
}
