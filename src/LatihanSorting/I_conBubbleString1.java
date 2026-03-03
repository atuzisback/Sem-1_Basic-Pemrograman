/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanSorting;

/**
 *
 * @author WINDOWS
 */
public class I_conBubbleString1 {
    //Main method
    public static void main(String[] args) {
        String[] nama = {"Sufyan","Atuz","Luthfi","Ismi"};
        bubbleSortString(nama);
    }
    //PROSEDUR BUBBLE STRING
    public static void bubbleSortString(String kata[]) {
        //TAMPILAN SEBELUM DIURUT
        System.out.println("==SEBELUM DIURUTKAN==");
        for(String k: kata) {
            System.out.print(k+ ", ");
        }
        //ALGORITMA BUBBLE STRING
        for (int i = 0; i < kata.length - 1; i++) {
            for (int j = 0; j < kata.length - 1 - i; j++) {
                if (kata[j].compareTo(kata[j + 1]) > 0) {
                    String tamp = kata[j];
                    kata[j] = kata[j+1];
                    kata[j+1] = tamp;
            }
        }
    }
    // TAMPILAN SESUDAH DIURUTKAN
        System.out.println("==SESUDAH DIURUTKAN==");
        for (String k : kata) {
            System.out.print(k + ", ");
        }
    }
}
