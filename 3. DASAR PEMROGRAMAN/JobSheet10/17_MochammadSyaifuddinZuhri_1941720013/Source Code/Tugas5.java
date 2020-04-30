package JobSheetFungsi1;

import java.util.Scanner;

/*
Nama    : Mochammad Syaifuddin Zuhri
Kelas   : TI 1E
NIM     : 1941720013
*/

public class Tugas5 {
    
    private static Scanner input = new Scanner(System.in);
    static int sum = 0;
    
    public static void main(String[] args) {
     
        int nilai[] = new int[10];
        inNilai(nilai);
        
        double hasilRata = rata(sum);
        System.out.println("Jumlah Nilai Mahasiswa : "+sum);
        System.out.println("Jumlah Rata-rata Nilai Mahasiswa : " + hasilRata);
        
        int nilaiMax = max(nilai);
        System.out.printf("Nilai Maksimal : %d\n", nilaiMax);
        
        int nilaiMin = min(nilai);
        System.out.printf("Nilai Minimal : %d\n", nilaiMin);
    }
       
    static void inNilai(int nilai[]){
        sum=0;
        for (int i = 0; i < nilai.length; i++) {
            System.out.printf("Masukkan Nilai Mahasiswa Ke-%d : ", (i+1));
            nilai[i] = input.nextInt();
            sum += nilai[i];
        }
    }
    
    static double rata(int sum){
        double hasil;
        hasil = (double) sum/10;
        return hasil;
    }
    
    static int min(int nilai[]){
        int min = nilai[0];
        for (int i = 0; i < nilai.length; i++) {
            if (min > nilai[i]){
                min = nilai[i];
            }
        }
        return min;
    }
    
    static int max(int nilai[]){
        int max = nilai[0];
        for (int i = 0; i < nilai.length; i++) {
            if (max < nilai[i]){
                max = nilai[i];
            }
        }
        return max;
    }
}
