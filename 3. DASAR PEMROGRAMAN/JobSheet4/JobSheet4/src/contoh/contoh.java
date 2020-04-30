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
public class contoh {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        int angka;
        
        System.out.println("Masukkan angka : ");
        angka = input.nextInt();
        
        if (angka>70){
            System.out.println("Selamat anda dinyatakan diterima");
        }
        
    }
}
