/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class tugas2 {
    public static void main(String[]args){
        int bil1, bil2;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan bilangan 1 : ");
        bil1 = sc.nextInt();
        System.out.println("Masukkan bilangan 2 : ");
        bil2 = sc.nextInt();
        
      
        if (bil1>bil2){
        System.out.println("Bilangan terbesar adalah bilangan 1 yaitu " + bil1);
         } else {
        System.out.println("Bilangan terbesar adalah bilangan 2 yaitu " + bil2);
        }
    }
    
}
