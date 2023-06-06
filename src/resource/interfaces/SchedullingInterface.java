/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package resource.interfaces;

import api.requests.SchedullingRequest;
import app.models.Barang;
import app.models.Schedulling;

/**
 *
 * @author kelompok_4_pbo
 */
public interface SchedullingInterface {
    public Schedulling[] getList(SchedullingRequest scheduleRequest);
    public Schedulling store(SchedullingRequest scheduleRequest);
    public Schedulling getDetail(int idSchedule);
    public Schedulling update(SchedullingRequest scheduleRequest);
    public boolean delete(int idSchedule); 
}
