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
public class tugas1 {
    public static void main(String[]args){
        int umur;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan umur Anda : ");
        umur = sc.nextInt();
        
        if (umur>17){
            System.out.println("Boleh berkendara");
        } else {
            System.out.println("Tidak boleh berkendara");
        }
    }
}
