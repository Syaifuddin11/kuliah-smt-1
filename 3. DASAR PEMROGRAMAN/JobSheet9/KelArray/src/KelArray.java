package KelArray;
import java.util.Scanner;
public class KelArray {
    public static void main(String[] args) {
    
    Scanner angka = new Scanner (System.in);
    Scanner huruf = new Scanner (System.in);
    
      System.out.println("______________________________________________________");
      System.out.println("===============TOKO PERALATAN SEKOLAH=================");
      System.out.println("    Jl. Semanggi Barat No.22 Jatimulyo Jawa Timur");
      System.out.println("   Telp. 06227 5621 | 06227 5622 Kode Pos : 21184");
      System.out.println("______________________________________________________");
      
       System.out.println();
       System.out.print("Masukkan Banyak Barang Yang Ingin Di Jual : ");
       int BanyakBarang = angka.nextInt();
       
       int HargaBarang[] = new int [BanyakBarang];
       String[] NamaBarang = new String [BanyakBarang];
       int i;
       NamaBarang[0]="pensil";
       NamaBarang[1]="penggaris";
       HargaBarang[0]=2000;
       HargaBarang[1]=3000;
       System.out.println();
       
       for(int a=0;a<BanyakBarang;a++) {
       for (i=0; i<BanyakBarang; i++){
           System.out.println("Nama Barang  = " + NamaBarang[i]);
           System.out.println("Harga Barang = " + HargaBarang[i]);
        }
        System.out.println();
        System.out.print("Masukkan Barang Yang Ingin Di Beli: ");
        String CariBarang=huruf.nextLine();
        System.out.print("Barang Yang Anda Beli : " +CariBarang);
        System.out.println();
        System.out.print("Masukkan Banyak Barang Yang Ingin Anda Beli : ");
        int JumlahAlat=angka.nextInt();
        System.out.println(); 
        
        if(CariBarang.equalsIgnoreCase("Pensil")){
            System.out.println("Total Harga Barang Anda Adalah: Rp."+(2000*JumlahAlat));   
        }
        else {
            System.out.println("Total Harga Barang Anda Adalah: Rp."+(3000*JumlahAlat));  
        }
        System.out.println("____________________________________________________");
        System.out.println();
        System.out.print("Apakah Masih Ada Barang Yang Dibeli(1.Ya / 2.Tidak) = ");
        a=angka.nextInt();
        }
        System.out.println();
        System.out.println("==================TERIMA KASIH=====================");    
    }
}