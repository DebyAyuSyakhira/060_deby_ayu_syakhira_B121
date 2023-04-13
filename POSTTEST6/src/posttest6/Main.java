package posttest6;

import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
 

//semua karyawan memiliki password: 123
//penerapan keyword final pada class Main
public final class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        InputStreamReader strm = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(strm);
        ArrayList<Karyawan> dataKaryawan = new ArrayList<>();
        dataKaryawan.add(new Karyawan("karyawan@gmail.com", "123", 3000000, "karyawan1", "Jl.Panjaitan"));
        Owner pemilik = new Owner("owner@gmail.com", "owner", "owner", "Jl. Kuaro");
        
        Procedure item;
        item = new Procedure();
        
        while (true){
            int chance = dataKaryawan.size();
            boolean kondisi = true;
            System.out.println("\n\n|==================================================|");
            System.out.println("|                  SELAMAT DATANG                  |");
            System.out.println("|           DI PROGRAM PENDATAAN BARANG            |");
            System.out.println("|             TOKO MATERIAL SEYANIUS               |");
            System.out.println("|==================================================|");
            System.out.println("| 1. Log In                                        |");
            System.out.println("| 2. EXIT                                          |");
            System.out.println("|==================================================|");
            System.out.print("\n>>> Silahkan Masukkan Pilihan Anda: ");
            int pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("\n\n|==============================================|");
                    System.out.println("|                  LOGIN FORM                  |");
                    System.out.println("|==============================================|");
                    break;
                case 2:
                    item.keluar();
                    System.exit(0);
                default:
                    System.out.println("\n\n|==================================================|");
                    System.out.println("|                 INPUTAN ANDA SALAH               |");
                    System.out.println("|==================================================|");
                    continue;
            }
            System.out.print("| Masukkan Email Anda: ");
            String email = br.readLine();
            System.out.print("| Masukkan Password Anda: ");
            String pw = br.readLine();
            System.out.println("|==============================================|");
            //Owner
            if(email.equals(pemilik.getEmail())){
                if(pw.equals(pemilik.getPassword())){
                    pemilik.menu();
                }
                else{
                    System.out.println("\n\n|==================================================|");
                    System.out.println("|          PASSWORD ATAU EMAIL ANDA SAL3H          |");
                    System.out.println("|==================================================|");
                    System.out.println("\n\t>>> Silahkan tekan [ENTER] <<<");
                    new Scanner(System.in).nextLine();
                }
            }else{
                //karyawan
                for(Karyawan login : dataKaryawan){
                    if(login.getEmail().equals(email) && login.getPassword().equals(pw)){
                        while(kondisi){
                            System.out.println("\n|==============================================|");
                            System.out.println("|                  MENU KARYAWAN               |");
                            System.out.println("|==============================================|");
                            System.out.println("| 1. Tambah Data Barang                        |");
                            System.out.println("| 2. Tampil Data Barang                        |");
                            System.out.println("| 3. Ubah Data Barang                          |");
                            System.out.println("| 4. Hapus Data Barang                         |");
                            System.out.println("| 5. Log Out                                   |");
                            System.out.println("|==============================================|");
                            System.out.print("\n>>> Silahkan Masukkan Pilihan Anda: ");
                            int pilh = input.nextInt();
                            switch(pilh){
                                case 1:
                                    item.tambahBarang();
                                    System.out.println("\n\n|==================================================|");
                                    System.out.println("|             DATA BERHASIL DITAMBAHKAN            |");
                                    System.out.println("|==================================================|");
                                    System.out.println("\n\t>>> Silahkan tekan [ENTER] <<<");
                                    new Scanner(System.in).nextLine();    
                                    break;
                                case 2:
                                    item.tampilBarang();
                                    System.out.println("\n\t>>> Silahkan tekan [ENTER] <<<");
                                    new Scanner(System.in).nextLine();   
                                    break;
                                case 3:
                                    item.ubahBarang();
                                    System.out.println("\n\t>>> Silahkan tekan [ENTER] <<<");
                                    new Scanner(System.in).nextLine(); 
                                    break;
                                case 4:
                                    item.hapusBarang();
                                    System.out.println("\n\t>>> Silahkan tekan [ENTER] <<<");
                                    new Scanner(System.in).nextLine();  
                                    break;
                                case 5:
                                    email = null;
                                    pw = null;
                                    kondisi = false;
                                break;
                                default:
                                    System.out.println("\n\n|==================================================|");
                                    System.out.println("|                 INPUTAN ANDA SALAH               |");
                                    System.out.println("|==================================================|");
                                    System.out.println("\n\t>>> Silahkan tekan [ENTER] <<<");
                                    new Scanner(System.in).nextLine();
                                break;
                            }
                        }
                    }else{
                        chance = chance - 1;
                        if(chance < 1){
                            System.out.println("\n\n|==================================================|");
                            System.out.println("|          PASSWORD ATAU EMAIL ANDA SALAH          |");
                            System.out.println("|==================================================|");
                            System.out.println("\n\t>>> Silahkan tekan [ENTER] <<<");
                            new Scanner(System.in).nextLine();
                        }
                    }
                }
            }
        }
    } 
}
            
