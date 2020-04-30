import javax.swing.JOptionPane;

public class bigProject {
    public static void main(String[] args) {
        bigProject mp = new bigProject();
        mp.tampil_login(); //METHOD UNTUK MENJALANKAN  
    }
   
    //Data Member
    String [] nama_member = {"Sandes","Susmi","Ikhsan"}; //deklarasi array
    int [] id_member = {120395,50495,180495}; //deklarasi array
   
    //Data Pengirim (tipe data)
    String nama_pengirim;
    String alamat_pengirim;
    Long nope_pengirim; // tipe data long di gunakan untuk kasus kasus tertentu yg nilai berada di luar rentang tipe int
    String kota_pengirim="Pekanbaru";
   
    //Data Penerima
    String nama_penerima;
    String alamat_penerima;
    Long nope_penerima;
    String kota_tujuan;
    String pilih_provinsi;
    // disini kami mendeklarasikan array mengelompokkan data atau obyek yang memiliki tipe yang sama
    String provinsi [] = {"Aceh","Sumatera Utara","Sumatera Barat","Riau"
            ,"Kepulauan Riau","Kepulauan Bangka Belitung","Jambi","Bengkulu"
            ,"Sumatera Selatan","Lampung","DKI Jakarta","Banten","Jawa Tengah"
            ,"Jawa Timur","Jawa Barat","Yoyakarta","Bali","Kalimantan Barat"
            ,"Kalimantan Timur","Kalimatan Selatan","Kalimantan Utara"
            ,"Sulawesi Utara","Sulawesi Tengah","Sulawesi Selatan"
            ,"Sulawesi Tenggara","Sulawesi Barat","Gorontalo"
            ,"Nusa Tenggara Barat","Nusa Tenggara Timur"
            ,"Maluku Utara","Maluku","Papua"};
   
    //Data Barang Paket
        // disini kami mendeklarasikan array mengelompokkan data atau obyek yang memiliki tipe yang sama
    String jenis_barang[]={"Elektronik","Pakaian","Dokumen","Lainnya"};
    String nama_barang;
    int berat_barang;
   
    //Data Harga Barang Paket
    //disini kami mendeklarasikan array mengelompokkan data atau obyek yang memiliki tipe yang sama
    int [] harga_perkg = {15000,15000,10000,5000,10000,10000
                        ,15000,17000,19000,20000,20000,22000
                        ,25000,25000,25000,28000,30000,35000
                        ,35000,35000,35000,40000,40000,40000
                        ,50000,50000,60000};
   
    int biaya;
    double diskon; //diskon = 10%
   
    //Data Pembayaran
    double bayar;
    double total;
    double kembalian;
   
    //****************n**********************************************************
   
    public void tampil_login(){
       JOptionPane.showMessageDialog(null,"SELAMAT DATANG DI SISTEM PEMBAYARAN JASA PENGIRIMAN BARANG");
   
    int pilih = Integer.parseInt(JOptionPane.showInputDialog(null,"Masukkan Pilihan Menu :\n1.Member\n2.Non Member "));
     switch (pilih){
         case 1 : set_data_member(); //maka akan memproses method2x dari set_data_member
             break;
         case 2 : set_data_nonmember();
             break;
         default : System.out.println("Pilihan Tidak Tersedia");
             break;
         }
         System.exit(0);
    }
   
    public String login(){
    String pilih_member = JOptionPane.showInputDialog(null,"Masukkan Nama Member : ");
     for (int i=0;i<nama_member.length;i++){ //i++??
         if(nama_member[i].equals(pilih_member)){
             System.out.println("Nama Pengirim : "+pilih_member);
             return nama_member[i]; //apabila tidak dia akan menglang ke atas lagi
         }else{
         }
         }
        System.out.println("Nama Member Tidak Terdaftar");
        System.exit(0);
        return pilih_member;
    }
   
    public int password(){
    int password = Integer.parseInt(JOptionPane.showInputDialog(null,"Masukkan Pin ID Member : "));
     for (int i=0;i<id_member.length;i++){
         if(password==id_member[i]){
             return id_member[i];
         }
         else{
         }  
         }
        System.out.println("Pin ID Member SALAH! SILAKAN COBA KEMBALI!");
        System.exit(0);
        return password;
    }
   
    void cek_nama_pengirim(){ //cek nama bukan member
    //initialize index
    boolean cocok=true; //inisialisasi ketemu itu sama dengan true.
        nama_pengirim = JOptionPane.showInputDialog(null,"Masukkan Nama Pengirim :");

 

     for(int i =0;i<nama_member.length;i++){ //lakukan perulangan pada array
     if(nama_member[i].equalsIgnoreCase(nama_pengirim)){
         cocok=false;
         break; // Jika Nama yang dimasukkan sama dengan nama member maka dia akan salah dan berhenti dalam perulangan.
         }  
         }
     if(cocok){
         System.out.println("Nama Pengirim : "+nama_pengirim);
     }
     else{
         System.out.println("Maaf, Nama Pengirim Telah Menjadi Member! Silakan Login");
     System.exit(0);
     }
    }
   
