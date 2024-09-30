import java.util.Scanner;
public class PRAK103_2310817120001_DinaIzzatiElfadheya {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input\n");
        int N = input.nextInt();
        
        System.out.print("");
        int angka_awal = input.nextInt();
        
        int angka_ganjil = 0;  
        
        System.out.print("Output\n");
        do {
            if (angka_awal % 2 != 0) {  
                System.out.print(angka_awal + " ");
                angka_ganjil++;
            }
            angka_awal++;  
        } while (angka_ganjil < N);  
        input.close();
    }
}
