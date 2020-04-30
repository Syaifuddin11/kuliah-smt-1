package JobSheetFungsi1;

/*
Nama    : Mochammad Syaifuddin Zuhri
Kelas   : TI 1E
NIM     : 1941720013
*/

import java.util.Scanner;

public class Praktikum4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai 1 : ");
        int nilai1 = input.nextInt();
        System.out.print("Masukkan nilai 2 : ");
        int nilai2 = input.nextInt();
        
        int hasil = kurang(nilai1,nilai2);
        System.out.printf("Hasil akhir adalah %d\n", hasil);
    }

    private static int kurang(int a, int b) {
        a += 7;
        b += 3;
        int x = kali(a,b);
        return x;
    }

    private static int kali(int c, int d) {
        int h = (c + 10) % (d + 19);
        return h;
    }
}
