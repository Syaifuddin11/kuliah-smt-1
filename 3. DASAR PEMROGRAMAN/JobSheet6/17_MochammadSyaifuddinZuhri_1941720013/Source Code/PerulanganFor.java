package JobSheet6.Perulangan;

import java.util.Scanner;

public class PerulanganFor {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        int angka, fac, i;
        
        System.out.println("========== PROGRAM MENGHITUNG NILAI FAKTORIAL ===========");
        System.out.print("Masukkan suatu angka : ");
        angka = sc.nextInt();
        
        fac = 1;
        
        for(i=1; i<=angka; i++){
            fac *= i;
            System.out.println("Factorial dari "+i+" = "+fac);
        }
        System.out.printf("Nilai faktorial angka tersebut adalah : %d \n", fac);
    }
}