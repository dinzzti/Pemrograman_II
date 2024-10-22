package praktikum2.soal3;

public class Soal3Main {
	public static void main(String[] args) { 
        pegawai p1 = new pegawai(); 
      //Pada baris ini terjadi error karena kurang tanda titik koma ; 
      //p1.nama = "Roi" 
        p1.nama = "Roi"; 
        p1.asal = "Kingdom of Orvel"; 
        p1.setJabatan("Assasin"); 
      //Karena umur masih belum ada nilainya maka beri nilai terlebih dahulu 
        p1.umur = 17; 
 
     //Pada baris ini tidak sesuai dengan output yang diminta soal. Jadi, hapus kata "Pegawai" 
     //System.out.println("Nama Pegawai: " + p1.getNama()); 
        System.out.println("Nama     : " + p1.getNama()); 
        System.out.println("Asal     : " + p1.getAsal()); 
        System.out.println("Jabatan  : " + p1.jabatan); 
     //Pada baris ini masih kurang lengkap tidak sesuai dengan output yang diminta soal. Jadi, ada penambahan "tahun" diakhir 
     // System.out.println("Umur: " + p1.umur); 
        System.out.println("Umur     : " + p1.umur + " tahun"); 
    } 
}

