package Array;

import java.util.Scanner;

public class Contoh3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] bil = new int[5];
        
        for (int i=0; i<5; i++){
            System.out.print("Masukkan Bilangan ke-"+i+": ");
            bil[i] = input.nextInt();
        }

        for (int i=0; i<5; i++){
            System.out.println("Isi Bilangan Ke-"+i+" adalah "+bil[i]);
        }
    }
}
