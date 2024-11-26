package soal2;

import java.util.HashMap;

public class Negara {

    private String nama;
    private String jenisKepemimpinan;
    private String namaPemimpin;
    private Integer tanggalKemerdekaan;
    private Integer bulanKemerdekaan;
    private Integer tahunKemerdekaan;

    public Negara(String nama, String jenisKepemimpinan, String namaPemimpin, 
                  Integer tanggalKemerdekaan, Integer bulanKemerdekaan, Integer tahunKemerdekaan) {
        this.nama = nama;
        this.jenisKepemimpinan = jenisKepemimpinan;
        this.namaPemimpin = namaPemimpin;
        this.tanggalKemerdekaan = tanggalKemerdekaan;
        this.bulanKemerdekaan = bulanKemerdekaan;
        this.tahunKemerdekaan = tahunKemerdekaan;
    }

    public void hasilOutput(HashMap<Integer, String> bulanMap) {
        if (!this.jenisKepemimpinan.equalsIgnoreCase("monarki")) {
            System.out.print("Negara " + this.nama + " mempunyai " + this.jenisKepemimpinan + " bernama " + this.namaPemimpin);
            
            if (this.jenisKepemimpinan.equalsIgnoreCase("presiden") || 
                this.jenisKepemimpinan.equalsIgnoreCase("perdana menteri")) {
                System.out.println("\nDeklarasi Kemerdekaan pada Tanggal " + this.tanggalKemerdekaan + " " + 
                                   bulanMap.get(this.bulanKemerdekaan) + " " + this.tahunKemerdekaan + "\n");
            } else {
                System.out.println();
            }
        } else {
            System.out.println("Negara " + this.nama + " mempunyai Raja bernama " + this.namaPemimpin + "\n");
        }
    }
}