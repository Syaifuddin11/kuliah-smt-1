package JobSheet6.Perulangan;

import java.util.Scanner;

public class nomor2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int hasil = 0, n = 1, ganjil =1, kuadrat = 0;
        double sum = 0;
        float avg;
        
        System.out.println("Menghitung Jumlah Kuadrat Bilangan Ganjil dari N Bilangan");
        System.out.println("---------------------------------------------------------");
        
        System.out.print("Masukkan Range Bilangan : ");
        int range = input.nextInt();

        if (range%2==1){
            int jmlh = (range /2)+1;
            System.out.println("Banyaknya bilangan Ganjil dari 1 sampai "+range+" = "+jmlh); 
        } else {
             int jmlh = range /2;
            System.out.println("Banyaknya bilangan Ganjil dari 1 sampai "+range+" = "+jmlh); 
        }
        
        for (int i =0; i<=range; i++){
            if (i %2 == 1){
                kuadrat = i * i;
                sum += kuadrat;
                n += 2;
                ganjil += 1;
            }
        }
        avg = (float) (sum/(ganjil - 1));
        System.out.println("Jumlah bilangan Ganjil dari 1 sampai "+range+" = "+sum);
        System.out.println("Rata-rata bilangan Ganjil dari 1 sampai "+range+" = "+avg);

    }
}
