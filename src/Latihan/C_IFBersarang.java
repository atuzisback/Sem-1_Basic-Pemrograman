/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Latihan;
import java.util.Scanner;

/**
 *
 * @author WINDOWS
 */
public class C_IFBersarang {
    public static void main(String[] args) {
        //Deklarasi Variabel dan Scanner
        int nilai;
        String grade;
        Scanner scan = new Scanner (System.in);
        
        //Mengambil Input
        System.out.println("inputkan Nilai");
        nilai = scan.nextInt();
        
        //Hitung Grade
        if (nilai >= 85) {
            grade = "A";
        }else if (nilai >= 60) {
            grade = "C";
        }else if (nilai >= 50) {
            grade = "D";
        }else {
            grade = "E";
        }
        
        //Cetal Hasilnya
        System.out.println("Grade; "+grade);
    }
    
}
