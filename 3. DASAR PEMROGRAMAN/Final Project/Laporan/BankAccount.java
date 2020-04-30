package FinalProject;

/**
 *
 * @author Mochammad Syaifuddin Zuhri
 */

import java.util.Scanner;

public class BankAccount {
    
    private static Scanner angka = new Scanner(System.in);
    private static Scanner huruf = new Scanner(System.in);
    
    static int n, menu, inPin, kodeBank, pPin, lLama;
    static long saldoTambah, saldoAmbil, hitungBunga, saldoAkhirIsi, saldoAkhirAmbil, saldoSisaTransfer, 
                rekTujuan, inSaldoTransfer, totalSaldo, sum, sSaldo;
    static String jJenis, nNama, aAlamat;
    static boolean ulang = true;
    static double [][]sukuBunga = new double[5][2]; 
    
    static String[][] nasabah = {{"250311", "Anam", "Malang", "Tahapan", "7", "50000000", "1.0"},
                                {"031100", "Arlan", "Jember", "Tapres", "8", "20000000", "1.15"},
                                {"280310", "Anisa", "Madura", "Tahapan", "2", "1000000", "0.25"},
                                {"230101", "Shely", "Prigen", "Tapres", "3", "15000000", "0.6"},
                                {"010101", "Rudi", "Batu", "Tapres", "1", "2000000", "0.4"},
                                {"", "", "", "", "", "", ""}};
    
    static String[][] saldoNasabah = {{"250311", "Anam", "Tahapan", "7", "50000000", "1.0", "86915975"},
                                     {"031100", "Arlan", "Tapres", "8", "20000000", "1.15", "20131882"},
                                     {"280310", "Anisa", "Tahapan", "2", "1000000", "0.25", "21173399"},
                                     {"230101", "Shely", "Tapres", "3", "15000000", "0.6", "15037014"},
                                     {"010101", "Rudi", "Tapres", "1", "2000000", "0.4", "2001643"},
                                     {"", "", "", "", "", "", ""}};
    
    static String[][] cetakIsiSaldo = {{"250311", "Anam", "Tahapan", "86915975", "1500000", "88415975"},
                                      {"031100", "Arlan", "Tapres", "20131882", "2500000", "45131882"},
                                      {"280310", "Anisa", "Tahapan", "21173399", "5200000", "26373399"},
                                      {"230101", "Shely", "Tapres", "15037014", "1000000", "16037014"},
                                      {"010101", "Rudi", "Tapres", "20016423", "800000", "2801643"},
                                      {"", "", "", "", "", ""}};
    
    static String[][] cetakAmbilSaldo = {{"250311", "Anam", "Tahapan", "86915975", "30000000", "56915975"},
                                        {"250311", "Arlan", "Tapres", "20131882", "12000000", "8131882"},
                                        {"250311", "Anisa", "Tahapan", "21173399", "25000000", "20173399"},
                                        {"250311", "Shely", "Tapres", "15037014", "10000000", "14037014"},
                                        {"250311", "Rudi", "Tapres", "20016423", "10000000", "1001643"},
                                        {"", "", "", "", "", ""}};
    
    static String []saldoBunga = {"< Rp.1.000.000,-\t\t\t\t", 
        ">= 1.000.000 s/d < Rp.10.000.000,-\t\t", 
        ">= Rp.10.000.000,- s/d < Rp.20.000.000,-\t", 
        ">= Rp.20.000.000,-\t\t\t\t"}; 
    
    // Method Main
    public static void main(String[] args) {
        
        BankAccount bio = new BankAccount();
        bio.biodata();
        
        sukuBunga[0][0] = 0.1; //Tahapan
        sukuBunga[0][1] = 0.2; //Tapres
        sukuBunga[1][0] = 0.25; //Tahapan
        sukuBunga[1][1] = 0.4; //Tapres
        sukuBunga[2][0] = 0.45; //Tahapan
        sukuBunga[2][1] = 0.6; //Tapres
        sukuBunga[3][0] = 1.0; //Tahapan
        sukuBunga[3][1] = 1.15; //Tapres
        
        BankAccount awal = new BankAccount();
        awal.openBank(sukuBunga);
        
    }

