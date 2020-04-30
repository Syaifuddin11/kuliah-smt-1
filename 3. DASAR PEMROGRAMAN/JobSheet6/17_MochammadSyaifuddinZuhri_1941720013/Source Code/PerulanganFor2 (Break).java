package JobSheet6.Perulangan;

import java.util.Scanner;

public class PerulanganFor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int angka, b;
        
        System.out.println("============= PROGRAM LOOP DENGAN BREAK ==============");
        
        for(b=0; true;){
            System.out.print("Masukkan angka : ");
            angka = sc.nextInt();
            b += angka;
            System.out.println("Hasil Penjumlahan = "+b);
            if(b>50) break;
        }
        System.out.printf("Angka akan berhenti pada jumlah angka : %d \n", b);
        
    }
}
