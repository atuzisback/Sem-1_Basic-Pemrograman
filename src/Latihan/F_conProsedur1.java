/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author WINDOWS
 */
public class F_conProsedur1 {
    // Deklarasi Variabel
    int sisi = 10;
    
    //ini adalah prosedur (Fungi tanpa nilai balik)
    void hitungLuasPeregi (){
        int luas = sisi * sisi;
        System.out.println("Sisi: "+sisi);
        System.out.println("Luas Persegi: "+luas);
    }
    // main mathod utk running
    public static void main (String args[]){
         
        //mmebuat instasiasi objek
        F_conProsedur1 p = new F_conProsedur1 ();
        
        //memanggil prosedur
        p.hitungLuasPeregi(); 
    }
}