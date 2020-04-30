package JobSheetFungsi2;

import java.util.Scanner;

/*
Nama	: Mochammad Syaifuddin Zuhri
Kelas	: TI 1E
NIM	: 1941720013
*/

public class Tugas4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka pertama\t= ");
        int bil1 = sc.nextInt();
        System.out.print("Masukkan angka kedua\t= ");
        int bil2 = sc.nextInt();	
        System.out.println("FPB dari "+bil1+" dan "+bil2+" adalah "+FPB(bil1,bil2));
    }
    
    static int FPB (int a, int b){
        if ((b<=a)&&(a%b==0))
            return b;
        else if (a<b)
            return FPB(b, a);
        else
            return FPB(b, a%b);
	}    
}
