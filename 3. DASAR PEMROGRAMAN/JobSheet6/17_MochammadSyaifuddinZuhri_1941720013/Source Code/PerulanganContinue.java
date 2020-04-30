package JobSheet6.Perulangan;

import java.util.Scanner;

public class PerulanganContinue {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int angka, b, i , count;
        double avg;
        
        System.out.println("============= PROGRAM LOOP DENGAN CONTINUE ==============");
        
        b =0;
        count = 0;
        
        for(i=0; i<5; i++){
            System.out.print("Masukkan angka : ");
            angka = sc.nextInt();
            
            if(angka>=40) continue;;
            b += angka;
            count++;
        }
        avg = (double)b/count;
        System.out.printf("Rata-rata angka kurang dari 40 : %.2f", avg);
        
    }
}

