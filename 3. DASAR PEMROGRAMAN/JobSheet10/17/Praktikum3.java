package JobSheetFungsi1;

/*
Nama	: Mochammad Syaifuddin Zuhri
Kelas	: TI 1E
NIM		: 1941720013
*/

public class Praktikum3 {
    public static void main(String[] args) {
     
        int luasan = luasPersegi(5);
        System.out.printf("Luas persegi dengan sisi 5 adalah %d\n", luasan);
    }

    private static int luasPersegi(int sisi) {
        int luas = sisi * sisi;
        return luas;
    }
}
