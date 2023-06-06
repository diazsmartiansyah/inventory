/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.helpers;

import api.services.AuthService;
import api.services.PedagangService;
import app.models.Pedagang;
import app.models.User;

/**
 *
 * @author kelompok_4_pbo
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