    // Method Biodata
    private void biodata() {
        System.out.println("     ======================== BIODATA MAHASISWA ======================");
        String bio = "     |\tNama\t\t: Mochammad Syaifuddin Zuhri\t\t     |\n"
                    + "     |\tKelas\t\t: TI 1E\t\t\t\t\t     |\n"
                    + "     |\tNIM\t\t: 1941720013\t\t\t\t     |\n"
                    + "     |\tProdi\t\t: D-IV Teknik Informatika\t\t     |\n"
                    + "     |\tJurusan\t\t: Teknologi Informasi\t\t\t     |";
        System.out.println(bio);
        System.out.println("     =================================================================\n");
    }

    // Method Persyaratan Daftar Tabungan
    private void openBank(double[][] sukuBunga) {
        System.out.println("******************************************************************************");
        System.out.println("\t\t>>>\tSELAMAT DATANG DI BANK BCA\t<<<");        
        System.out.println("******************************************************************************\n");
        System.out.println("\t\t>>>   PERSYARATAN DAFTAR TABUNGAN BCA   <<<");
        System.out.println("\t+---------------------------------------------------------+");
        System.out.println("\t\t1. Mengisi Identitas Diri\n"
                + "\t\t2. Setoran Saldo Awal Minimal Rp.500000,-\n"
                + "\t\t3. Setoran Selanjutnya Minimal Rp.50000,-\n"
                + "\t\t4. Ambil Saldo Minimal Rp.50000,-\n"
                + "\t\t5. Transfer Saldo Minimal Rp.50000,-");
        System.out.println("\t+---------------------------------------------------------+\n");
        System.out.println("\t\t>>>\tJENIS TABUNGAN & SUKU BUNGA\t<<<");
        System.out.println("==============================================================================");
        System.out.println("\t\t\t\t\t\t\tSuku Bunga (%pa)");
        System.out.println("\t\tJumlah Saldo\t\t\t\t======================");
        System.out.println("\t\t\t\t\t\t\tTahapan\t\tTapres");
        System.out.println("==============================================================================");
        // Menampilkan Suku Bunga
        for (int i = 0; i < 4; i++) {
            System.out.print(saldoBunga[i]+"\t");
            for (int j = 0; j < 2; j++) {
                System.out.print(sukuBunga[i][j]+"\t\t");
            }
            System.out.println("");
        }
        System.out.println("==============================================================================\n");
        
        masterData();
        daftarmenu();
    }
    
    // Master Data
    private void masterData(){
        System.out.println("\t\t\t>>>\tDATA NASABAH\t<<<");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("PIN\tNama\tAlamat\tJenis Tabungan\tLama(Tahun)  Saldo Awal(Rp.) Bunga(%pa)");
        System.out.println("------------------------------------------------------------------------------");
        dataNasabah();
        System.out.println("------------------------------------------------------------------------------");
    }
    
