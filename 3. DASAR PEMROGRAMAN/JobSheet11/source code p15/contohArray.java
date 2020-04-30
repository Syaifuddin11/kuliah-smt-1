/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
#package p15;

import java.util.Scanner;

/**
 *
 * @author yoga 260
 */
public class contohArray {
    
static Scanner s = new Scanner(System.in);  
static int arraySaya[];

    public static void main(String[] args) 
    {
        arrayDinamis1D(arraySaya);
    }
    
    static void arrayDinamis1D(int [] a){
        int pos, x;
        int n=5;
        int arr[] = new int[n+1];
       
        //deklarasi isi array untuk data master
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        System.out.print("Size array Anda:"+ arr.length);
        printArrays(arr);   
        pos = arr.length;
        System.out.println("Masukkan Isi Array yang ingin Anda sisispkan:");
        x = s.nextInt();
        
        //insert array
        for(int i = (n-1); i >= (pos-1); i--)
        {
            arr[i+1] = arr[i];
        }
        arr[pos-1] = x;
        
        System.out.print("Isi Array Setelah di insert:\n");
        for(int i = 0; i < n; i++)
        {
            System.out.println(arr[i]);
        }
        System.out.print(arr[n]);
        System.out.println("");
    }
    
    static void printArrays(int[] isiArray) {
        System.out.println("\nIsi Array Anda");
        for(int i = 0; i < isiArray.length-1; i++)
        {
            System.out.println(isiArray[i]);
        }
  }
}


