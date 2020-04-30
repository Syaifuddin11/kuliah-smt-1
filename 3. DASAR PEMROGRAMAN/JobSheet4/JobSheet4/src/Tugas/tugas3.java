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
public class tugas3 {
    public static void main(String[]args){
        int uas, uts, kuis, tugas, nilaiAkhir;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan nilai uas : ");
        uas = sc.nextInt();
        System.out.println("Masukkan nilai uas : ");
        uts = sc.nextInt();
        System.out.println("Masukkan nilai kuis : ");
        kuis = sc.nextInt();
        System.out.println("Masukkan nilai tugas : ");
        tugas = sc.nextInt();
        
        
        nilaiAkhir = ((40 * uas)/100) + ((30 * uts)/100) + ((10 * kuis)/100) + ((20 * tugas)/100);
        
        if (nilaiAkhir<=65){
            System.out.println("Mahasiswa mendapatkan remidi");
        } else {
            System.out.println("Mahasiswa Lulus");
        }
    }
}
