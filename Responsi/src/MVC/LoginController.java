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
import java.awt.event.*;
import javax.swing.*;

public class LoginController {
    LoginView loginview;
    public LoginController(LoginView loginview){
        this.loginview = loginview;
        
        loginview.tombol2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String uname = loginview.getUname();
                String pw = loginview.getPw();
                
                if(uname.isEmpty() || pw.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Username atau Password kosong");
                } else if (uname.equals("admin") && pw.equals("admin")){
                    loginview.setVisible(false);
                    JOptionPane.showMessageDialog(null, "Login Berhasil");
                    new AdminMVC();
                } else if (uname.equals("karyawan") && pw.equals("karyawan")){
                    loginview.setVisible(false);
                    JOptionPane.showMessageDialog(null, "Login Berhasil");
                    new KaryawanMVC();
                }else {
                    JOptionPane.showMessageDialog(null, "Username atau Password salah");
                }
            }
        });
        loginview.back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                loginview.setVisible(false);
            }
        });
    }
}
