package Array;

import java.util.Scanner;

public class Praktikum2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int[] nilaiUAS = new int[6];
        
        for (int i=0; i<6; i++){
            System.out.print("Masukkan nilai UAS ke-"+i+" : ");
            nilaiUAS[i] = input.nextInt();
        }
        
        //Modifikasi
//        for (int i=0; i<nilaiUAS.length; i++){
//            System.out.print("Masukkan nilai UAS ke-"+i+" : ");
//            nilaiUAS[i] = input.nextInt();
//        }
        
//        for (int i=0; i<6; i++){
//            System.out.println("Nilai UAS ke-"+i+" adalah "+nilaiUAS[i]);
//        }
        
        //Modifikasi
//        for (int i=0; i<nilaiUAS.length; i++){
//            if (nilaiUAS[i] > 70){
//                System.out.println("Mahasiswa ke-"+i+" Lulus!");              
//            }
//        }
        
        //Modifikasi
        int sumLulus=0, lulus=0, sumTLulus=0, tLulus=0;
        double avg1, avg2;
        for (int i=0; i<nilaiUAS.length; i++){
            if (nilaiUAS[i] > 70){
                sumLulus += nilaiUAS[i];
                lulus += 1;
                System.out.println("Mahasiswa ke-"+i+" Lulus!");              
            } else {
                sumTLulus += nilaiUAS[i];
                tLulus += 1;
                System.out.println("Mahasiswa ke-"+i+" Tidak Lulus!");
            }
        }
        
        avg1 = sumLulus/lulus;
        avg2 = sumTLulus/tLulus;
        System.out.println("Nilai rata-rata mahasiswa yang lulus : "+avg1);
        System.out.println("Nilai rata-rata mahasiswa yang tidak lulus : "+avg2);

    }
}
