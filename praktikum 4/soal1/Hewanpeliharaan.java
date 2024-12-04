package soal1;
import java.util.Scanner;
public class Hewanpeliharaan {

		private final String nama; 
		private final String ras; 
				
		public Hewanpeliharaan(){ 
			Scanner scanner = new Scanner(System.in); 
			System.out.print("Nama Hewan Peliharaan: "); 
			this.nama = scanner.nextLine(); 
			System.out.print("Ras: "); 
			this.ras = scanner.nextLine(); 
		} 
		void tampilkanPeliharaan(){ 
			System.out.println("Detail Hewan Peliharaan: "); 
			System.out.println("Nama hewan peliharaanku adalah: "+ nama); 
			System.out.println("Dengan ras: "+ ras); 
		} 
	}

