/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author HP
 */
public class AdminController {
    AdminModel adminmodel;//utk import class Model
    AdminView adminview; //utk import class View
    AdminDAO admindao; //utk import class DAO
    LihatAdminView lihatview;
    static String nnama,  nposisi,  nalamat,  nno_hp;
    static String ngaji,  njam,  ntunjangan,  npajak,  ntotal, nid_p;
    
    public AdminController(AdminModel adminmodel, AdminView adminview, AdminDAO admindao, LihatAdminView lihatview){
        this.adminmodel = adminmodel;
        this.adminview = adminview;
        this.admindao = admindao;
        this.lihatview = lihatview;
        
        if(admindao.getJmldata() != 0){ //utk mengecek apakah DB ada data atau tidak
            String dataAdmin[][] = admindao.readAdmin();
            lihatview.tabel.setModel((new JTable(dataAdmin, lihatview.namaKolom)).getModel());
        } else { 
            // kalau tdk ada mka akan muncul pop up
            JOptionPane.showMessageDialog(null, "Data tidak ada!");
        }
        
        adminview.create.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                
//                ntunjangan = njam*15000;
                String id_p = adminview.getId_p();
                String nama = adminview.getNama();
                String posisi = adminview.getPosisi();
                String alamat = adminview.getAlamat();
                String no_hp = adminview.getNoHP();
                String gaji = adminview.getGaji();
                String jam = adminview.getPosisi();
                String tunjangan = adminview.getAlamat();
                String pajak = adminview.getNoHP();
                String total = adminview.getGaji();
                
                if(id_p.isEmpty() || nama.isEmpty() || posisi.isEmpty() || alamat.isEmpty() || no_hp.isEmpty() || gaji.isEmpty() || jam.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Harap isi semua field");
                } else {
                    //memasukkan data kedlm Model
                    adminmodel.setAdminModel( nnama,  nposisi,  nalamat,  nno_hp,  ngaji,  njam,  ntunjangan,  npajak,  ntotal, nid_p);
                    //menjalankan perintah insert di DAO
                    admindao.Insert(adminmodel);
                    
                }
            }
        });
        
        
        lihatview.show.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String dataAdmin[][] = admindao.readAdmin();
                lihatview.tabel.setModel((new JTable (dataAdmin, lihatview.namaKolom)).getModel());
                
            }
        });
        
        lihatview.admin.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                adminview.setVisible(false);
            }
        });
        
        adminview.hitung.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                
                String id_p = adminview.getId_p();
                String nama = adminview.getNama();
                String posisi = adminview.getPosisi();
                String alamat = adminview.getAlamat();
                String no_hp = adminview.getNoHP();
                String gaji = adminview.getGaji();
                String jam = adminview.getPosisi();
//                int gajii = Integer.parseInt(gaji);
//                int jamm = Integer.parseInt(jam);
//                int tunjangan = jamm*1500;
                
                
                adminview.txid.setText(id_p);
                adminview.txnama.setText(nama);
                adminview.posisi.setSelectedItem(posisi);
                adminview.txalamat.setText(alamat);
                adminview.txno_hp.setText(no_hp);
                adminview.txgaji.setText(gaji);
                adminview.txjam.setText(jam);
//                adminview.txtunjangan.setText(tunjangan);//blm
                adminview.txpajak.setText(jam);//blm
                adminview.txtotal.setText(gaji);//blm
            }
        });
        
        
        
    }
}

