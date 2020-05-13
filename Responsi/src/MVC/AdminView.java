/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */
public class AdminView extends JFrame{
    JLabel ljudul,lid,lnama,lalamat,lposisi,lno_hp,lgaji,ljam,ltunjangan,lpajak,ltotal;
    JTextField txid,txnama,txalamat,txno_hp,txgaji,txjam,txtunjangan,txpajak,txtotal;
    JButton create, hitung, home, gaji, data, petunjuk, admin;
    JComboBox posisi;
    Statement statement;
    
    public AdminView(){
        setTitle("FORM PENGISIAN DATA GAJI");
        String cposisi[] = {"","Surverior","Programmer","Direktur", "Manager","Marketing"};//membuat isi combobox
        
        //atur tabel
        ljudul = new JLabel("APLIKASI PERHITUNGAN GAJI PT.VETERAN JAYA");
        lid = new JLabel("ID Pegawai : ");  
        lnama = new JLabel("Posisi : ");
        lalamat = new JLabel("Alamat : ");
        lposisi = new JLabel("Posisi : ");
        lno_hp = new JLabel("No HP : ");
        lgaji = new JLabel("Gaji Pokok : ");
        ljam = new JLabel("Jam Lembur : ");
        ltunjangan = new JLabel("Tunjangan : ");
        lpajak = new JLabel("Pajak : ");
        ltotal = new JLabel("Total : ");
        //atur textfield
        txtotal = new JTextField("");
        txid = new JTextField("");
        txnama = new JTextField("");
        txalamat = new JTextField("");
        txno_hp = new JTextField("");
        txgaji = new JTextField("");
        txjam = new JTextField("");
        txtunjangan = new JTextField("");
        txpajak = new JTextField("");
        txtotal = new JTextField("");
        //atur ComboBox
        posisi = new JComboBox(cposisi);
        //atur tombol
        create = new JButton("Simpan");
        hitung = new JButton("Hitung");
        home = new JButton("Home");
        data = new JButton("Data");
        gaji = new JButton("Gaji");
        petunjuk = new JButton("Petunjuk");
        admin = new JButton("Admin");
        
        setLayout(null);
        add(ljudul);
        add(lid);
        add(lnama);
        add(lalamat);
        add(lposisi);
        add(lno_hp);
        add(lgaji);
        add(ljam);
        add(ltunjangan);
        add(lpajak);
        add(ltotal);
        add(txid);
        add(txnama);
        add(txalamat);
        add(posisi);
        add(txno_hp);
        add(txgaji);
        add(txjam);
        add(txtunjangan);
        add(txpajak);
        add(txtotal);
        add(create);
        add(hitung);
        add(home);
        add(data);
        add(gaji);
        add(petunjuk);
        add(admin);
        
        ljudul.setBounds(130, 360, 300, 20);
        lid.setBounds(150, 30, 100, 20);
        lnama.setBounds(150, 60, 100, 20);
        lposisi.setBounds(150, 90, 100, 20);
        lalamat.setBounds(150, 120, 100, 20);
        lno_hp.setBounds(150, 150, 100, 20);
        lgaji.setBounds(150, 180, 100, 20);
        ljam.setBounds(150, 210, 100, 20);
        ltunjangan.setBounds(150, 240, 100, 20);
        lpajak.setBounds(150, 270, 100, 20);
        ltotal.setBounds(150, 300, 100, 20);
        txid.setBounds(270, 30, 150, 20);
        txnama.setBounds(270, 60, 150, 20);
        posisi.setBounds(270, 90, 150, 20);
        txalamat.setBounds(270, 120, 150, 20);
        txno_hp.setBounds(270, 150, 150, 20);
        txgaji.setBounds(270, 180, 150, 20);
        txjam.setBounds(270, 210, 150, 20);
        txtunjangan.setBounds(270, 240, 150, 20);
        txpajak.setBounds(270, 270, 150, 20);
        txtotal.setBounds(270, 300, 150, 20);
        data.setBounds(20, 80, 100, 25);
        create.setBounds(450, 280, 100, 30);
        home.setBounds(20, 20, 100, 25);
        admin.setBounds(450, 30, 100, 30);
        hitung.setBounds(450, 240, 100, 30);
        gaji.setBounds(20, 50, 100, 25);
        petunjuk.setBounds(20, 110, 100, 25);
        
        setSize(600,500); //atur luas jendela
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public String getGaji(){
        return txgaji.getText();
    }
    
    public String getId_p(){
        return txid.getText();
    }
    
    public String getNama(){
        return txnama.getText();
    }
    
    public String getAlamat(){
        return txalamat.getText();
    }
    
    public String getNoHP(){
        return txno_hp.getText();
    }
    
    public String getPosisi(){
        return posisi.getSelectedItem().toString();
    }
    
    public String getJam(){
        return txjam.getText();
    }
    
    public String getTunjangan(){
        return txtunjangan.getText();
    }
    
    public String getPajak(){
        return txpajak.getText();
    }
    
    public String getTotal(){
        return txtotal.getText();
    }
}

