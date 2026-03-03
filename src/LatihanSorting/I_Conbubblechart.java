/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanSorting;

/**
 *
 * @author WINDOWS
 */
public class I_Conbubblechart {
// Main method

    public static void main(String[] args) {
        char[] nama = {'H', 'A', 'N','I', 'F', 'A'};
        bubbleSortChar(nama);
    }
// PROSEDUR BUBBLE SORT CHAR

    public static void bubbleSortChar(char[] kata) {
        // TAMPILAN SEBELUM DIURUTKAN
        System.out.println("==SEBELUM DIURUTKAN==");
        for (char k : kata) {
            System.out.print(k + ", ");
        }
        System.out.println(); // Tambahkan newline untuk format yang lebih baik
        // ALGORITMA BUBBLE SORT CHAR
        for (int i = 0; i < kata.length - 1; i++) {
            for (int j = 0; j < kata.length - 1 - i; j++) {
                if (kata[j] > kata[j + 1]) {
                    char tamp = kata[j];
                    kata[j] = kata[j + 1];
                    kata[j + 1] = tamp;
                }
            }
        }
        // TAMPILAN SESUDAH DIURUTKAN
        System.out.println("==SESUDAH DIURUTKAN==");
        for (char k : kata) {
            System.out.print(k + ", ");
        }
    }
}
