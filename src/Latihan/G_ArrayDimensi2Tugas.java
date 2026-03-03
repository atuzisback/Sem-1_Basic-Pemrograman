/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author WINDOWS
 */
public class G_ArrayDimensi2Tugas {
    public static void main (String args[]){
        //array 2 dimensi 
        String [][] dataTrip = {
            {"samarinda", "balikpapan", "bontang"},
                {"penajam", "tenggarong", "sangatta"},
                {"banjarmasin","banjarbaru","martapura"},
                {"handil", "kalua", "kandangan"}
        };
    //untuk mengakses nilai dari indeks baris 0 indeks kolom 0
    System.out.println("satu\t:"+dataTrip[2][0]);
    
     //untuk mengakses nilai dari indeks baris 0 indeks kolom 1
     System.out.println("dua\t:"+dataTrip[1][2]);
}
}

