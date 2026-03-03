/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author WINDOWS
 */
public class G_Array2DimensiLatihan {
    public static void main (String args[]){
        //array 2 dimensi 
        String [][] data = {
            {"1","2","3"},
            {"4","5","6"},
            {"7","8","9"}
        };
      // Mengakses nilai dari indeks baris ke-1 dan kolom ke-2
        System.out.println("Nilai data[1][2] = " + data[1][2]);
        System.out.println();

        // Menampilkan seluruh elemen array dengan nested loop
        System.out.println("Isi seluruh array 2 dimensi:");
        for (int i = 0; i < data.length; i++) { // baris
            for (int j = 0; j < data[i].length; j++) { // kolom
                System.out.print(data[i][j] + " ");
            }
            System.out.println(); // pindah baris
        }
    }
}


