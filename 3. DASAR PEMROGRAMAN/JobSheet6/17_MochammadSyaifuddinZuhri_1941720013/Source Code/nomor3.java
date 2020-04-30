package JobSheet6.Perulangan;

import java.util.Scanner;

public class nomor3 {
    public static void main(String[] args) {
        int a = 0, b = 1, c, x;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Range Bilangan : ");
        int range = input.nextInt();
        
        for (x=1; x<=range; x++){
            c = a + b;
            System.out.println(a);
            System.out.print(c+"\t");
            a = b;
            b = c;
        }
        System.out.println();
    }
}