    void cek_alamat_pengirim(){
        alamat_pengirim = JOptionPane.showInputDialog(null,"Masukkan Alamat Pengirim");
        System.out.println("Alamat Pengirim : "+alamat_pengirim);
    }
   
    void cek_nope_pengirim(){
        nope_pengirim = Long.parseLong(JOptionPane.showInputDialog(null,"Masukkan Nomor Hp Pengirim <TANPA Kode 08> :"));
        System.out.println("Nomor Hp Pengirim : +628"+nope_pengirim);
    }
   
    void set_kota_pengirim(){
        System.out.println("Kota Pengirim : "+kota_pengirim);
    }
   
//##############################################################################  
   
   void cek_nama_penerima(){
       nama_penerima = JOptionPane.showInputDialog(null,"Masukkan Nama Penerima : ");
       System.out.println("Nama Penerima : "+nama_penerima);
   }
 
   void cek_alamat_penerima(){
       alamat_penerima = JOptionPane.showInputDialog(null,"Masukkan Alamat Penerima :");
       System.out.println("Alamat Tujuan : "+alamat_penerima);
   }
 
   void cek_nope_penerima(){
        nope_penerima = Long.parseLong(JOptionPane.showInputDialog(null,"Masukkan Nomor Hp Penerima <TANPA Kode 08> :"));
        System.out.println("Nomor Hp Penerima : +628"+nope_penerima);
    }
 
   void cek_kota_penerima(){
       kota_tujuan = JOptionPane.showInputDialog(null,"Masukkan Nama Kota/Kabupaten Penerima [cth.Pekanbaru] : ");
       System.out.println("Tujuan Kota/Kabupaten : "+kota_tujuan);
   }
 
   //##############################################################################
 
   public double cek_biaya_perkg(){
      pilih_provinsi = JOptionPane.showInputDialog(null,"Masukkan Nama Provinsi Penerima [cth.Riau] : ");
       for (int i = 0;i<provinsi.length;i++){
           if(provinsi[i].equalsIgnoreCase(pilih_provinsi)){
               String prov = pilih_provinsi;
               System.out.println("Nama Provinsi : "+pilih_provinsi);
               biaya = harga_perkg[i];
               System.out.println("Biaya PerKg : Rp."+harga_perkg[i]);
               return harga_perkg[i];
           }else{
           }
           }
       System.out.println("Nama Provinsi Tidak Valid");
       System.exit(0);
       return biaya;
   }
 
   public String cek_jenis_barang(){
       String pilih_jenis = JOptionPane.showInputDialog(null,"FORMAT JENIS BARANG {Elektronik/Pakaian/Dokumen/Lainnya} \nMasukkan Jenis Barang  : ");
     for (int i=0;i<jenis_barang.length;i++){
         if(jenis_barang[i].equalsIgnoreCase(pilih_jenis)){
             System.out.println("Jenis Barang : "+pilih_jenis);
             return jenis_barang[i];
         }else{
         }
         }
        System.out.println("Inputan Salah! Masukkan Sesuai Format!");
        return pilih_jenis;
   }
 
   void cek_nama_barang(){
       nama_barang = JOptionPane.showInputDialog(null,"Masukkan Nama Barang : ");
       System.out.println("Nama Barang : "+nama_barang);
   }
 
   public int cek_berat_barang(){
       berat_barang = Integer.parseInt(JOptionPane.showInputDialog(null,"Masukkan Berat Barang [Kg] : "));
       System.out.println("Berat Barang : "+berat_barang+" Kg");
       return berat_barang;
   }
 
  //##############################################################################
 
   public double cek_bayar(){
       bayar = Integer.parseInt(JOptionPane.showInputDialog(null,"Masukkan Uang Pembayaran Dari Pengirim :"));
       System.out.println("Bayar : Rp."+bayar);
       return bayar;
   }
   public double cek_kembalian_member(){
       kembalian = bayar-diskon;
       System.out.println("Kembalian nya : Rp."+kembalian);
       return kembalian;
   }
   public double cek_kembalian(){
       kembalian = bayar-total;
       System.out.println("Kembalian nya : Rp."+kembalian);
       return kembalian;
   }
   public double cek_total_member(){//total sebelum diskon
       total = berat_barang*biaya;
       System.out.println("Harga Pengiriman Barang : Rp."+total);
       diskon = (total-(total*0.1)) ;
       System.out.println("Total bayar = "+diskon);
     
       return total;
   }
 
   public double cek_total_nonmember (){
       total = berat_barang*biaya;
       System.out.println("Harga Pengiriman Barang : Rp."+total);
       kembalian = bayar-total;
       System.out.println("Kembalian nya : Rp."+kembalian);
       return total;
   }
 
