/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package api.interfaces;

import app.models.Pedagang;
import api.requests.PedagangRequest;


/**
 *
 * @author kelompok_4_pbo
 */
public interface PedagangInterface {
    public Pedagang getDetail(int id);
    public Pedagang updateProfile(PedagangRequest pedagangRequest);
}


