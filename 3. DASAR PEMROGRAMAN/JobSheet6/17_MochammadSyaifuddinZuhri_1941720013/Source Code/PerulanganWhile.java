package JobSheet6.Perulangan;

import java.util.Scanner;

public class PerulanganWhile {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        int angka, fac, i;
        
        System.out.println("========== PROGRAM MENGHITUNG NILAI FAKTORIAL ===========");
        System.out.print("Masukkan suatu angka : ");
        angka = sc.nextInt();
        
        fac = 1;
        i = 1;
        
        while (i<=angka) {
            fac *= i;
            System.out.println("Factorial dari "+i+" = "+fac);
            i++;
        }
        System.out.printf("Nilai faktorial angka tersebut adalah : %d \n", fac);
    }
}