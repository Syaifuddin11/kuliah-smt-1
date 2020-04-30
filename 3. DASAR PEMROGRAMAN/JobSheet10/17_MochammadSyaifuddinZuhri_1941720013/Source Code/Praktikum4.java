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
        
        String hasil2 = cekNilai(nilai1, nilai2);
        System.out.printf("Cek Nilai : %s\n", hasil2);

        int hasil = kurang(nilai1,nilai2);
        System.out.printf("Hasil akhir adalah %d\n", hasil);
    }

    private static int kurang(int a, int b) {
        a += 7;
        b += 3;
        int x = a + b;
        return x;
    }

    private static int kali(int c, int d) {
        int h = (c + 10) % (d + 19);
        return h;
    }
    
    static String cekNilai(int nilai1, int nilai2){
        String hasil1;
        if (nilai1 >= 0 && nilai2 >= 0){
            hasil1 = "Nilai Benar";
        } else {
            hasil1 = "Nilai Salah, Nilai Minimal 0";
        }
       return hasil1;
    }
}
