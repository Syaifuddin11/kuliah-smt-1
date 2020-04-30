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
public class tugas4 {
    public static void main(String[]args){
        int gajiPokok, uangMakan, uangTransport, totalGaji,totalPajak ;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan gaji pokok :");
        gajiPokok = sc.nextInt();
        System.out.println("Masukkan uang makan :");
        uangMakan = sc.nextInt();
        System.out.println("Masukkan uang transport :");
        uangTransport = sc.nextInt();
        
        totalGaji = gajiPokok + uangMakan + uangTransport;
        
        if (totalGaji>1000000){
           totalPajak = (totalGaji*10)/100 ;
           totalGaji = totalGaji - totalPajak;
           System.out.println("Total Gaji adalah " + totalGaji);
        }else{
           System.out.println("Total Gaji adalah ");
        }
        
    }
}
