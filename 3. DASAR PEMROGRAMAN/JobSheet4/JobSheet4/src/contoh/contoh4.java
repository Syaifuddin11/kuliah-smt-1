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
public class contoh4 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        int angka;
        
        System.out.println("Masukkan kode kelas anda :");
        angka = input.nextInt();
        
        switch(angka){
        case 1:
        System.out.println("Kelas 1");
        break;
        case 2:
        System.out.println("Kelas 2");
        break;
        case 3:
        System.out.println("Kelas 3");
        break;
        case 4:
        System.out.println("Kelas 4");
        break;
            
        default:
            System.out.println("Kode yang anda masukkan salah");
    }
    }
}
