package JobSheet6.Perulangan;

import java.util.Scanner;

public class nomor1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int hasil = 0;
        double avg;
        
        System.out.println("Menghitung Jumlah Bilangan Genap dari N Bilangan");
        System.out.println("------------------------------------------------");
        
        System.out.print("Masukkan Range Bilangan : ");
        int range = input.nextInt();
        
        int jmlh = range/2;
        System.out.println("Banyaknya Bilangan Genap Dari 1 sampai "+range+" = " +jmlh);
        
        for (int i = 1; i<=jmlh; i++){
            int bilGenap = i + i;
            hasil = hasil + bilGenap;
        }
            avg = hasil/jmlh;
        System.out.println("Jumlah Bilangan Genap Dari 1 sampai "+range+" = " +hasil);
        System.out.println("Rata-rata Bilangan Genap dari 1 sampai "+range+" = " +avg);
        
    }
}
