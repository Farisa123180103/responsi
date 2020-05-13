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
public class AdminModel {
    private String nama, posisi, alamat, no_hp, id;
    private String gaji, jam, search, id_p, tunjangan, pajak, total;
    
    //contructor
    public void setAdminModel(String nnama, String nposisi, String nalamat, String nno_hp, String ngaji, String njam, String ntunjangan, String npajak, String ntotal, String nid_p){
        this.nama = nnama;
        this.posisi= nposisi;
        this.alamat= nalamat;
        this.no_hp= nno_hp;
        this.gaji= ngaji;
        this.jam= njam;
        this.tunjangan= ntunjangan;
        this.pajak= npajak;
        this.total= ntotal;
        this.id_p= nid_p;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getPosisi(){
        return posisi;
    }
    
    public void setPosisi(String posisi){
        this.posisi = posisi;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    public String getNoHP(){
        return no_hp;
    }
    
    public void setNoHP(String no_hp){
        this.no_hp = no_hp;
    }
    
    public String getGaji(){
        return gaji;
    }
    
    public void setGaji(String gaji){
        this.gaji = gaji;
    }
    
    public String getJam(){
        return jam;
    }
    
    public void setJam(String jam){
        this.jam = jam;
    }
    
    public String getSearch(){
        return search;
    }
    
    public void setSearch(String search){
        this.search = search;
    }
    
    public String getId_p(){
        return id_p;
    }
    
    public void setId_p(String id_p){
        this.id_p = id_p;
    }
    
    public String getTunjangan(){
        return tunjangan;
    }
    
    public void setTunjangan(String tunjangan){
        this.tunjangan = tunjangan;
    }
    
    public String getPajak(){
        return pajak;
    }
    
    public void setPajak(String pajak){
        this.pajak = pajak;
    }
    
    public String getTotal(){
        return total;
    }
    
    public void setTotal(String total){
        this.total = total;
    }
    
    public String getId(){
        return id;
    }
    
    public void setId(String id){
        this.id = id;
    }

   
}
