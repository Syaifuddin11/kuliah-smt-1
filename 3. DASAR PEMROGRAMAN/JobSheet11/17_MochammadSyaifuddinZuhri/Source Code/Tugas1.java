package JobSheetFungsi2;

import java.util.Scanner;

/*
Nama	: Mochammad Syaifuddin Zuhri
Kelas	: TI 1E
NIM	: 1941720013
*/

public class Tugas1 {
    
    static void tampilRekursif(int n){
        if ( n >= 0){
            System.out.print(n+" ");
            tampilRekursif(n-1);
        }
    }
    
    static void tampilIteratif(int n){
        for (int i = n; i >= 0; i--) {
            System.out.print(i+" ");
        }
    }
     
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah bilangan : ");
        int n = input.nextInt();
        System.out.println("== Menggunakan Fungsi Rekursif ==");
        System.out.print("Hasil Deret : ");tampilRekursif(n);
        System.out.println("");
        System.out.println("== Menggunakan Fungsi Iteratif ==");
        System.out.print("Hasil Deret : ");tampilIteratif(n);
        System.out.println("");

    }
}
