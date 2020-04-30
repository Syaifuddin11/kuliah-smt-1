package Array;

public class Tugas1 {
    public static void main(String[] args) {
        
        int bil[] = new int[5];
        
        bil[0] = 5;
        bil[1] = 2;
        bil[2] = 7;
        bil[3] = 9;
        bil[4] = 6;
        
        for(int i=0; i<bil.length; i++){
            System.out.print(bil[i]+" ");
        }
        
        System.out.println("");

        for (int i=bil.length-1; i>=0; i--){
            System.out.print(bil[i]+" ");
        }
    }
}
