/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package resource.interfaces;

import api.requests.NotesRequest;
import app.models.Notes;

/**
 *
 * @author kelompok_4_pbo
 */
public interface NotesInterface {
    public Notes[] getList(NotesRequest notesRequest);
    public Notes store(NotesRequest notesRequest);
    public Notes getDetail(int idNotes);
    public Notes update(NotesRequest notesRequest);
    public boolean delete(int idNotes); 
}
