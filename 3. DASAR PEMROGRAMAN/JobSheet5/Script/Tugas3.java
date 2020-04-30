package JobSheet5;

import java.util.Scanner;

public class Tugas3 {
    public static void main (String[]args){
        //Scanner
        Scanner angka = new Scanner(System.in);
        Scanner huruf = new Scanner(System.in);
        
        //deklarasi
        String namaMakanan, kirim;
        int total, biayaKirim, hargaMakanan;
        
        //Pemasukan Nilai
        System.out.print("Masukkan nama makanan : ");
        namaMakanan = huruf.nextLine();
        System.out.print("Masukkan harga makanan : ");
        hargaMakanan = angka.nextInt();
        System.out.print("Apakah Anda ingin pengiriman express (0 = iya, 1 = tidak)? ");
        kirim = huruf.nextLine();
        System.out.println("===== STRUK PEMBELIAN =====");
        
        //pengecekan
        if (kirim.equalsIgnoreCase("0")){
            if(hargaMakanan < 100000){
                biayaKirim = 20000;
            }else{
                biayaKirim = 30000;
            }
            total = hargaMakanan + biayaKirim;
            System.out.println(namaMakanan +"\t\t\t"+"Rp "+ hargaMakanan);
            System.out.println("Biaya pengiriman \t\tRp "+ biayaKirim);
            System.out.println("TOTAL \t\t\t\tRp "+total);
        } else {
            biayaKirim = 45000;
            total= hargaMakanan + biayaKirim;
            System.out.println(namaMakanan +"\t\t\tRp "+ hargaMakanan);
            System.out.println("Biaya pengiriman \t\tRp "+ biayaKirim);
            System.out.println("TOTAL \t\t\t\tRp "+total);
        }
    }
}
