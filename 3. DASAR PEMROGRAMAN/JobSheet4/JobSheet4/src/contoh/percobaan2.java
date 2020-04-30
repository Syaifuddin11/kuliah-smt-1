/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoh;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class percobaan2 {
    public static void main(String[]args){
        int nilai;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan sebuah bilangan :");
        nilai = sc.nextInt();
        
        if (nilai>100){
            nilai+=10;
        } else{
            nilai-=10;
        }
        System.out.println("Hasil nilai akhir adalah " + nilai);
        
        
        
//        int nilai1, nilai2;
//        double rata2;
//        
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Masukkan nilai 1: ");
//        nilai1 = sc.nextInt();
//        System.out.println("Masukkan nilai 2: ");
//        nilai2 = sc.nextInt();
//        
//        rata2 = (nilai1 + nilai2) / 2;
//                
//        if (rata2>=100){
//            rata2-=5;
//        }else{
//            rata2+=0;
//        }
//        System.out.println("Hasil Nilai Akhir adalah " + rata2);
//        
    }
   }
