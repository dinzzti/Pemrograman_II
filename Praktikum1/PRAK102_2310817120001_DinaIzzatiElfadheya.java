import java.util.Scanner;
public class PRAK102_2310817120001_DinaIzzatiElfadheya {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print ("Input\n");
        int angka_awal = input.nextInt();
        
        int hasil = 0;
       
        System.out.print ("Output\n");
        while (hasil < 11) {
            if (angka_awal % 5 == 0) {
                System.out.print(((angka_awal / 5) - 1) + " ");
            } else {
                System.out.print(angka_awal + " ");
            }
            angka_awal++;
            hasil++;
        }
        input.close();
    }
}
