package JobSheetFungsi1;

/*
Nama    : Mochammad Syaifuddin Zuhri
Kelas   : TI 1E
NIM     : 1941720013
*/

public class Praktikum5 {
    public static void main(String[] args) {
     
        Tampil("Daspro 2019", 100, 200);
        Tampil("Teknologi Informasi", 1, 2, 3, 4, 5);
        Tampil("Polinema");
    }

    private static void Tampil(String str, int ... a) {
        System.out.printf("String : %s\n", str);
        System.out.printf("Jumlah paramater : %d\n", a.length);
        
        System.out.print("Isi paramater : ");
        for (int i : a) {
            System.out.printf("%d ",i);
        } System.out.println("\n");
    }
}
