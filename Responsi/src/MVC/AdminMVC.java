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
public class AdminMVC {
    AdminView adminview = new AdminView();
    AdminModel adminmodel = new AdminModel();
    AdminDAO adminDAO = new AdminDAO();
    LihatAdminView lihatview = new LihatAdminView();
    AdminController admincontroller = new AdminController(adminmodel, adminview, adminDAO, lihatview);
}
