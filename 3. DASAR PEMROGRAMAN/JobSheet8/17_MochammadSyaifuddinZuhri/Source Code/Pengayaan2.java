package Array;

import java.util.Scanner;

public class Pengayaan2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah array : ");
        int jmlhArray = input.nextInt();
        
        int arr[] = new int[jmlhArray];
        
        for (int i=0; i<jmlhArray; i++){
            System.out.print("Array ke-"+i+" : ");
            arr[i] = input.nextInt();
        }
        int temp = 0;
        for (int i=0; i<jmlhArray; i++){
            for (int j=1; j<jmlhArray; j++){
                if (arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Hasil Pengurutan : ");
        for (int i=0; i<jmlhArray; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }
}
