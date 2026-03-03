/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanSorting;

/**
 *
 * @author WINDOWS
 */
public class I_ConBubble {
    //Main Method
    public static void main (String args []) {
        int nilai [] = {98,75,86,67,81};
        bubbleSortInt(nilai);
    }
    public static void bubbleSortInt(int [] bilangan) {
        //TAMPILAN SEBELUM DIURUTKAN
        System.out.println("==SEBELUM DIURUTKAN==");
        for (int bil: bilangan) {
            System.out.println(bil+ ", ");
        }
        
        //ALGORITMA BUBBLE SORTING/LOGIN
        for(int i=0; i<bilangan.length-1; i++) {
            for(int j=0; j<bilangan.length-1; j++) {
        
                //jIKA NILAI SAAT INI > DARI NILAI SELANJUTNYA
                if (bilangan[j] > bilangan [j+1]) {
                    //maka ini ditukar
                    int tamp = bilangan[j];
                    bilangan[j] = bilangan[j+1];
                    bilangan [j+1] = tamp;
                }
            }
        }
        //TAMPILAN SESUDAH DIURUTKAN
        System.out.println("==SEBULUM DIURTKAN==");
        for(int bil: bilangan) {
            System.out.print(bil+ ", ");
        }
    }
}
