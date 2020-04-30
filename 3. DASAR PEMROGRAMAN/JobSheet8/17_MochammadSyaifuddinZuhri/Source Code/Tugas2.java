package Array;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah Array : ");
        int jmlhArray = input.nextInt();
        
        int arr[] = new int[jmlhArray];
        
        for (int i=0; i<jmlhArray; i++){
            System.out.print("Masukkan Array ke-"+i+" : ");
            arr[i] = input.nextInt();
        }
        
        for (int i=0; i<jmlhArray; i++){
            if (arr[i]%2 == 0){
                System.out.println("Angka Genap : "+arr[i]);
            }
        }
        
        for (int i=0; i<jmlhArray; i++){
            if (arr[i]%2 == 1){
                System.out.println("Angka Ganjil : "+arr[i]);
            }
        }
        
    }
}
