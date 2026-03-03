/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author WINDOWS
 */
public class E_dowhile1 {
     public static void main (String[] args){
         int bil;
         bil = 0;
         do {
             if (bil %2 !=0)
                 System.out.print(bil+ " ");
             bil++;     //perubahan
         } while (bil <= 20);   //kondisi
     }
    
}
