/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;
import java.util.Scanner;
/**
 *
 * @author WINDOWS
 */
public class D_For1 {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai a: ");
        int a = input.nextInt();

        System.out.print("Masukkan nilai b: ");
        int b = input.nextInt();

        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) { // bilangan ganjil
                System.out.println(i);
            }
        }

        input.close();
    }
}

