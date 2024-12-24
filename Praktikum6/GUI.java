package Praktikum6;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class GUI {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Daftar Mahasiswa");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
    
        Mahasiswa[] mahasiswaList = {
            new Mahasiswa("2310", "Dina", " "),
            new Mahasiswa("23108", "Dinaz", " "),
            new Mahasiswa("231081", "Dinazti"," "),
            new Mahasiswa("2310817", "Dinazzti"," "),
            new Mahasiswa("23108171", "Elfadheya"," "),
            new Mahasiswa("2310871", "Izzati"," "),
            new Mahasiswa("231018", "Izzat"," "),
            new Mahasiswa("23180", "Izza"," "),
            new Mahasiswa("2301", "Izz"," "),
            new Mahasiswa("231", "Iz"," ")
        };

        
        String[] kolom = {"NIM", "Nama", " "};
        String[][] data = new String[mahasiswaList.length][2];
        for (int i = 0; i < mahasiswaList.length; i++) {
            data[i][0] = mahasiswaList[i].getNim();
            data[i][1] = mahasiswaList[i].getNama();
        }


        DefaultTableModel model = new DefaultTableModel(data, kolom);

        
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);

        
        frame.add(scrollPane);

        
        frame.setVisible(true);
}
}