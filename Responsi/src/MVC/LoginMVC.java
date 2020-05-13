/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

/**
 *
 * @author HP
 */
public class LoginMVC {
    LoginView loginview = new LoginView();
    LoginController logincontroller = new LoginController(loginview);
}
