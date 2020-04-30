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
public class tugas5 {
    public static void main(String[]args){
    int totalBelanja, potonganDiskon, totalBayar;
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Masukkan total belanja anda : ");
    totalBelanja = sc.nextInt();
    
    if (totalBelanja==200000){
        System.out.println("Total belanja anda masih kurang untuk mendapatkan diskon member");
        System.out.println("Total belanja anda adalah " + totalBelanja);
    } else if (totalBelanja>200000 && totalBelanja<500000){
        System.out.println("Anda mendapatkan potongan member Silver sebesar 2% \nTotal belanja anda adalah " + totalBelanja);
        potonganDiskon = (totalBelanja*2)/100;
        System.out.println("Potongan diskon member adalah " + potonganDiskon);
        totalBayar = totalBelanja - potonganDiskon;
        System.out.println("Total bayar anda adalah " + totalBayar);
    }else if (totalBelanja>500000 && totalBelanja<1000000){
        System.out.println("Anda mendapatkan potongan member Gold sebesar 5% \nTotal belanja anda adalah " + totalBelanja);
        potonganDiskon = (totalBelanja*5)/100;
        System.out.println("Potongan diskon member adalah " + potonganDiskon);
        totalBayar = totalBelanja - potonganDiskon;
        System.out.println("Total bayar anda adalah " + totalBayar);
    }else if (totalBelanja>1000000){       
        System.out.println("Anda mendapatkan potongan member Platinum sebesar 10% \nTotal belanja anda adalah " + totalBelanja);
        potonganDiskon = (totalBelanja*10)/100;
        System.out.println("Potongan diskon member adalah " + potonganDiskon);
        totalBayar = totalBelanja - potonganDiskon;
        System.out.println("Total bayar anda adalah " + totalBayar);
    }
}
}
