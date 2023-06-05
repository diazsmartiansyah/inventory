/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventory.management.resourceinterface;

import inventory.management.model.User;

/**
 *
 * @author a_taupik_r
 */
public interface AuthInterface {
    public boolean login(String username, String password); 
    public boolean logout();
    public User getUserByToken(String token);
}
