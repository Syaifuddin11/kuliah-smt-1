package TugasArray2D;

import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukan jumlah baris : ");
        int bar = sc.nextInt();
        System.out.print("Masukan jumlah kolom : ");
        int kol = sc.nextInt();
        System.out.println("");
        int[][] arr = new int[bar][kol];
        
        for (int i=0; i < bar; i++){
            for (int j=0; j < kol; j++){
                System.out.print("Masukan nilai pada baris ke " + i + " kolom ke " +j+ " : ");
                arr[i][j] = sc.nextInt();
            }
        } System.out.println("");
        
        System.out.println("=============================================");
        System.out.println("Berikut tampilan array :");
        for (int i=0; i<bar; i++){
            for (int j=0; j<kol; j++){
                System.out.print(" "+arr[i][j]+" ");
            }System.out.println("");
        }
        System.out.println("=============================================");
        
        int sum=0;  
        for(int i=0;i<arr.length;i++){
            for (int j=0; j<arr.length; j++){
                sum += arr[i][j];
            }
        }
        System.out.println("Total nilai Array adalah "+sum);
        
        System.out.println("");
        System.out.print("Masukan nilai yang akan dicari : ");
        int cari = sc.nextInt();
        
        int a =0;
        for(int i=0;i<arr.length;i++){
            for (int j=0; j<arr.length; j++){
                if(arr[i][j] != cari){ 
                    a += 1;
                }else if (arr[i][j] == cari){
                    System.out.println("Nilai "+cari+" terletak pada indeks baris ke " +i+ " dan indeks kolom ke " +j);
                    break;
                } 
            }
        }
    }
}
