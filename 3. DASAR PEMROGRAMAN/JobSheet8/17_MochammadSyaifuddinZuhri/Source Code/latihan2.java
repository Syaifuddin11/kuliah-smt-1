/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class latihan2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String buah[] = new String[5];
        
        for (int i=0; i<buah.length; i++){
            System.out.println("Buah ke-"+i+": ");
            buah[i] = input.nextLine();
        }
        
        for (String hasil : buah){
            System.out.println(hasil);
        }
        
        for (int i=0; i<buah.length; i++){
            System.out.println("Buah Ke-"+i+"adalah "+buah[i]);
        }
    }
}
