package Array;

import java.util.Scanner;

public class Tugas5 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan isi array : ");
        int jmlhArray = input.nextInt();
        
        int arr[] = new int[jmlhArray];
        int max = arr[0];
        int min = arr[0];
        
        for (int i=0; i<jmlhArray; i++){
            System.out.print("Masukkan Array ke-"+i+" : ");
            arr[i] = input.nextInt();
            
            if (max < arr[i]){
                max = arr[i];
            } else if (min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Bilangan terbesar adalah "+max);
    }
}
