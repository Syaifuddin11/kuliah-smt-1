package JobSheetFungsi1;

/*
Nama    : Mochammad Syaifuddin Zuhri
Kelas   : TI 1E
NIM     : 1941720013
*/

public class Tugas1 {
    public static void main(String[] args) {
     
        int bil1 = 1, bil2 = 3, bil3 = 5;
        int maks = max3(bil1, bil2, bil3);
        System.out.printf("Nilai Maksimal dari {%d,%d,%d} : %d\n", bil1, bil2, bil3, maks);
        
    }

    static int max3(int bil1, int bil2, int bil3){
        int max;
        if (bil1 > bil2 && bil1 > bil3){
            max = bil1;
        } else if (bil2 > bil1 && bil2 > bil3){
            max = bil2;
        } else {
            max = bil3;
        }
        return max;
    }
}
