/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventory.management.resourceimplement;

import inventory.management.apiservice.AuthService;
import inventory.management.helper.SessionHelper;
import inventory.management.model.Token;
import inventory.management.model.User;
import inventory.management.resourceinterface.AuthInterface;

/**
 *
 * @author a_taupik_r
 */
public class AuthImplement implements AuthInterface {
    private AuthService service;

    public AuthImplement() {
        service = new AuthService();
    }
    
    @Override
    public boolean login(String username, String password) {
        try {
            Token token =  service.login(username, password);
            SessionHelper.storeSession(token.getToken());

            return true;
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean logout() {
         try {
            boolean logout =  service.logout(SessionHelper.getCurrentToken());
            
            return logout;
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
            return false;
        }
    }

    @Override
    public User getUserByToken(String token) {
        try {
            User user = service.getUserByToken(SessionHelper.getCurrentToken());
            return user;
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
            return new User();
        }
    }
    
}
