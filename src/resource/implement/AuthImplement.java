/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resource.implement;

import api.services.AuthService;
import app.helpers.SessionHelper;
import app.models.Token;
import app.models.User;
import resource.interfaces.AuthInterface;

/**
 *
 * @author kelompok_4_pbo
 */
public class AuthImplement implements AuthInterface {
    private AuthService service;

    public AuthImplement() {
        service = new AuthService();
    }
    
    @Override
    public boolean login(String username, String password) {
        try {
            Token token = service.login(username, password);
            SessionHelper.storeSession(token.getToken());

            return true;
        } catch (Exception e) {
            e.printStackTrace();    
            return false;
        }
    }

    @Override
    public boolean logout() {
         try {
            boolean logout = service.logout(SessionHelper.getCurrentToken());
            
            return logout;
        } catch (Exception e) {
            e.printStackTrace();           return false;
        }
    }

    @Override
    public User getUserByToken(String token) {
        try {
            User user = service.getUserByToken(SessionHelper.getCurrentToken());
            return user;
        } catch (Exception e) {
            e.printStackTrace();           
            return new User();
        }
    }
    
}
