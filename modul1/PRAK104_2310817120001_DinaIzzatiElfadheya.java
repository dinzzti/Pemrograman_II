import java.util.Scanner;

public class PRAK104_2310817120001_DinaIzzatiElfadheya {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Tangan Abu: ");
        String pilihan_Abu = input.nextLine().toUpperCase();
        
        System.out.print("Tangan Bagas: ");
        String pilihan_Bagas = input.nextLine().toUpperCase();
        
        String[] Abu = pilihan_Abu.split(" ");
        String[] Bagas = pilihan_Bagas.split(" ");

        int score_Abu = 0;
        int score_Bagas = 0;
        
        for (int i = 0; i < 3; i++) {
            char pilihanAbu = Abu[i].charAt(0);
            char pilihanBagas = Bagas[i].charAt(0);

            if (
                pilihanAbu == 'B' && pilihanBagas == 'G' || 
                pilihanAbu == 'G' && pilihanBagas == 'K' || 
                pilihanAbu == 'K' && pilihanBagas == 'B'
            ) {
                score_Abu++;
            } else if (
                pilihanBagas == 'B' && pilihanAbu == 'G' || 
                pilihanBagas == 'G' && pilihanAbu == 'K' || 
                pilihanBagas == 'K' && pilihanAbu == 'B'
            ) {
                score_Bagas++;
            }
        }
        if (score_Abu > score_Bagas) {
            System.out.println("Abu");
        } else if (score_Bagas > score_Abu) {
            System.out.println("Bagas");
        } else {
            System.out.println("Seri");
        } 
        input.close();
    }
}