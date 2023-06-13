/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resource.implement;

import api.requests.BarangRequest;
import api.requests.NotesRequest;
import api.services.NotesService;
import app.models.Barang;
import app.models.Notes;
import resource.interfaces.NotesInterface;

/**
 *
 * @author kelompok_4_pbo
 */
public class NotesImplement implements NotesInterface {
    private final NotesService service;

    public NotesImplement() {
        service = new NotesService();
    }
    
    @Override
    public Notes[] getList(NotesRequest notesRequest) {
        Notes[] listNotes = {};
        
        try {
            listNotes = service.getList(notesRequest);
        } catch (Exception e) {
            e.printStackTrace();       
        }
        return listNotes;
    }
    
    @Override
    public Notes store(NotesRequest notesRequest) {
        Notes notes = new Notes();
        try {
            notes = service.store(notesRequest);
        } catch (Exception e) {
             e.printStackTrace();       
        }
        
        return notes;
    }

    @Override
    public Notes getDetail(int id) {
        Notes notes = new Notes();
        try {
            notes = service.getDetail(id);
        } catch (Exception e) {
             e.printStackTrace();       }
        
        return notes;
    }

    @Override
    public Notes update(NotesRequest notesRequest) {
        Notes notes = new Notes();
        try {
            notes = service.update(notesRequest);
        } catch (Exception e) {
             e.printStackTrace();       }
        
        return notes;
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
