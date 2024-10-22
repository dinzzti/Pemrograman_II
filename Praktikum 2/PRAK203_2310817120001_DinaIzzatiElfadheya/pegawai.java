package praktikum2.soal3;

//Pada baris ini terjadi error karena menggunakan nama kelas Employee yang seharusnya adalah nama kelas pegawai, sehingga kode yang benar
//public class Employee{} 
public class pegawai {
	public String nama;

	// Pada baris ini terjadi error karena tipe data asal yang seharusnya adalah string, bukan char sehingga kode yang benar 
	// public char asal; 
	   public String asal; 
	   public String jabatan; 
	   public int umur;
	   
	   public String getNama(){
	     return nama;
	   }

	// Pada baris ini sebelumnya terjadi error karena tipe data sebelumnya char maka harus diganti dengan String agar kompatibel
	   public String getAsal(){ 
	      return asal;
	} 
	// Pada baris ini terjadi error karena sebelumnya tidak ada pendeklarasian variabel j 
	// public void setJabatan(){ 
	   public void setJabatan(String j){ 
	   this.jabatan=j; 
	  } 
	// Menambahkan metode getter untuk mengakses nilai        umur 
	   public int getUmur() { 
	   return umur;
	 }
	}


