package Praktikum6;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String kopong;

    public Mahasiswa(String nim, String nama, String kopong) {
        this.nim = nim;
        this.nama = nama;
        this.kopong = kopong;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void getKosong(String kopong){
        this.kopong = kopong;
    }

    public void setKosong(String kopong){
        this.kopong = kopong;
    }

}
