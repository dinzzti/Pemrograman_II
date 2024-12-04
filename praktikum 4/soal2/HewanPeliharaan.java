package soal2;

public class HewanPeliharaan {
    private final String nama;
    private final String ras;

    public HewanPeliharaan(String nama, String ras) {
        this.nama = nama;
        this.ras = ras;
    }

    public String getNama() {
        return nama;
    }

    public String getRas() {
        return ras;
    }

    public void display() {
    	System.out.println("Detail Hewan Peliharaan: ");
        System.out.println("Nama Hewan Peliharaanku adalah: " + nama);
        System.out.println("Dengan ras: " + ras);
    }
}
