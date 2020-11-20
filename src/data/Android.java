/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author 
 * NAMA     : Aldy Putra Hanggara
 * KELAS    : PBO2
 * NIM      : 10119047
 * DESKRIPSI PROGRAM : PROGRAM INI BERISI PROGRAM MENAMPILKAN JENIS HANDPHONE
 */

public class Android extends Handphone {
    private String keyStore;

    public Android(String man, String os, String model, int harga) {
        super(man, os, model, harga);
    }
    
    public String getKeyStore(){
        return keyStore;
    }
    
    public void setKeyStore(String keyStore){
        this.keyStore = keyStore;
    }
    
}
