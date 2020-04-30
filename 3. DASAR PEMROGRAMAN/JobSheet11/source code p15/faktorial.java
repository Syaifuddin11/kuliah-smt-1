/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package p15;

import java.util.Scanner;

/**
 *
 * @author yoga 260
 */
public class faktorial {
    
  public static void main(String[] args){
    int bil, hasil;
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukkan bilangan: ");
    bil = scan.nextInt();
    hasil = faktorial(bil);
    System.out.println("Faktorial dari "+bil+" adalah "+hasil);
  }
  
  static int faktorial(int num) {
    if(num == 0){
      return 1;
    }
    return num * faktorial(num-1);
  }
}
