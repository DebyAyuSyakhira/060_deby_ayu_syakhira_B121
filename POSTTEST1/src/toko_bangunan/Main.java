package toko_bangunan;

import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        Barang item;
        item = new Barang();
        System.out.println("|==================================================|");
        System.out.println("|                  SELAMAT DATANG                  |");
        System.out.println("|           DI PROGRAM PENDATAAN BARANG            |");
        System.out.println("|             TOKO MATERIAL SEYANIUS               |");
        System.out.println("|==================================================|");
        System.out.println("\n>>> Silahkan tekan [ENTER] untuk ke menu utama <<<");
        new Scanner(System.in).nextLine();
        while (true){
            int pilih;
            System.out.println("\n\n|==============================================|");
            System.out.println("|                  DAFTAR MENU                 |");
            System.out.println("|==============================================|");
            System.out.println("| 1. Tambah Data                               |");
            System.out.println("| 2. Tampil Data                               |");
            System.out.println("| 3. Ubah Data                                 |");
            System.out.println("| 4. Hapus Data                                |");
            System.out.println("| 5. EXIT                                      |");
            System.out.println("|==============================================|");
            System.out.println("\n>>> Silahkan Masukkan Pilihan Anda: ");
            pilih = input.nextInt();
            switch (pilih) {
                case 1 -> {
                    item.tambah();
                    System.out.println("\n\n|==================================================|");
                    System.out.println("|             DATA BERHASIL DITAMBAHKAN            |");
                    System.out.println("|==================================================|");
                    System.out.println("\n>>> Silahkan tekan [ENTER] untuk kembali ke menu utama <<<");
                    new Scanner(System.in).nextLine();
                }
                case 2 -> {
                    item.tampil();
                    System.out.println("\n>>> Silahkan tekan [ENTER] untuk kembali ke menu utama <<<");
                    new Scanner(System.in).nextLine();
                }
                case 3 -> {
                    item.ubah();
                    System.out.println("\n>>> Silahkan tekan [ENTER] untuk kembali ke menu utama <<<");
                    new Scanner(System.in).nextLine();
                }
                case 4 -> {
                    item.hapus();
                    System.out.println("\n>>> Silahkan tekan [ENTER] untuk kembali ke menu utama <<<");
                    new Scanner(System.in).nextLine();
                }
                case 5 -> {
                    item.keluar();
                    System.exit(0);
                }
                default -> {
                    System.out.println("\n\n|==================================================|");
                    System.out.println("|                 INPUTAN ANDA SALAH               |");
                    System.out.println("|==================================================|");
                    System.out.println("\n\t>>> Silahkan tekan [ENTER] <<<");
                    new Scanner(System.in).nextLine();
                }
                
            }
        }
    }
}
              
       
        
    
    


