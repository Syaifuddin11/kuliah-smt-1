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
public class contoh3 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        int bayar;
        
        System.out.println("Masukkan total belanja anda :");
        bayar = input.nextInt();
        
        if (bayar>=2000000){
            System.out.println("Selamat anda mendapatkan hadiah kompor gas");
        } else if (bayar>=1000000){
            System.out.println("Selamat anda mendapatkan hadiah teflon");
        } else if (bayar>=500000){
            System.out.println("Selamat anda mendapatkan hadiah piring");
        } else {
            System.out.println("Maaf anda belum beruntung, tingkatkan belanja anda");
        }
    }
}
