package Array;

import java.util.Scanner;

public class Contoh4 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int N;
        int[] arr;
        
        System.out.print("Masukkan Jumlah Elemen Array : ");
        N = input.nextInt();
        
        arr = new int[N];
        
        for (int i=0; i<N; i++){
            System.out.print("Masukkan Array Ke-"+i+" : ");
            arr[i] = input.nextInt();
        }
        for (int i=0; i<N; i++){
            System.out.println("Array ke-"+i+" adalah "+arr[i]);
        }
    }
}
