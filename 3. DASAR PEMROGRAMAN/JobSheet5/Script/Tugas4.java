package JobSheet5;

import java.util.Scanner;

public class Tugas4 {
    public static void main(String[]args){
        //Scanner
        Scanner angka = new Scanner(System.in);
        Scanner huruf = new Scanner(System.in);
        
        
        //Deklarasi
        int menu, sisi, luas, alas, tinggi, volume, jari2;
        double phi = 3.14;
        String pilih;
        
        System.out.println("==== Menghitung Luas dan Volume =====");
        System.out.print("Masukkan menu : ");
        menu = angka.nextInt();
        
        //Pengecekan
        switch (menu){
            case 1:
                System.out.println("a. Persegi");
                System.out.println("b. Segitiga");
                
                System.out.print("Pilih a atau b : ");
                pilih = huruf.nextLine();

                if (pilih.equalsIgnoreCase("a")){
                    System.out.print("Masukkan sisi : ");
                    sisi = angka.nextInt();
                    
                    luas = sisi * sisi;
                    System.out.println("Luas pesergi adalah "+luas);
                    
                }else if (pilih.equalsIgnoreCase("b")){
                    System.out.print("Masukkan alas : ");
                    alas = angka.nextInt();
                    System.out.print("Masukkan tinggi : ");
                    tinggi = angka.nextInt();
                    
                    luas = (int) ((alas * tinggi)*0.5);
                    System.out.println("Luas segitiga adalah "+luas);
                    
                } else {
                    System.out.println("Nilai yang Anda masukkan salah");
                }
                break;
                
            case 2:
                System.out.println("a. Kubus");
                System.out.println("b. Tabung");
                
                System.out.print("Pilih a atau b : ");
                pilih = huruf.nextLine();

                if (pilih.equalsIgnoreCase("a")){
                    System.out.print("Masukkan sisi : ");
                    sisi = angka.nextInt();
                    
                    volume = sisi * sisi * sisi;
                    System.out.println("Volume kubus adalah "+volume);
                    
                }else if (pilih.equalsIgnoreCase("b")){
                    System.out.print("Masukkan jari-jari : ");
                    jari2 = angka.nextInt();
                    System.out.print("Masukkan tinggi : ");
                    tinggi = angka.nextInt();
                    
                    volume = (int) (phi * jari2 * jari2 * tinggi);
                    System.out.println("Volume Tabung adalah "+volume);
                } else {
                    System.out.println("Nilai yang Anda masukkan salah");
                }
                break;
            default:
                    System.out.println("Nilai yang Anda masukkan salah");
        }
    }
}
