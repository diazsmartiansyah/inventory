/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package api.interfaces;

import app.models.Token;
import app.models.User;

/**
 *
 * @author kelompok_4_pbo
 */
public interface AuthInterface {
    public Token login(String username, String password);
    
    public User getUserByToken(String token);
    
    public boolean logout(String token);
}
