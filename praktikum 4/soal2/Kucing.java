package soal2;

public class Kucing extends HewanPeliharaan {
    private final String warnaBulu;

    public Kucing(String nama, String ras, String warnaBulu) {
        super(nama, ras); 
        this.warnaBulu = warnaBulu;
    }

    public void display() {
        super.display();
        System.out.println("Memiliki warna Bulu: " + warnaBulu);
    }
}
