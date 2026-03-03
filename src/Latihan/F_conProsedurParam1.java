/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author WINDOWS
 */
public class F_conProsedurParam1 {
    //ini adalah prosedur dengan parameter
    void hitungLuasPersegi(int sisi)    {
        int luas = sisi*sisi;
        System.out.println("Sisi: "+sisi);
        System.out.println("Luas Persegi "+luas);
    }
    //main method
    public static void main (String args[]){
        //memanggil prosedur dgn parameter
        int sisi =10;
        F_conProsedurParam1 f = new F_conProsedurParam1(); //harus sama dengan nama kelas
        f.hitungLuasPersegi(sisi);
    }
    
}
