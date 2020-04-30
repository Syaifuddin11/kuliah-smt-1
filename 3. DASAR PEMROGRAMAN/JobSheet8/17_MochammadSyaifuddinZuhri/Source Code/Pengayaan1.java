package Array;

import java.util.Scanner;

public class Pengayaan1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah array : ");
        int jmlhArray = input.nextInt();
        
        int arr[] = new int[jmlhArray];
        
        for (int i=0; i<jmlhArray; i++){
            System.out.print("Array ke-"+i+" : ");
            arr[i] = input.nextInt();
        }
        
        System.out.print("Masukkan key yang dicari : ");
        int key = input.nextInt();
        int hasil = 0;
        
        for (int i=0; i <jmlhArray; i++){
            if (key == arr[i]){
                hasil = i;
            }
        }
        System.out.println("Key ada diposisi index ke : "+hasil);
    }
}
