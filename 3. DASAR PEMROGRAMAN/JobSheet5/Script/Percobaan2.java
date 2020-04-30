package JobSheet5;

import java.util.Scanner;


public class Percobaan2 {
    public static void main(String[]args){
        //Scanner
        Scanner sc = new Scanner(System.in);
        
        //Deklarasi dan Variabel
        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;
        
        //Pemasukan Nilai
        System.out.print("Masukkan Kategori (pekerja/pebisnis): ");
        kategori = sc.nextLine();
        System.out.print("Masukkan besarnya penghasilan : ");
        penghasilan = sc.nextInt();
        
        //Pengecekan kondisi bersarang
        if(penghasilan < 1){
        if (kategori.equalsIgnoreCase("pekerja")){
                if (penghasilan < 1){
                    System.out.println("Penghasilan yang anda masukkan tidak valid");    
                }else if (penghasilan <= 2000000){
                    pajak = 0.1;
                gajiBersih = (int) (penghasilan - (penghasilan * pajak));
                System.out.println("Gaji bersih yang Anda terima adalah " + gajiBersih);
                } else if (penghasilan <= 3000000){
                    pajak = 0.15;
                gajiBersih = (int) (penghasilan - (penghasilan * pajak));
                System.out.println("Gaji bersih yang Anda terima adalah " + gajiBersih);
                } else {
                    pajak = 0.2;
                 gajiBersih = (int) (penghasilan - (penghasilan * pajak));
                System.out.println("Gaji bersih yang Anda terima adalah " + gajiBersih);
                }
        } else if (kategori.equals("pebisnis")){
                if (penghasilan < 1){
                    System.out.println("Penghasilan yang anda masukkan tidak valid");    
                }else if (penghasilan <= 2500000){
                    pajak = 0.15;
                gajiBersih = (int) (penghasilan - (penghasilan * pajak));
                System.out.println("Gaji bersih yang Anda terima adalah " + gajiBersih);
                } else if (penghasilan <= 3500000){
                    pajak = 0.2;
                gajiBersih = (int) (penghasilan - (penghasilan * pajak));
                System.out.println("Gaji bersih yang Anda terima adalah " + gajiBersih);
                } else {
                    pajak = 0.25;
                 gajiBersih = (int) (penghasilan - (penghasilan * pajak));
                System.out.println("Gaji bersih yang Anda terima adalah " + gajiBersih);
                }
         }
      } 
   }
}


