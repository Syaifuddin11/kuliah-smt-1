package JobSheetFungsi2;

import java.util.Scanner;

/*
Nama	: Mochammad Syaifuddin Zuhri
Kelas	: TI 1E
NIM	: 1941720013
*/

public class Tugas5 {
    static Scanner sc = new Scanner(System.in);
    static int fibo1(int n){
        if (n <= 2){
            return 0;
        } else if (n == 3){
            return 1;
        } else {
            return fibo1(n-1) + fibo1(n-2);
        }
    }
    
    static int fibo2(int n){
        if (n == 0){
            return 0;
        } else if (n <= 3){
            return 1;
        } else {
            return fibo2(n-1) + fibo2(n-2);
        }
    }
    
    static int fibo3(int n){
        if (n == 0){
            return 0;
        } else if (n == 1){
            return 1;
        } else {
            return fibo3(n-1) + fibo3(n-2);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("---------------------------------------------------------");
        System.out.println("\t   |\t    Jumlah Pasangan\t |");
        System.out.println("Bulan Ke-  |.............................| Total Pasangan");
        System.out.println("\t   | Produktif | Belum Produktif |   ");
        System.out.println("---------------------------------------------------------");
        int n = 12;
        for (int i = 1; i <= n; i++) {
            System.out.println("    " +i+"\t\t"+fibo1(i) + "\t\t" + fibo2(i) + "\t\t" + fibo3(i));
        }
        System.out.println("---------------------------------------------------------");
        
        System.out.println("Total Pasangan Kelinci Pada Bulan Ke-"+n+" adalah "+fibo3(n));
        System.out.println("");

    }
}
