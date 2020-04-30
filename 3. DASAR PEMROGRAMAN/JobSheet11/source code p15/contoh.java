/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package p15;

/**
 *
 * @author yoga 260
 */
import java.util.Scanner;
 
public class contoh {
 
 int ambil = 0,simpan = 0, pilihan=0;
 int saldoawal = 50000000;
 Scanner input = new Scanner(System.in);
 
 
public static void main(String[] args) {

 Scanner input = new Scanner(System.in);
 contoh bk = new contoh ();
 bk.menu ();
 
 int pilih=input.nextInt();
 bk.pilihmenu(pilih);
 
 }


void menu(){
    System.out.println("\nMenu ATM");
    System.out.println("1. Cek Saldo \n2. Simpan Uang"
            + "\n3. Keluar ");
    System.out.print("Pilih Menu ATM : ");
}

void pilihmenu (int menu)
{   
      switch (menu) {
         case 1:
             simpanAwal(saldoawal);
             break;
         case 2:
             System.out.print("Masukan Uang disimpan Rp. ");
             simpanUang(simpan);
             break;
          case 3:
             System.out.print("Terimakasih sudah menggunakan layanan ini \n");
             System.exit(0);
             break;
             
         default:
             break;
     }

}
void simpanAwal(int saldo){
  System.out.println("Saldo awal adalah : Rp. " + saldoawal);
  menu();
  pilihan=input.nextInt();
  pilihmenu(pilihan);
}
 
void simpanUang(int simpan){
  simpan = input.nextInt();
  int saldo = simpan+saldoawal;
  System.out.println("Saldo Saat ini adalah Rp:" +saldo);

  menu();
  pilihan=input.nextInt();
  pilihmenu(pilihan);
}
 

}