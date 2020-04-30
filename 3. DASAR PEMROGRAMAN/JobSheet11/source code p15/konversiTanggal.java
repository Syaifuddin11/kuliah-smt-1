/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package p15;

import java.util.Scanner;

/**
 *
 * @author yoga 260
 */
public class konversiTanggal {
    static Scanner input = new Scanner(System.in);
    static String awal;
    static String akhir  ;
    
    public static void main(String[] args) {  
    inputAwal(awal); 
    inputAkhir(akhir);  
    
    konversiTanggal (awal, akhir);        
    }
    
    static void inputAwal (String tanggalAwal){
      System.out.println("Format tgl/bln/thn contoh 17/01/2019");
      System.out.println("Silahkan inputkan tanggal peminjaman Anda");
   
     awal = input.nextLine();
     System.out.println("Tanggal Peminjaman : "+awal);
    }
    
     static void inputAkhir (String tanggalAkhir){
     System.out.println("\nSilahkan inputkan tanggal pengembalian Anda");
     akhir = input.nextLine();
     System.out.println("Tanggal Pengembalian : "+akhir);
    }
     
    static void konversiTanggal (String awal, String akhir){
        int tahunK = Integer.parseInt(awal.substring(6, 10));
        int bulanK = Integer.parseInt(awal.substring(3, 5));
        int hariK = Integer.parseInt(awal.substring(0, 2));

        int tahunH = Integer.parseInt(akhir.substring(6, 10));
        int bulanH = Integer.parseInt(akhir.substring(3, 5));
        int hariH = Integer.parseInt(akhir.substring(0, 2));

        int hari = hariH - hariK;
        int bulan = (bulanH - bulanK) * 30;
        int tahun = (tahunH - tahunK) * 365;

        int selisih = hari + bulan + tahun;
        
        System.out.println("Lama Peminjaman : "+selisih+" Hari");
    }
}
