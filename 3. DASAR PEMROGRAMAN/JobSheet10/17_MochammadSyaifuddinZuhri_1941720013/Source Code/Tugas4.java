package JobSheetFungsi1;

/*
Nama    : Mochammad Syaifuddin Zuhri
Kelas   : TI 1E
NIM     : 1941720013
*/

import java.util.Scanner;

public class Tugas4 {
    
    private static Scanner input = new Scanner(System.in);
    static int sum = 0;
    
    public static void main(String[] args) {
     
        int nilai[] = new int[10];
        inNilai(nilai);
        double hasilRata = rata(sum);
        System.out.println("Jumlah Nilai Mahasiswa : "+sum);
        System.out.println("Jumlah Rata-rata Nilai Mahasiswa : " + hasilRata);
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
}
