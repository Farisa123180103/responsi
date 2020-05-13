/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class AdminDAO {
    private int jmlData;
    private Connection koneksi;
    private Statement statement;
    //constructor berfungsi utk melakukan sebuah koneksi saat ada object baru dibuat
    public AdminDAO(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/gaji";
            koneksi = DriverManager.getConnection(url, "root", "");
            statement = koneksi.createStatement();
            JOptionPane.showMessageDialog(null, "Koneksi Berhasil");
        } catch (ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Class Not Found : " + ex);
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "SQL Exception : " + ex);
        }
    }
    
    public void Insert(AdminModel Model){
        try{
            String query = "INSERT INTO admin VALUES (NULL,'"+Model.getId_p()+"','"+
                    Model.getNama()+"','"+Model.getPosisi()+"','"+
                    Model.getAlamat()+"','"+Model.getNoHP()+"','"+Model.getGaji()+"','"+Model.getJam()+"','"+
                    Model.getTunjangan()+"','"+Model.getPajak()+"','"+Model.getTotal()+"')";
            statement.executeUpdate(query); //execute querynya
            JOptionPane.showMessageDialog(null, "Data disimpan");
        } catch (Exception sql){
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }
    
    //utk mengambil data dari db dan mengatur ke dalam tabel
    public String[][] readAdmin(){
        try{
            //baris sejumlah data, kolomnya ada 8
            String data[][] = new String[getJmldata()][7];
            //penganmbilan dta dlm java dari db
            String query = "SELECT * FROM admin";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){ //lanjut kedata selanjutnya jmlData bertambah
                data[jmlData][0] = resultSet.getString("id_admin");//penomoran
                data[jmlData][1] = resultSet.getString("nama_a");//id adalah nama field di database
                data[jmlData][2] = resultSet.getString("posisi_a");
                data[jmlData][3] = resultSet.getString("gaji_a");
                data[jmlData][4] = resultSet.getString("jam");
                data[jmlData][5] = resultSet.getString("tunjangan");
                data[jmlData][6] = resultSet.getString("total");
                jmlData++; //barisnya berpindah terus
            }
            return data;
        } catch (SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }
    
   
    public int getJmldata(){
        try{
            //pengambilan data kedlm java dri db
            String query = "SELECT * FROM admin";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){//lanjut kedata selanjutnya, jmlData bertambah
                jmlData++;
            }
            return jmlData;
        } catch (SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return 0;
        }
    }
    

}


