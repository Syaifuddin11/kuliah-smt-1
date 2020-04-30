package JobSheet5;

import java.util.Scanner;

public class tugas2 {
public static void main(String[]args){
    //Scanner
    Scanner sc = new Scanner(System.in);
    
    //deklarasi
    String username, password;
    
    //Pemasukan Nilai
    System.out.print("Masukkan Username : ");
    username = sc.nextLine();

    
    //pengecekan
    
    if (username.equalsIgnoreCase("Mahasiswa")){
        System.out.print("Masukkan Password : ");
        password = sc.nextLine();
        if (password.equals("RaHaSia")){
            System.out.println("Anda berhasil login");
        } else {
            System.out.println("Maaf, password anda salah");
        }
    } else {
        System.out.println("Username tidak ditemukan");
    }
  }    
}
