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
public class percobaan3 {
    public static void main(String[]args){
       int umur;
        
       Scanner sc = new Scanner(System.in);  
       System.out.println("Masukkan umur anda: ");
       umur = sc.nextInt();
       
       if (umur>60){
           System.out.println("Lansia");
       } else if (umur>45) {
           System.out.println("Tua");
       }else if (umur>17) {
           System.out.println("Dewasa");
       }else if (umur>5) {
           System.out.println("Anak-anak");
       }else if (umur>0){
           System.out.println("Balita");
       }else if (umur<=0){
           System.out.println("Maaf umur yang anda masukkan salah");
       }
    }

}

