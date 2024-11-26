package soal3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Mahasiswa> mahasiswaList = new ArrayList<>();
        int pilihan;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                    String nim = scanner.nextLine();

                    if (isNimExists(mahasiswaList, nim)) {
                        System.out.println("NIM sudah ada. Silakan masukkan NIM yang unik.");
                    } else {
                        Mahasiswa mahasiswa = new Mahasiswa(nama, nim);
                        mahasiswaList.add(mahasiswa);
                        System.out.println("Mahasiswa " + nama + " ditambahkan.");
                    }
                    break;

                case 2:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                    String nimToDelete = scanner.nextLine();
                    if (removeMahasiswaByNim(mahasiswaList, nimToDelete)) {
                        System.out.println("Mahasiswa dengan NIM " + nimToDelete + " dihapus.");
                    } else {
                        System.out.println("Mahasiswa dengan NIM " + nimToDelete + " tidak ditemukan.");
                    }
                    break;

                case 3:
                    System.out.print("Masukkan NIM Mahasiswa yang dicari: ");
                    String nimToSearch = scanner.nextLine();
                    Mahasiswa foundMahasiswa = findMahasiswaByNim(mahasiswaList, nimToSearch);
                    if (foundMahasiswa != null) {
                        System.out.println("Ditemukan: NIM: " + foundMahasiswa.getNim() + ", Nama: " + foundMahasiswa.getNama());
                    } else {
                        System.out.println("Mahasiswa dengan NIM " + nimToSearch + " tidak ditemukan.");
                    }
                    break;

                case 4:
                    System.out.println("Daftar Mahasiswa:");
                    for (Mahasiswa mhs : mahasiswaList) {
                        System.out.println("NIM: " + mhs.getNim() + ", Nama: " + mhs.getNama());
                    }
                    break;

                case 0:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 0);
        scanner.close();
    }

    private static boolean isNimExists(ArrayList<Mahasiswa> mahasiswaList, String nim) {
        for (Mahasiswa mhs : mahasiswaList) {
            if (mhs.getNim().equals(nim)) {
                return true;
            }
        }
        return false;
    }

    private static boolean removeMahasiswaByNim(ArrayList<Mahasiswa> mahasiswaList, String nim) {
        for (int i = 0; i < mahasiswaList.size(); i++) {
            if (mahasiswaList.get(i).getNim().equals(nim)) {
                mahasiswaList.remove(i);
                return true;
            }
        }
        return false;
    }

    private static Mahasiswa findMahasiswaByNim(ArrayList<Mahasiswa> mahasiswaList, String nim) {
        for (Mahasiswa mhs : mahasiswaList) {
            if (mhs.getNim().equals(nim)) {
                return mhs; 
            }
        }
        return null;
    }
}