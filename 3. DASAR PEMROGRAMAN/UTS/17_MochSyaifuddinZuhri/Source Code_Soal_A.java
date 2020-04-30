package UTS;

import java.util.Scanner;

public class MidTest {
    public static void main(String[] args) {
        // Title
        System.out.println("*************************************************************************");
        System.out.println("\t\t\t   UJIAN TENGAH SEMESTER");
        System.out.println("\t\t\tPRAKTIKUM DASAR PEMROGRAMAN");
        System.out.println("*************************************************************************");
        System.out.println("");

        // Identitas Diri
        System.out.println("=========================================================================");
        System.out.println("\t\t\t    IDENTITAS MAHASISWA");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Nama \t\t\t\t: Mochammad Syaifuddin Zuhri");
        System.out.println("Kelas \t\t\t\t: TI 1E");
        System.out.println("NIM \t\t\t\t: 1941720013");
        System.out.println("=========================================================================");
        System.out.println("");
        
        // ===> SOAL MENGHITUNG VOLUME TABUNG DAN LUAS LINGKARAN <===
        
        System.out.println("=========================================================================");
        System.out.println("\tMENGHITUNG VOLUME TABUNG, LUAS LINGKARAN, DAN RATA-RATA");
        System.out.println("=========================================================================");
        System.out.println("");
        
        Scanner input = new Scanner (System.in);
        
        // *** Menghitung Volume Tabung ***
        System.out.println("-------------------------------------------------------------------------");
        System.out.print("Masukkan Jari-jari \t\t: ");
        int jari2 = input.nextInt();
        System.out.print("Masukkan Tinggi \t\t: ");
        int tinggi = input.nextInt();
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("");

        double phi = 3.14;
        
        if (jari2>0 && tinggi>0){

            // Perhitungan Volume 
            int volumeTabung = (int) (phi * jari2 * jari2 * tinggi);
            
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("Rumus Menghitung Volume Tabung \t: phi * r * r * t");
            System.out.println("Hasil Volume Tabung \t\t: "+volumeTabung+" cm3");
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("");

            // *** Menghitung Luas Lingkaran ***
            int luasLingkaran = (int) (2 * phi * jari2);
            
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("Rumus Menghitung Luas Lingkaran : phi * r * r");
            System.out.println("Hasil Luas Lingkaran \t\t: "+luasLingkaran+" cm2");
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("");

            // *** Menghitung Rata-rata Dua Bangun ***
            double avg = (volumeTabung + luasLingkaran)/2;

            System.out.println("-------------------------------------------------------------------------");
            System.out.println("Rumus Menghitung Rata-rata \t: (Volume Tabung + Luas Lingkaran) / 2 ");
            System.out.println("Hasil Rata-rata \t\t: "+avg);
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("");


            // Cek Kondisi Nilai
            if (avg>150){
                System.out.println("-------------------------------------------------------------------------");
                System.out.println("Hasil Perhitungan \t\t: Nilai Tinggi");
                System.out.println("-------------------------------------------------------------------------");
            } else {
                System.out.println("-------------------------------------------------------------------------");
                System.out.println("Hasil Perhitungan \t\t: Nilai Rendah");
                System.out.println("-------------------------------------------------------------------------");
            }
            
            System.out.println("");
            System.out.println("=========================================================================");
            System.out.println("\t\t\tPERHITUNGAN TELAH SELESAI");
            System.out.println("=========================================================================");
            System.out.println("");
        
       } else {
            // Jika tidak memenuhi kondisi pertama
            System.out.println("=========================================================================");
            System.out.println("Maaf, Nilai yang anda masukkan salah. Silahkan masukkan bilangan positif");
            System.out.println("=========================================================================");
            System.out.println("");
       }
  
    }
}
