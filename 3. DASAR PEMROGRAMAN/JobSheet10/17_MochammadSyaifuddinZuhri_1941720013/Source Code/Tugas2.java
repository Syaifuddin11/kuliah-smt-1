package JobSheetFungsi1;

/*
Nama    : Mochammad Syaifuddin Zuhri
Kelas   : TI 1E
NIM     : 1941720013
*/

public class Tugas2 {
    
    static double phi = 3.14;
            
    public static void main(String[] args) {
        double r = 7;
        double hasilKeliling = keliling(r);
        System.out.printf("Keliling Lingkaran : %.3f\n", hasilKeliling);
        luas(r);
    }

    private static double keliling(double jari) {
        double hasil;
        hasil = (2 * phi * jari);;
        return hasil;
    }

    private static double luas(double jari) {
        phi = 3.14;
        double luasLingkaran = (phi * jari * jari);
        System.out.printf("Luas Lingkaran : %.3f\n", luasLingkaran);
        return luasLingkaran;
    }
}
