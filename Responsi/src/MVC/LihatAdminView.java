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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class LihatAdminView extends JFrame{
    JLabel ljudul;
    JButton show, home, tambah, data, petunjuk, admin;
    JTable tabel;
    DefaultTableModel tableModel;
    JScrollPane scrollPane;//buat scroll
    Object namaKolom[] = {"ID", "Nama", "Posisi", "Gaji Pokok", "Jam Lembur", "Tunjangan", "Total Gaji"};//membuat kolom dlm array
    Statement statement;
    
    public LihatAdminView(){
        setTitle("FORM PENGISIAN DATA FILM");
        String cstatus[] = {"Selesai","Belum"};//membuat isi combobox
        //atur tabel
        tableModel = new DefaultTableModel(namaKolom,0); //0 baris
        tabel = new JTable(tableModel);
        scrollPane = new JScrollPane(tabel);
        //atur tabel
        ljudul = new JLabel("Nama");
        
        //atur tombol
        show = new JButton("Show");
        home = new JButton("Home");
        tambah = new JButton("Tambah");
        petunjuk = new JButton("Petunjuk");
        admin = new JButton("Admin");
        data = new JButton("Data");
        
        setLayout(null);
        add(ljudul);
        add(show);
        add(home);
        add(tambah);
        add(petunjuk);
        add(admin);
        add(data);
        add(scrollPane);
        
        ljudul.setBounds(25, 230, 50, 20);
        data.setBounds(740, 247, 75, 25);
        petunjuk.setBounds(420, 395, 80, 25);
        show.setBounds(520, 395, 75, 25);
        tambah.setBounds(615, 395, 75, 25);
        home.setBounds(710, 395, 75, 25);
        admin.setBounds(800, 395, 55, 25);
        scrollPane.setBounds(25, 25, 825, 200);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        
        setSize(900,500); //atur luas jendela
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
}

