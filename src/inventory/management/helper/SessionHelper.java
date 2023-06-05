/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventory.management.helper;

import inventory.management.apiservice.AuthService;
import inventory.management.apiservice.PedagangService;
import inventory.management.model.Pedagang;
import inventory.management.model.User;

/**
 *
 * @author a_taupik_r
 */
public class SessionHelper {
    public static String token;
    
    public static boolean storeSession(String token) {
        SessionHelper.token = token;
        return true;
    }
    
    public static String getCurrentToken() {
        return token;
    }
    
    public static boolean destroySession(String token) {
        token = null;
        return true;
    }
    
    public static User getCurrentUser() {
        AuthService service = new AuthService();
        User user = service.getUserByToken(token);
        
        return user;
    }
    
    public static Pedagang getCurrentPedagang() {
        PedagangService service = new PedagangService();
        User user = getCurrentUser();
        Pedagang pedagang = service.getDetail(user.getPedagang_id());
        
        return pedagang;
    }
    
} 
