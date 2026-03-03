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
public class C_SwitchLampumerah {
    public static void main(String[] args) {
    String lampu;
    Scanner scan = new Scanner(System.in);
    
    // Mengambil Input
    System.out.println("warna lampu(merah,kuning,hijau);");
    lampu=scan.next();
    
     System.out.println("=========================");

    // Pemrograman switch-case
      switch (lampu){
            case "merah":
                System.out.println("Lampu "+lampu+" berhenti");
                break;
            case "kuning":
                System.out.println("Lampu "+lampu+" Hati - hati");
                break;
            case "hijau":
                System.out.println("Lampu "+lampu+" Jalan");
                break;         
        }
    }
}
  
  

