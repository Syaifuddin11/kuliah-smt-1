package JobSheet6.Perulangan;

import java.util.Scanner;

public class PerulanganDoWhile2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int angka, b;
        
        System.out.println("============= PROGRAM LOOP DENGAN BREAK ==============");
        
        b =0;
        do{
            System.out.print("Masukkan angka : ");
            angka = sc.nextInt();
            b += angka;
            if(b>50) break;
        } while (true);
        System.out.printf("Angka akan berhenti pada jumlah angka : %d \n", b);
        
    }
}