    // Menampilkan Master Data (Data Nasabah)
    private void dataNasabah(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(nasabah[i][0]+"\t"+nasabah[i][1]+"\t"
                        +nasabah[i][2]+"\t  "+nasabah[i][3]+"\t   "
                        +nasabah[i][4]+"\t      "+nasabah[i][5]+"\t\t"
                        +nasabah[i][6]);
                break;
            }
            System.out.println("");
        }
    }

    // Method Input Jumlah Nasabah
    private void inNasabah() {
        while(ulang == true){
            System.out.print("\n\t\t  Masukkan Jumlah Input Nasabah : ");
            n = angka.nextInt();
            System.out.println("");
            if (n == 1){
                ulang = false;
                break;
            } else if(n != 1){
                System.out.println("------------------------------------------------------------------------------");
                System.out.println("\t\t>>>\tMaaf, Jumlah Input Maksimal 1...<<<");
                System.out.println("\t\t        Silahkan Masukkan Jumlah Lagi");
                System.out.println("------------------------------------------------------------------------------");
                ulang = true;
            }
        }
    }

    // Method Input Data Nasabah
    private void daftar() {
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");  
            System.out.println("\t\t\t    INPUT DATA NASABAH");  
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"); 
            inNasabah();
            for (int i = 0; i < n; i++) {
               int a = i+5;
               System.out.println("------------------------------------------------------------------------------");
               System.out.print("Masukkan PIN (6 digit)\t\t\t\t\t: ");
               pPin = angka.nextInt();
               nasabah[a][0] = Integer.toString(pPin);
               saldoNasabah[a][0] = Integer.toString(pPin);
               System.out.print("Masukkan Nama\t\t\t\t\t\t: ");
               nNama= huruf.nextLine();
               nasabah[a][1] = nNama;
               saldoNasabah[a][1] = nNama;
               cetakIsiSaldo[a][1] = nNama;
               cetakAmbilSaldo[a][1] = nNama;
               System.out.print("Masukkan Alamat\t\t\t\t\t\t: ");
               aAlamat = huruf.nextLine();
               nasabah[a][2] = aAlamat;
               // Mengecek Inputan Jenis Tabungan
                    do{
                        System.out.print("Masukkan Jenis Tabungan BCA (Tahapan/Tapres)\t\t: ");
                        jJenis = huruf.nextLine();
                        nasabah[a][3] = jJenis;
                        saldoNasabah[a][2] = jJenis;
                        cetakIsiSaldo[a][2] = jJenis;
                        cetakAmbilSaldo[a][2] = jJenis;
                        if(jJenis.equalsIgnoreCase("Tahapan")){
                            ulang = false;
                        } else if (jJenis.equalsIgnoreCase("Tapres")){
                            ulang = false;
                        } else {
                             System.out.println(">>> Maaf! Jenis Tabungan Tidak Tersedia. Masukkan Jenis Tabungan Kembali! <<<"); 
                             ulang = true;
                        }
                    } while (ulang == true);
               System.out.print("Masukkan Lama Menabung (dalam Tahun)\t\t\t: ");
               lLama= angka.nextInt();
               nasabah[a][4] = Integer.toString(lLama);
               saldoNasabah[a][3] = Integer.toString(lLama); 
                // Mengecek Inputan Saldo Awal
                    do{
                    System.out.print("Masukkan Saldo Awal\t\t\t\t\t: ");
                    sSaldo = angka.nextLong();
                    nasabah[a][5] = Long.toString(sSaldo);
                    saldoNasabah[a][4] = Long.toString(sSaldo);
                    if(sSaldo< 500000){
                            System.out.println("\t>>> Maaf! Saldo Awal Kurang. Masukkan Saldo Kembali! <<<");   
                        }
                    } while (sSaldo < 500000);
               System.out.println("------------------------------------------------------------------------------");
               System.out.print("\t\t>>>\tTabungan berhasil dibuat....\t<<<\n");
        }
            System.out.println("------------------------------------------------------------------------------");
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");   
    }
    
    // Method Daftar Menu
    private void daftarmenu() {
        String daftarMenu = ">>>\t\t1. Input Data Nasabah\t\t5. Ambil Saldo\t\t   <<<\n"
                + ">>>\t\t2. Lihat Data Nasabah\t\t6. Transfer\t\t   <<<\n"
                + ">>>\t\t3. Cek Saldo\t\t\t7. Keluar\t\t   <<<\n"
                + ">>>\t\t4. Isi Saldo\t\t\t\t\t\t   <<<";
        System.out.println("\n==============================================================================");
        System.out.println(">>>\t\t\t\tDAFTAR MENU\t\t\t\t   <<<");
        System.out.println("==============================================================================");
        System.out.println(daftarMenu);
        System.out.println("==============================================================================\n");
        pilihmenu();
    }
    
    // Method Pilih Menu
    private void pilihmenu() {
        System.out.print("\t\t\tMasukkan Pilihan Menu : ");
        menu = angka.nextInt();
        System.out.println("");
        switch(menu){
            case 1:
                daftar();
                daftarmenu();
                break;
            case 2:
                tampilData();
                daftarmenu();
                break;
            case 3:
                cekSaldo();
                daftarmenu();
                break;
            case 4:
                isiSaldo();
                daftarmenu();
                break;
            case 5:
                ambilSaldo();
                daftarmenu();
                break;
            case 6:
                transfer();
                daftarmenu();
                break;
            case 7:
                System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");  
                System.out.println("\t\t>>>\t\tTERIMA KASIH...\t\t<<<");
                System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n");
                System.exit(0);
                break;
            default:
                System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");  
                System.out.println("\t\t>>>\tMaaf, Menu tidak tersedia...\t<<<");
                System.out.println("\t\t    Silahkan Masukkan Pilihan Menu Lagi");
                System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n");
                daftarmenu();
                break;
        }
    }
    
    // Method Menu 1 (Tampil Data Nasabah)
    private void tampilData(){
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");  
        System.out.println("\t\t\t    DAFTAR DATA NASABAH");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("PIN\tNama\tAlamat\tJenis Tabungan\tLama(Tahun)  Saldo Awal(Rp.) Bunga(%pa)");
        System.out.println("------------------------------------------------------------------------------");
        dataNasabah();
        for (int a = 0; a < n; a++) {
            int b = a+5;
            for (int j = 0; j < 7; j++) {
                System.out.print(nasabah[b][0]+"\t"+nasabah[b][1]+"\t"
                        +nasabah[b][2]+"\t  "+nasabah[b][3]+"\t   "
                        +nasabah[b][4]+"\t      "+nasabah[b][5]+"\t\t");
                if(jJenis.equalsIgnoreCase("Tahapan")){
                    if(sSaldo < 1000000){
                        System.out.print(sukuBunga[0][0]);   
                    } else if (sSaldo>= 1000000 && sSaldo < 10000000){
                        System.out.print(sukuBunga[1][0]);
                    } else if (sSaldo >= 10000000 && sSaldo < 20000000){
                        System.out.print(sukuBunga[2][0]);  
                    } else if (sSaldo >= 20000000){
                        System.out.print(sukuBunga[3][0]);
                    } 
                // Jenis Tabungan Tapres  
                } else if (jJenis.equalsIgnoreCase("Tapres")){
                    if(sSaldo < 1000000){
                        System.out.print(sukuBunga[0][1]);
                    } else if (sSaldo >= 1000000 && sSaldo < 10000000){
                        System.out.print(sukuBunga[1][1]);
                    } else if (sSaldo >= 10000000 && sSaldo < 20000000){
                        System.out.print(sukuBunga[2][1]); 
                    } else if (sSaldo >= 20000000){
                        System.out.print(sukuBunga[3][1]);  
                    }
                } 
                break;
            }
            System.out.println("");
        }
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");  
    }

    //Method Master Data (Saldo Awal Nasabah)
    private void saldoAwalNasabah(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(saldoNasabah[i][0]+"\t"+saldoNasabah[i][1]+"\t"
                        +saldoNasabah[i][2]+"\t\t       "+saldoNasabah[i][3]+"\t "
                        +saldoNasabah[i][4]+"\t "+saldoNasabah[i][5]+"\t    "
                        +saldoNasabah[i][6]);
                break;
            }
            System.out.println("");
        }
    }
    
    // Method Menu 2 (Cek Saldo Nasabah)
    private void cekSaldo() {
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");  
        System.out.println("\t\t\t\t  CEK SALDO NASABAH");  
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("PIN\tNama\tJenis Tabungan\tLama(Tahun)  Saldo Awal(Rp.) Bunga(%pa)  Saldo Sekarang(Rp.)");
        System.out.println("--------------------------------------------------------------------------------------------");
        saldoAwalNasabah();;
        for (int i = 0; i < n; i++) {
            int a = i+5;
            for (int j = 0; j < 7; j++) {
                System.out.print(saldoNasabah[a][0]+"\t"+saldoNasabah[a][1]+"\t"
                        +saldoNasabah[a][2]+"\t\t       "+saldoNasabah[a][3]+"\t "
                        +saldoNasabah[a][4]+"\t ");
                if(jJenis.equalsIgnoreCase("Tahapan")){
                    if(sSaldo < 1000000){
                        System.out.print(sukuBunga[0][0]+"\t    ");  
                        for (int k= 0; k < lLama; k++) {
                            hitungBunga = (((sSaldo* 1)/100) * 30)/365;
                            totalSaldo = sSaldo+ hitungBunga;
                            sSaldo= totalSaldo;
                        }
                        sum += totalSaldo;
                    } else if (sSaldo>= 1000000 && sSaldo < 10000000){
                        System.out.print(sukuBunga[1][0]+"\t    ");
                        for (int k= 0; k < lLama; k++) {
                            hitungBunga = (((sSaldo * 25)/100) * 30)/365;
                            totalSaldo = sSaldo+ hitungBunga;
                            sSaldo= totalSaldo;
                        }
                        sum += totalSaldo;
                    } else if (sSaldo >= 10000000 && sSaldo< 20000000){
                        System.out.print(sukuBunga[2][0]+"\t    ");
                        for (int k= 0; k < lLama; k++) {
                            hitungBunga = (((sSaldo * 45)/100) * 30)/365;
                            totalSaldo = sSaldo+ hitungBunga;
                            sSaldo= totalSaldo;
                        }
                        sum += totalSaldo;
                    } else if (sSaldo>= 20000000){
                        System.out.print(sukuBunga[3][0]+"\t    ");
                        for (int k= 0; k < lLama ; k++) {
                            hitungBunga = (sSaldo * 1 * 30)/365;
                            totalSaldo = sSaldo+ hitungBunga;
                            sSaldo= totalSaldo;
                        }
                        sum += totalSaldo;
                    } 
                // Jenis Tabungan Tapres  
                } else if (jJenis.equalsIgnoreCase("Tapres")){
                    if(sSaldo< 1000000){
                        System.out.print(sukuBunga[0][1]+"\t    ");
                        for (int k= 0; k < lLama; k++) {
                            hitungBunga = (((sSaldo * 2)/100) * 30)/365;
                            totalSaldo = sSaldo+ hitungBunga;
                            sSaldo= totalSaldo;
                        }
                        sum += totalSaldo;
                    } else if (sSaldo >= 1000000 && sSaldo < 10000000){
                        System.out.print(sukuBunga[1][1]+"\t    ");
                        for (int k= 0; k < lLama ; k++) {
                            hitungBunga = (((sSaldo* 4)/100) * 30)/365;
                            totalSaldo = sSaldo+ hitungBunga;
                            sSaldo= totalSaldo;
                        }
                        sum += totalSaldo;
                    } else if (sSaldo>= 10000000 && sSaldo < 20000000){
                        System.out.print(sukuBunga[2][1]+"\t    ");
                        for (int k= 0; k < lLama ; k++) {
                            hitungBunga = (((sSaldo * 6)/100) * 30)/365;
                            totalSaldo = sSaldo+ hitungBunga;
                            sSaldo= totalSaldo;
                        }
                        sum += totalSaldo;
                    } else if (sSaldo>= 20000000){
                        System.out.print(sukuBunga[3][1]+"\t    ");
                        for (int k= 0; k < lLama ; k++) {
                            hitungBunga = (((sSaldo * 115)/100) * 30)/365;
                            totalSaldo = sSaldo+ hitungBunga;
                            sSaldo= totalSaldo;
                        }
                        sum += totalSaldo;
                    }
                }
                cetakIsiSaldo[a][3] = Long.toString(sum);
                cetakAmbilSaldo[a][3] = Long.toString(sum);
                System.out.print(sum);
                break;
            }
            System.out.println("");
        }
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    // Method Input PIN
    private void inputPin(){
        do{
            for (int i = 0; i < n; i++) {
                int a = i+5;
                System.out.print("Masukkan PIN Anda\t\t: ");
                inPin = angka.nextInt();
                if(inPin == pPin){
                    cetakIsiSaldo[a][0] = Integer.toString(inPin);
                    cetakAmbilSaldo[a][0] = Integer.toString(inPin);
                    ulang = false;
                } else {
                    System.out.println(">>>\tMaaf! PIN Salah, Masukkan PIN Kembali\t<<<");
                    ulang = true;
                }
            }
        } while (ulang == true);
    }
    
    // Method Master Data
    private void cIsiSaldo(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(cetakIsiSaldo[i][0]+"\t"+cetakIsiSaldo[i][1]+"\t"
                        +cetakIsiSaldo[i][2]+"\t\t"+cetakIsiSaldo[i][3]+"\t"
                        +cetakIsiSaldo[i][4]+"\t\t"+cetakIsiSaldo[i][5]);
                break;
            }
            System.out.println("");
        }
    }
    
    // Method Menu 3 (Isi Saldo)
    private void isiSaldo() {
        System.out.println("\t\t\t>>>\tMASTER DATA\t<<<");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("PIN\tNama\tJenis Tabungan\tSaldo Awal(Rp.)\tJumlah Isi\tSaldo Sekarang(Rp.)");
        System.out.println("------------------------------------------------------------------------------------");
        cIsiSaldo();
        System.out.println("------------------------------------------------------------------------------------\n");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");  
        System.out.println("\t\t\t\tISI SALDO NASABAH");  
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        inputPin();
        do{
            for (int i = 0; i < n; i++) {
                int a = i+5;
                System.out.print("Masukkan jumlah isi saldo\t: ");
                saldoTambah = angka.nextLong();
                cetakIsiSaldo[a][4] = Long.toString(saldoTambah);
                if(saldoTambah < 50000){
                    System.out.println("\t>>> Maaf! Isi Saldo Minimal Rp.50000,-. Masukkan Saldo Kembali! <<<");
                }
            }
        } while (saldoTambah < 50000);
        System.out.println("------------------------------------------------------------------------------------");
        System.out.print("\t\t\t>>>\tIsi Saldo Berhasil....\t<<<\n");
        System.out.println("------------------------------------------------------------------------------------\n");
        tampilIsiSaldo();
    }

    // Method Menampilkan Hasil Transaksi Isi Saldo
    private void tampilIsiSaldo() {
        System.out.println("\t\t\t>>>\t DATA ISI SALDO\t\t<<<");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("PIN\tNama\tJenis Tabungan\tSaldo Awal(Rp.)\tJumlah Isi\tSaldo Sekarang(Rp.)");
        System.out.println("------------------------------------------------------------------------------------");
        cIsiSaldo();
        for (int i = 0; i < n; i++) {
            int a = i+5;
            for (int j = 0; j < 7; j++) {
                System.out.print(cetakIsiSaldo[a][0]+"\t"+cetakIsiSaldo[a][1]+"\t"
                        +cetakIsiSaldo[a][2]+"\t\t"+sum+"\t\t"
                        +cetakIsiSaldo[a][4]+"\t\t");
                saldoAkhirIsi = sum + saldoTambah; 
                sum = saldoAkhirIsi;
                System.out.print(saldoAkhirIsi);
               break;
            }
            System.out.println("");
        }
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }
    
    // Method Master Data
    private void cAmbilSaldo(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(cetakAmbilSaldo[i][0]+"\t"+cetakAmbilSaldo[i][1]+"\t"
                        +cetakAmbilSaldo[i][2]+"\t\t"+cetakAmbilSaldo[i][3]+"\t"
                        +cetakAmbilSaldo[i][4]+"\t"+cetakAmbilSaldo[i][5]);
                break;
            }
            System.out.println("");
        }
    }
    
    // Method Menu 4 (Ambil Saldo)
    private void ambilSaldo() {
        System.out.println("\t\t\t>>>\tMASTER DATA\t<<<");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("PIN\tNama\tJenis Tabungan\tSaldo Awal(Rp.)\tJumlah Ambil\tSaldo Sekarang(Rp.)");
        System.out.println("------------------------------------------------------------------------------------");
        cAmbilSaldo();
        System.out.println("------------------------------------------------------------------------------------\n");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");  
        System.out.println("\t\t\t    AMBIL SALDO NASABAH");  
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");  
        inputPin();
        do{
            for (int i = 0; i < n; i++) {
                int a = i+5;
                System.out.print("Masukkan jumlah ambil saldo\t: ");
                saldoAmbil= angka.nextLong();
                cetakAmbilSaldo[a][4] = Long.toString(saldoAmbil);
                    if(saldoAmbil< 50000){
                        System.out.println("\t>>> Maaf! Ambil Saldo Minimal Rp.50000,-. Masukkan Saldo Kembali! <<<");
                        ulang = true;
                    } else if(saldoAmbil > sum){
                        System.out.println("\t>>> Maaf! Saldo Anda Kurang,-. Masukkan Saldo Kembali! <<<");
                        ulang = true;
                    } else if (saldoAmbil > 50000 && saldoAmbil < sum){
                        ulang = false;
                    }
            }
        } while (ulang == true);
        System.out.println("------------------------------------------------------------------------------------");
        System.out.print("\t\t\t>>>\tAmbil Saldo Berhasil\t<<<\n");
        System.out.println("------------------------------------------------------------------------------------\n");
        tampilAmbilSaldo();
    }

    // Method Menampilkan Hasil Transaksi Ambil Saldo
    private void tampilAmbilSaldo() {
        System.out.println("\t\t\t>>>\tDATA AMBIL SALDO\t<<<");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("PIN\tNama\tJenis Tabungan\tSaldo Awal(Rp.)\tJumlah Ambil\tSaldo Sekarang(Rp.)");
        System.out.println("------------------------------------------------------------------------------------");
        cAmbilSaldo();
        for (int i = 0; i < n; i++) {
            int a = i+5;
            for (int j = 0; j < 7; j++) {
                System.out.print(cetakAmbilSaldo[a][0]+"\t"+cetakAmbilSaldo[a][1]+"\t"
                        +cetakAmbilSaldo[a][2]+"\t\t"+sum+"\t\t"
                        +cetakAmbilSaldo[a][4]+"\t\t");
                saldoAkhirAmbil = sum - saldoAmbil;
                sum = saldoAkhirAmbil;
                System.out.print(saldoAkhirAmbil);
               break;
            }
            System.out.println("");
        }System.out.println("------------------------------------------------------------------------------------");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }
    
    // Method Menu 5 (Transfer)
    private void transfer() {
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");  
        System.out.println("\t\t\t    TRANSFER SALDO");  
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        inputPin();
        do{
            System.out.print("Masukkan No. Rekening Tujuan\t: ");
            rekTujuan = angka.nextLong();
            System.out.print("Masukkan Jumlah Saldo Transfer\t: ");
            inSaldoTransfer = angka.nextLong();
                if(inSaldoTransfer < 50000){
                    System.out.println("\t>>> Maaf! Transfer Minimal Rp.50000,-. Masukkan Saldo Kembali! <<<"); 
                    ulang = true;
                } else if (inSaldoTransfer > sum){
                    System.out.println("\t>>> Maaf! Saldo Anda Kurang,-. Masukkan Saldo Kembali! <<<");
                    ulang = true;
                } else if (inSaldoTransfer > 50000 && inSaldoTransfer < sum){
                    ulang = false;
                }
       } while (ulang == true);
       tampilTransfer();
    }

    // Method Menampilkan Hasil Transaksi Transfer (DATA PENERIMA)
    private void tampilTransfer() {
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("\t\t>>>\tTransfer Saldo Berhasil\t<<<");
        System.out.println("---------------------------------------------------------------------------\n");
        System.out.println("\t+---------------------------------------------------------+");
        System.out.println("\t\t>>>\t\tDATA PENERIMA\t\t<<<");
        System.out.println("\t\tNama Nasabah\t\t: Subarjo Abdillah");
        System.out.println("\t\tNomor Rekening\t\t: "+rekTujuan);
        System.out.println("\t\tJumlah Saldo Terima\t: Rp."+inSaldoTransfer+",-");
        System.out.println("\t+---------------------------------------------------------+");
        tampilDataPengirim();  
    }

    // Method Menampilkan Hasil Transaksi Transfer (DATA PENGIRIM)
    private void tampilDataPengirim() {
        System.out.println("\t\t>>>\t\tDATA PENGIRIM\t\t<<<");
       for (int i = 0; i < n; i++) {
               saldoSisaTransfer = sum - inSaldoTransfer;
               System.out.printf("\t\tNama Nasabah\t\t: %s\n", nNama);
               System.out.println("\t\tJenis Tabungan\t\t: "+ jJenis);
               System.out.println("\t\tJumlah Saldo Anda\t: "+sum);
               System.out.println("\t\tJumlah Saldo Transfer\t: Rp."+inSaldoTransfer+",-");
               System.out.println("\t+---------------------------------------------------------+");
               System.out.println("\t\tSisa Saldo Anda\t\t: Rp."+saldoSisaTransfer+",-");
               System.out.println("\t+---------------------------------------------------------+");
               sum = saldoSisaTransfer;
       }
    }
}

