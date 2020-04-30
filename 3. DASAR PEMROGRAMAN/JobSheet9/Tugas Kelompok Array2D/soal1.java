package TugasArray2D;

import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("==================== DENAH TEMPAT DUDUK KELAS TI 1E =====================");
        System.out.println("");
        
        String nama[][] = new String[3][5];
            
        nama[0][0] = "Ahmad";
        nama[0][1] = "Hanun";
        nama[0][2] = "Arlan";
        nama[0][3] = "Juno";
        nama[0][4] = "Fadhil";
        nama[1][0] = "Siska";
        nama[1][1] = "Ali";
        nama[1][2] = "Shiva";
        nama[1][3] = "Ifud";
        nama[1][4] = "Mukhtar";
        nama[2][0] = "Sasa";
        nama[2][1] = "Zade";
        nama[2][2] = "Risky";
        nama[2][3] = "Sesha";
        nama[2][4] = "Fajar";
        
        int sum=0;
        for (int i=0; i<nama.length; i++){
            for (int j=0; j<nama[0].length; j++){
                System.out.print("|"+nama[i][j] + "|\t\t");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("=========================================================================");
 
    }
}
