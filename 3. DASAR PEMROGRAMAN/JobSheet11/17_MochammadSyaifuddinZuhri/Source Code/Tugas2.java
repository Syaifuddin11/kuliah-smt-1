package JobSheetFungsi2;

import java.util.Scanner;

/*
Nama	: Mochammad Syaifuddin Zuhri
Kelas	: TI 1E
NIM	: 1941720013
*/

public class Tugas2 {
    
    static int tambahRekursif(int n){
        if (n > 0){
            System.out.print(n+" ");
            return (n + tambahRekursif(n-1));
        } else {
            return (0);
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan jumlah bilangan : ");
        int n = input.nextInt();
        System.out.println("\nHasil Penjumlahan : "+tambahRekursif(n));
    }
}
