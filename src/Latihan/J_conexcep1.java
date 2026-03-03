/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;
/**
 *
 * @author WINDOWS
 */
public class J_conexcep1 {
    public static void main(String args []) {
        int a [] = new int [5];
        try {
        a [5] = 100;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Indeks Array melebihi batas");
        }
        System.out.println("Setelah blok try-catch");   
    }   
}
