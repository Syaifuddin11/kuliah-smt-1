/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package p15;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
/**
 *
 * @author yoga 260
 */
public class shortArray {

static String[] companies = { "Google", "Apple", "Sony" };
static int[] numbers = { 1, 3, 2, 5, 4 };

    public static void main(String[] args) {
        belumUrut(companies);
        System.out.println("");
        shortAsc(companies);
        System.out.println("");
        shortDesc(companies);
        System.out.println("");
        shortPart(numbers);
    }
  
    static void belumUrut (String [] acak){
     System.out.println("Array yang belum terurut");
     printNumbers(acak);
    } 
    static void shortAsc (String [] asc){
     Arrays.sort(asc);
     System.out.println("Array terurut berdasar Nilai Ascending : ");
     printNumbers(asc);
    } 
    
    static void shortDesc (String [] desc){
     Arrays.sort(desc, Collections.reverseOrder());
     System.out.println("Array terurut berdasar Nilai Descending : ");
     printNumbers(desc);
    } 
    
    static void shortPart (int [] part){
    //hanya mengurutkan indext 0 sampai 3
    Arrays.sort(part, 0, 3);
    System.out.println("Short sub array: ");
    for (int num : part) {
    System.out.println(num);
    }

    } 
    
    static void printNumbers(String[] companies) {
        for (String company : companies) {
        System.out.println(company);
     }
    }
    
}
