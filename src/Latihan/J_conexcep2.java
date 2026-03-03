/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;
/**
 *
 * @author WINDOWS
 */
public class J_conexcep2 {
    public static void main(String[] args) {
        int a = 30, b = 0;

        try {
            int c = a / b; // tidak bisa dibagi dengan nol
            System.out.println("Result: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Can't divide a number by zero");
        }
    }
}


