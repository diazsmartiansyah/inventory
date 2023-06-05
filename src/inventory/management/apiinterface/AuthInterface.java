/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package inventory.management.apiinterface;

import inventory.management.model.Token;
import inventory.management.model.User;

/**
 *
 * @author a_taupik_r
 */
public interface AuthInterface {
    public Token login(String username, String password);
    
    public User getUserByToken(String token);
    
    public boolean logout(String token);
}
