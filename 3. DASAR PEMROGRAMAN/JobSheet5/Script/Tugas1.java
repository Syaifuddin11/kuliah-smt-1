package JobSheet5;

import java.util.Scanner;

public class Tugas1 {
    public static void main (String[]args){
    //Scanner
    Scanner sc = new Scanner(System.in);
    
    //deklarasi
    int sisi1, sisi2, sisi3;
    
    //Pemasukan Nilai
    System.out.println("=== Menentukan Jenis Segitiga Berdasarkan Ketiga Sisinya ===");
    System.out.print("Masukkan sisi 1 :");
    sisi1 = sc.nextInt();
    System.out.print("Masukkan sisi 2 :");
    sisi2 = sc.nextInt();
    System.out.print("Masukkan sisi 3 : ");
    sisi3 = sc.nextInt();
    
    //Pengecekan Nilai
    if (sisi1==sisi2  && sisi2==sisi3 && sisi2==sisi3){
        System.out.println("Segitiga tersebut termasuk segitiga sama sisi");
    } else if (sisi1==sisi2 || sisi1==sisi2 || sisi2==sisi3){
        System.out.println("Segitiga tersebut termasuk segitiga sama kaki");
    } else {
        System.out.println("Segitigas tersebut termasuk segitiga sembarang");
    }
    
    }
}
