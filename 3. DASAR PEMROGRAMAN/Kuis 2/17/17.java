package Kuis2Daspro;

import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
     
        System.out.println("===============================================");
        System.out.println("\tKUIS 2 PRAKTIKUM DASAR PEMROGRAMAN");
        System.out.println("===============================================");
        System.out.println("");
        System.out.println("-----------------------------------------------");
        System.out.println("\t\t PROFIL MAHASISWA");
        System.out.println("-----------------------------------------------");
        System.out.println("Nama\t\t: Mochammad Syaifuddin Zuhri");
        System.out.println("NIM\t\t: 1941720013");
        System.out.println("Kelas\t\t: TI 1E");
        System.out.println("-----------------------------------------------");
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("");
        System.out.print("Masukkan jumlah Mahasiswa : ");
        int jmlhMhs = input.nextInt();
        System.out.println("");
        
        System.out.println("---Masukkan nilai UAS Teori dan Praktikum---");
        System.out.println("");

        int nilaiPrak[][] = new int[jmlhMhs][1];
        int nilaiTeori[][] = new int[jmlhMhs][1];
        int sumPrak = 0, sumTeori = 0;
        double avgPrak, avgTeori, avgTotal; 
        
        for (int i = 0; i < jmlhMhs; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.println("** Mahasiswa ke-"+(i+1)+" **");
                System.out.print("Nilai UAS Teori = ");
                nilaiTeori[i][j]= input.nextInt();
                    if (nilaiTeori[i][j] >= 70){
                        System.out.println("Mahasiswa ke-"+(i+1)+" Lulus!");
                    } else {
                        System.out.println("Mahasiswa ke-"+(i+1)+" Tidak Lulus!");
                    }
                    
                System.out.print("Nilai UAS Praktikum = ");
                nilaiPrak[i][j] = input.nextInt();
                    if (nilaiPrak[i][j] >= 70){
                        System.out.println("Mahasiswa ke-"+(i+1)+" Lulus!");
                    } else {
                        System.out.println("Mahasiswa ke-"+(i+1)+" Tidak Lulus!");
                    }
                    
                    sumTeori += nilaiTeori[i][j];
                    sumPrak += nilaiPrak[i][j];
            }
            System.out.println("");
        }
        
        avgTeori = sumTeori/jmlhMhs;
        avgPrak = sumPrak/jmlhMhs;
        avgTotal = (avgTeori+avgPrak)/2;
                
        System.out.println("Rata-rata total nilai UAS Teori = "+avgTeori);
        System.out.println("Rata-rata total nilai UAS Praktikum = "+avgPrak);
        System.out.println("Nilai rata-rata UAS Teori dan Praktikum = "+avgTotal);
        System.out.println("");

    }
}
