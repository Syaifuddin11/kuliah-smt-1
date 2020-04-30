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

//contoh source code mencetak angka 1 sampai 10 
//dengan menggunakan rekursif
public class cetakAngka {
    public static void main(String[] args) {
 
        cetakAngka(1);
 
    }
 
    static void cetakAngka(int angka) {
 
        if (angka <= 10) {
 
            System.out.println(angka + " ");
 
            cetakAngka(++angka);
 
        }
 
    }
}
