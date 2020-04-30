package JobSheetFungsi1;

/*
Nama    : Mochammad Syaifuddin Zuhri
Kelas   : TI 1E
NIM     : 1941720013
*/

import java.util.Scanner;

public class Tugas3 {
    
    private static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        int arr[] = new int[11];
        array(arr);
    }
    
    static void array(int arr[]){
        for (int i = 0; i < 11 ; i++) {
            if (i % 2 == 0){
                System.out.printf("Masukkan Array [%d] : ", i);
                arr[i] = input.nextInt();
            }

            
        }
    }
}
