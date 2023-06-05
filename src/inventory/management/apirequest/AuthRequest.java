/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventory.management.apirequest;

import inventory.management.model.User;

/**
 *
 * @author a_taupik_r
 */
public class AuthRequest extends User {

    public AuthRequest(String username, String password) {
        super(username, password);
    }
    
    public AuthRequest(int id, String name, String email, String username, String password, String created_at, String updated_at, String role, int customer_id, int pedagang_id) {
        super(id, name, email, username, password, created_at, updated_at, role, customer_id, pedagang_id);
    }
    
}
