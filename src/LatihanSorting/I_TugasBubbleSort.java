/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanSorting;

/**
 *
 * @author WINDOWS
 */
public class I_TugasBubbleSort {
    public static void main(String[] args) {
        String[] negara = {"Singapura", "Brunei", "Malaysia", "Palestina", "Indonesia", "Vietnam"};
        bubbleSortString(negara);
    }

    public static void bubbleSortString(String[] negara) {
        System.out.println("== SEBELUM DIURUTKAN ==");
        for (String n : negara) {
            System.out.print(n + " ");
        }

        for (int i = 0; i < negara.length - 1; i++) {
            for (int j = 0; j < negara.length - 1 - i; j++) {
                if (negara[j].compareTo(negara[j + 1]) > 0) {
                    String tamp = negara[j];
                    negara[j] = negara[j + 1];
                    negara[j + 1] = tamp;
                }
            }
        }
    }
}
