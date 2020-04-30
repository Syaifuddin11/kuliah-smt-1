package JobSheetFungsi1;

/*
Nama    : Mochammad Syaifuddin Zuhri
Kelas   : TI 1E
NIM     : 1941720013
*/

public class Praktikum2 {
    public static void main(String[] args) {
        beriSalam();
        String salam = "Selamat datang di pemrograman Java";
        beriucapan(salam);
    }

    private static void beriSalam() {
        System.out.println("Halo! Selamat Pagi");
    }

    private static void beriucapan(String ucapan) {
        System.out.println(ucapan);
    }
}
