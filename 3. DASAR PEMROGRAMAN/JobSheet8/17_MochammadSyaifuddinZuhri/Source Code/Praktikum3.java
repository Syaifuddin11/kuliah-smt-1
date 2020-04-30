    package Array;

import java.util.Scanner;

public class Praktikum3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int jmlhMHS = input.nextInt();
        
        int[] nilaiMHS = new int[jmlhMHS];
        int total=0, totalLulus = 0, totaltLulus = 0, lulus=0, tLulus=0;
        double rata, rataLulus, ratatLulus; 
        
        for (int i=0; i<jmlhMHS; i++){
            System.out.print("Masukkan nilai Mahasiswa ke-"+(i+1)+" : ");
            nilaiMHS[i] = input.nextInt();
        }
        
        for (int i=0; i<jmlhMHS; i++){
            if (nilaiMHS[i] > 70){
                totalLulus += nilaiMHS[i];
                lulus++;
            } else {
                totaltLulus += nilaiMHS[i];
                tLulus++;
            }
            total += nilaiMHS[i];
        }
        rata = total/jmlhMHS;
        rataLulus = totalLulus/lulus;
        ratatLulus = totaltLulus/tLulus;
        
        System.out.println("Nilai rata-rata kelas : "+rata);
        System.out.println("Nilai rata-rata yang lulus : "+rataLulus);
        System.out.println("Nilai rata-rata yang tidak lulus : "+ratatLulus);
    }
}