   public void cek_diskon (){
      int j; //initialize index
    boolean ketemu=false; // Boolean Merupakan tipe data yang hanya mempunyai nilai BENAR atau SALAH
        int kode = Integer.parseInt(JOptionPane.showInputDialog(null,"Masukkan  ID Member untuk mendapatkan diskon :"));

 

     for(j =0;j<id_member.length;j++){ //lakukan perulangan pada array
     if(id_member[j]==kode){
         ketemu=true;
         break; // Jika Nama yang dimasukkan sama dengan nama member maka dia akan salah dan berhenti dalam perulangan.
         }  
         }
     if(ketemu){
         System.out.println("Anda mendapatkan diskon 10%");
     }
     else{
         System.out.println("Kode yang anda masukkan salah");
     }
   }

   public void set_data_member(){
        login(); // METHOD INI DIGUNAKAN UNTUK LOGIN MEMBER
        password(); //METHOD INI DIGUNAKAN UNTUK MEMASUKKAN ID MEMBER
        cek_alamat_pengirim(); //METHOD INI DIGUNAKAN UNTUK MENGECEK ALAMAT PENGIRIM
        cek_nope_pengirim(); //METHOD INI DIGUNAKAN UNTUK MENGECEK NOMOR HP PENGIRIM
        set_kota_pengirim(); //METHOD INI DIGUNAKAN UNTUK MENSET KOTA PENGIRIM. KOTA PENGIRIM : PEKANBARU
        cek_nama_penerima(); //METHOD INI DIGUNAKAN UNTUK MENGECEK NAMA PENERIMA
        cek_alamat_penerima(); //METHOD INI DIGUNAKAN UNTUK MENGECEK ALAMAT PENERIMA
        cek_nope_penerima(); //METHOD INI DIGUNAKAN UNTUK MENGECEK NOMOR PENERIMA
        cek_kota_penerima(); //METHOD INI DIGUNAKAN UNTUK MENGECEK KOTA PENERIMA

 

        cek_biaya_perkg(); //METHOD INI DIGUNAKAN UNTUK MENGECEK BIAYA PERKG KE TUJUAN (KEY=PROVINSI)
        cek_jenis_barang(); //METHOD INI DIGUNAKAN UNTUK MENGECEK JENIS BARANG
        cek_nama_barang(); //METHOD INI DIGUNAKAN UNTUK MENGECEK NAMA BARANG
        cek_berat_barang(); //METHOD INI DIGUNAKAN UNTUK MENGECEK BERAT BERANG
        cek_diskon(); //METHOD INI DIGUNAKAN UNTUK MENGECEK cDISKON DARI TOTAL PENGIRIMAN
        cek_total_member(); //METHOD INI DIGUNAKAN UNTUK MENGECEK TOTAL DARI PENGIRIMAN
        cek_bayar(); //METHOD INI DIGUNAKAN UNTUK MENGECEK PEMBAYARAN DARI PENGIRIM
        cek_kembalian_member(); //METHOD INI DIGUNAKAN UNTUK MENGECEK KEMBALIAN DARI PENGIRIM
    }
   
    public void set_data_nonmember(){
        cek_nama_pengirim(); //METHOD INI DIGUNAKAN UNTUK MENGECEK NAMA PENGIRIM
        cek_alamat_pengirim(); //METHOD INI DIGUNAKAN UNTUK MENGECEK ALAMAT PENGIRIM
        cek_nope_pengirim(); //METHOD INI DIGUNAKAN UNTUK MENGECEK NOMOR HP PENGIRIM
        set_kota_pengirim(); //METHOD INI DIGUNAKAN UNTUK MENSET KOTA PENGIRIM. KOTA PENGIRIM : PEKANBARU
        cek_nama_penerima(); //METHOD INI DIGUNAKAN UNTUK MENGECEK NAMA PENERIMA
        cek_alamat_penerima(); //METHOD INI DIGUNAKAN UNTUK MENGECEK ALAMAT PENERIMA
        cek_nope_penerima(); //METHOD INI DIGUNAKAN UNTUK MENGECEK NOMOR PENERIMA
        cek_kota_penerima(); //METHOD INI DIGUNAKAN UNTUK MENGECEK KOTA PENERIMA
        cek_biaya_perkg(); //METHOD INI DIGUNAKAN UNTUK MENGECEK BIAYA PERKG KE TUJUAN (KEY=PROVINSI)
        cek_jenis_barang(); //METHOD INI DIGUNAKAN UNTUK MENGECEK JENIS BARANG
        cek_nama_barang(); //METHOD INI DIGUNAKAN UNTUK MENGECEK NAMA BARANG
        cek_berat_barang(); //METHOD INI DIGUNAKAN UNTUK MENGECEK BERAT BERANG
        cek_total_nonmember (); //METHOD INI DIGUNAKAN UNTUK MENGECEK TOTAL DARI PENGIRIMAN
        cek_bayar(); //METHOD INI DIGUNAKAN UNTUK MENGECEK PEMBAYARAN DARI PENGIRIM
        cek_kembalian(); //METHOD INI DIGUNAKAN UNTUK MENGECEK KEMBALIAN DARI PENGIRIM
    }
}

