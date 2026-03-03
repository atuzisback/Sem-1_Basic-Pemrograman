/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EXCEPTION;

/**
 *
 * @author WINDOWS
 */
public class J_TugasArrayIndexOutOfBoundsException {
    public static void main(String args[]) {
        int p[] = new int[9];
        try {
            int i = 9;
            p[i] = 100;
            System.out.println("Cetak Array : "+ p[i]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index Array melebihi batas");
        }

    }
}
