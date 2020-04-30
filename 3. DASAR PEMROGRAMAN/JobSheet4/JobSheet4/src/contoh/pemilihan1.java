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
public class pemilihan1 {
    public static void main(String[]args){
        int bil;
        System.out.println("Masukkan Bilangan: ");
        Scanner sc = new Scanner(System.in);
        bil = sc.nextInt();
//        
//        String output=(bil%2==0) ? "Bilangan Genap":"Bilangan Ganjil";
//        System.out.println(output);
        
        if (bil%2==0){
            System.out.println("BilAngan Genap");
        } else {
            System.out.println("Bilangan Ganjil");
        }
    }
}
