import java.util.Scanner;
public class PRAK105_2310817120001_DinaIzzatiElfadheya {
    public static final Float PHI = 3.14f;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jari-jari: ");
        float jari_jari_tabung = input.nextFloat();
        
        System.out.print("Masukkan tinggi: ");
        float tinggi_tabung = input.nextFloat();
        
        float volume_tabung = PHI * jari_jari_tabung * jari_jari_tabung * tinggi_tabung;
        System.out.printf("Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f m3\n", jari_jari_tabung, tinggi_tabung, volume_tabung);
        
        input.close();
    }
}