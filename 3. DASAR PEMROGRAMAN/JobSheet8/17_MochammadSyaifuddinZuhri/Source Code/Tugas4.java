package Array;

import java.util.Scanner;

public class Tugas4 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan isi array : ");
        int jmlhArray = input.nextInt();
        
        int arr[] = new int[jmlhArray];
        
        for (int i=0; i<jmlhArray; i++){
            System.out.print("Masukkan Array ke-"+i+" : ");
            arr[i] = input.nextInt();
        }
        System.out.println("");
        System.out.println("Data array awal : ");
        for (int i=0; i<jmlhArray; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        System.out.println("");
        System.out.print("Masukkan nilai yang ingin dihapus : ");
        int del = input.nextInt();
        
        System.out.println("Data array setelah dihapus :");
        for (int i=0; i<jmlhArray; i++){
            if (del == arr[i]){
                arr[i] = 0;
            } else {
                System.out.print(arr[i]+" ");
            }
        }    
        System.out.println("");
    }
}
