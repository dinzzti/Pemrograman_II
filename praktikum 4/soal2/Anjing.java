package soal2;

public class Anjing extends HewanPeliharaan {
    private final String warnaBulu;
    private final String kemampuan;

    public Anjing(String nama, String ras, String warnaBulu, String kemampuan) {
        super(nama, ras);
        this.warnaBulu = warnaBulu;
        this.kemampuan = kemampuan;
    }

    public void displayDetailAnjing() {
        super.display();
        System.out.println("Memilikinarna Bulu: " + warnaBulu);
        System.out.println("Memiliki kemampuan: " + kemampuan);
    }
}
