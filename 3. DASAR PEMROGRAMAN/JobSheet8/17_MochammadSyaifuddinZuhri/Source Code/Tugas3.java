package Array;

import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        
        Scanner huruf = new Scanner (System.in);
        Scanner angka = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah MK yang diambil : ");
        int jmlhMK = angka.nextInt();
        
        double total =0;
        double ipk;
        String[] namaMK = new String[jmlhMK];
        String[] nilaiMK = new String[jmlhMK];
        int[] bobotMK = new int[jmlhMK];
        
        for (int i=0; i<jmlhMK; i++){
            System.out.print("Masukkan nama MK "+(i+1)+" : ");
            namaMK[i] = huruf.nextLine();
        }
        
        for (int i=0; i<nilaiMK.length ; i++){
            System.out.print("Masukkan bobot SKS "+namaMK[i]+" : ");
            bobotMK[i] = angka.nextInt();
            System.out.print("Masukkan nilai "+namaMK[i]+"(A,B+,B,C+,C,D,E) : ");
            nilaiMK[i] = huruf.next();
            
            switch(nilaiMK[i]){
                case "A":
                    total += 4;
                    break;
                case "B+":
                    total += 3.5;
                    break;
                case "B":
                    total += 3;
                    break;
                case "C+":
                    total += 2.5;
                    break;
                case "C":
                    total += 2;
                    break;                
                case "D":
                    total += 1;
                    break;
                case "E":
                    total += 0;
                    break;
                default:
                    System.out.println("Nilai yang anda masukkan salah");  
            }
        }
        
        ipk = total/jmlhMK;
        System.out.println("Nilai IPK : "+ipk);
        
    }
}
