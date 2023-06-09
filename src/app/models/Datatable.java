/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.models;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author kelompok_4_pbo
 */
public class Datatable {
    @SerializedName("draw")
    private int draw;
    
    @SerializedName("recordsTotal")
    private int recordsTotal;
    
    @SerializedName("recordsFiltered")
    private int recordsFiltered;
      
    @SerializedName("data")
   private Object[] data;

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public int getRecordsTotal() {
        return recordsTotal;
    }

    public void setRecordsTotal(int recordsTotal) {
        this.recordsTotal = recordsTotal;
    }

    public int getRecordsFiltered() {   
        return recordsFiltered;
    }

    public void setRecordsFiltered(int recordsFiltered) {
        this.recordsFiltered = recordsFiltered;
    }

    public Object[] getData(Class clazz) {
        Object[] returns = {};
        Object debug = new Object();
        try {
            Gson gson = new Gson();
            int i = 0;
            returns = new Object[data.length];
            for(Object object: data) {
                debug = object;
                
                Object obj = gson.fromJson(gson.toJson(object), clazz);
                
                returns[i] = obj;
                i++;
            }
        } catch (Exception e) {
            System.out.println("salah disini  : " + debug.toString());
            e.printStackTrace();
        }
        
        return returns;
    }

    public void setData(Object[] data) {
        this.data = data;
    }
}
