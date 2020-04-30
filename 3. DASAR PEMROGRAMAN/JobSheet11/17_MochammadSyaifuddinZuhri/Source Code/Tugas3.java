package JobSheetFungsi2;

import java.util.Scanner;

/*
Nama	: Mochammad Syaifuddin Zuhri
Kelas	: TI 1E
NIM	: 1941720013
*/

public class Tugas3 {
    static boolean cekBilPrima(int bil){
        if (bil > 1)
            return (nilaiRekursif(bil, bil) == 2);
         else 
            return false;
        
    }

    static int nilaiRekursif(int bil, int bagi) {
        if (bagi==1) {
            return 1;
        }
        else if(bil % bagi ==0){
            return 1 + nilaiRekursif(bil, bagi-1);
        }
        else{
            return 0 + nilaiRekursif(bil, bagi-1);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.print("Masukkan angka = ");
            int angka = sc.nextInt();
            if (cekBilPrima(angka)) {
                System.out.println("Angka yang anda masukan adalah bilangan PRIMA");	
            }
            else{
                System.out.println("Angka yang anda masukan BUKAN bilangan PRIMA");
            }   
            System.out.println("");
        }
    }
}
