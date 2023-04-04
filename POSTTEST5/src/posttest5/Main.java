package posttest5;

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
            if(email.equals(pemilik.getEmail())){
                if(pw.equals(pemilik.getPassword())){
                    while(kondisi){
                        //owner
                        System.out.println("\n\n|==============================================|");
                        System.out.println("|                  MENU OWNER                  |");
                        System.out.println("|==============================================|");
                        System.out.println("|==============================================|");
                        System.out.println("| 1. Tambah Data Karyawan                      |");
                        System.out.println("| 2. Tampil Data Karyawan                      |");
                        System.out.println("| 3. Ubah Data Karyawan                        |");
                        System.out.println("| 4. Hapus Data Karyawan                       |");
                        System.out.println("| 5. Log Out                                   |");
                        System.out.println("|==============================================|");
                        System.out.print("\n>>> Silahkan Masukkan Pilihan Anda: ");
                        pilih = input.nextInt();
                        switch(pilih){
                            case 1:
                                System.out.print("\n-> Masukkan Nama Karyawan: ");
                                String nama = br.readLine();
                                System.out.print("-> Masukkan E-mail Karyawan: ");
                                String mail = br.readLine();
                                System.out.print("-> Masukkan Alamat Karyawan: ");
                                String alamat = br.readLine();
                                System.out.print("-> Masukkan Gaji Karyawan: ");
                                int gaji = Integer.parseInt(br.readLine());
                                Karyawan dataBaru;
                                dataBaru = new Karyawan(mail, "123", gaji, nama, alamat);
                                dataKaryawan.add(dataBaru);
                                
                                System.out.println("\n\n|==================================================|");
                                System.out.println("|             DATA BERHASIL DITAMBAHKAN            |");
                                System.out.println("|==================================================|");
                                System.out.println("\n\t>>> Silahkan tekan [ENTER] <<<");
                                new Scanner(System.in).nextLine();
                                break;
                            case 2:
                                if(dataKaryawan.isEmpty()){
                                    System.out.println("\n\n|==================================================|");
                                    System.out.println("|               DATA TIDAK DITEMUKAN               |");
                                    System.out.println("|==================================================|");
                                }else{
                                    System.out.println("\n\n|==============================================|");
                                    System.out.println("|                  MENU OWNER                  |");
                                    System.out.println("|==============================================|");
                                    System.out.println("| 1. Tampil Data Karyawan (LENGKAP)            |");
                                    System.out.println("| 2. Tampil Data Karyawan (TANPA EMAIL & GAJI )|");
                                    System.out.println("|==============================================|");
                                    System.out.print("\n>>> Silahkan Masukkan Pilihan Anda: ");
                                    pilih = input.nextInt();
                                    switch(pilih){
                                        case 1:
                                            System.out.println("\n\n|==================================================|");
                                            System.out.println("|                  DATA KARYAWAN                   |");
                                            System.out.println("|==================================================|");
                                            for (int i = 0; i < dataKaryawan.size(); i++) {  
                                                dataKaryawan.get(i).show();
                                                System.out.println("|==================================================|");
                                            }
                                            break;
                                        case 2:
                                            System.out.println("\n\n|==================================================|");
                                            System.out.println("|                  DATA KARYAWAN                   |");
                                            System.out.println("|==================================================|");
                                             for (int i = 0; i < dataKaryawan.size(); i++) {  
                                                dataKaryawan.get(i).show(false);
                                                System.out.println("|==================================================|");
                                            }
                                            break;
                                        default:
                                            System.out.println("\n\n|==================================================|");
                                            System.out.println("|                 INPUTAN ANDA SALAH               |");
                                            System.out.println("|==================================================|");
                                    }     
                                }
                                System.out.println("\n\t>>> Silahkan tekan [ENTER] <<<");
                                new Scanner(System.in).nextLine();
                                break;
                            case 3:
                                if(dataKaryawan.isEmpty()){
                                    System.out.println("\n\n|==================================================|");
                                    System.out.println("|               DATA TIDAK DITEMUKAN               |");
                                    System.out.println("|==================================================|");
                                }else{
                                    System.out.println("\n\n|==================================================|");
                                    System.out.println("|                  DATA KARYAWAN                   |");
                                    System.out.println("|==================================================|");
                                    for (int i = 0; i < dataKaryawan.size(); i++) {
                                        System.out.println("|Data ke-" + (i + 1) + "   |");
                                        System.out.println("|==================================================|");
                                        System.out.println("1. Nama Karyawan       : " +dataKaryawan.get(i).getNama());
                                        System.out.println("2. Alamat Karyawan     : " +dataKaryawan.get(i).getAlamat());
                                        System.out.println("3. E-mail Karyawan     : " +dataKaryawan.get(i).getEmail());
                                        System.out.println("4. Gaji Karyawan       : Rp. " +dataKaryawan.get(i).getGaji());
                                        System.out.println("|==================================================|"); 
                                    }
                                    System.out.print("\nIngin Mengubah Data ke Berapa: ");
                                    int ind = Integer.parseInt(br.readLine());
                                    ind = ind-1;
                                    Karyawan edit = dataKaryawan.get(ind);
                                    if(dataKaryawan.size() <= ind){
                                        System.out.println("\n\n|==================================================|");
                                        System.out.println("|                 INPUTAN ANDA SALAH               |");
                                        System.out.println("|==================================================|");
                                    }else{
                                        System.out.println("\n\n|==============================================|");
                                        System.out.println("|          MENU UPDATE DATA KARYAWAN           |");
                                        System.out.println("|==============================================|");
                                        System.out.println("| 1. Ubah Nama Karyawan                        |");
                                        System.out.println("| 2. Ubah Alamat Karyawan                      |");
                                        System.out.println("| 3. Ubah E-mail Karyawan                      |");
                                        System.out.println("| 4. Ubah Gaji Karyawan                        |");
                                        System.out.println("|==============================================|");
                                        System.out.print("\nIngin Mengubah Data ke Berapa: ");
                                        int plh = Integer.parseInt(br.readLine());
                                        switch (plh){
                                            case 1:
                                                System.out.print("\n-> Masukkan Nama Karyawan: ");
                                                edit.setNama(br.readLine());
                                                break;
                                            case 2:
                                                System.out.print("\n-> Masukkan Alamat Karyawan: ");
                                                edit.setAlamat(br.readLine());
                                                break;
                                            case 3:
                                                System.out.print("\n-> Masukkan E-mail Karyawan: ");
                                                edit.setEmail(br.readLine());
                                                break;
                                            case 4:
                                                System.out.print("\n-> Masukkan Gaji Karyawan: ");
                                                edit.setGaji(Integer.parseInt(br.readLine()));
                                                break;
                                            default:
                                                System.out.println("\n\n|==================================================|");
                                                System.out.println("|                 INPUTAN ANDA SALAH               |");
                                                System.out.println("|==================================================|");
                                                break;
                                        }
                                        System.out.println("\n\n|==================================================|");
                                        System.out.println("|               DATA BERHASIL DIUBAH               |");
                                        System.out.println("|==================================================|");
                                    }
                                }
                                System.out.println("\n\t>>> Silahkan tekan [ENTER] <<<");
                                new Scanner(System.in).nextLine();
                                break;
                            case 4:
                                int ind;
                                if(dataKaryawan.isEmpty()){
                                    System.out.println("\n\n|==================================================|");
                                    System.out.println("|               DATA TIDAK DITEMUKAN               |");
                                    System.out.println("|==================================================|");
                                }else{
                                    System.out.println("\n\n|==================================================|");
                                    System.out.println("|                  DATA KARYAWAN                   |");
                                    System.out.println("|==================================================|");
                                    for (int i = 0; i < dataKaryawan.size(); i++) {
                                        System.out.println("|Data ke-" + (i + 1) + "   |");
                                        System.out.println("|==================================================|");
                                        System.out.println("1. Nama Karyawan       : " +dataKaryawan.get(i).getNama());
                                        System.out.println("2. Alamat Karyawan     : " +dataKaryawan.get(i).getAlamat());
                                        System.out.println("3. E-mail Karyawan     : " +dataKaryawan.get(i).getEmail());
                                        System.out.println("4. Gaji Karyawan       : Rp. " +dataKaryawan.get(i).getGaji());
                                        System.out.println("|==================================================|");
                                    }
                                    System.out.print("\nIngin Menghapus Data ke Berapa: ");
                                    ind = Integer.parseInt(br.readLine());
                                    ind = ind-1;
                                    if(dataKaryawan.size() <= ind){
                                        System.out.println("\n\n|==================================================|");
                                        System.out.println("|                 INPUTAN ANDA SALAH               |");
                                        System.out.println("|==================================================|");
                                    }else{
                                        System.out.print("\nApakah Anda Yakin Ingin Menghapusnya(y/t)?  ");
                                        String ans = br.readLine();
                                        if(ans.equalsIgnoreCase("y")){
                                            dataKaryawan.remove(ind);
                                            System.out.println("\n\n|==================================================|");
                                            System.out.println("|              DATA BERHASIL DIHAPUS               |");
                                            System.out.println("|==================================================|");
                                        }
                                        else if(ans.equalsIgnoreCase("t")){
                                            System.out.println("\n\n|==================================================|");
                                            System.out.println("|                DATA GAGAL DIHAPUS                |");
                                            System.out.println("|==================================================|");
                                        }
                                        else{
                                            System.out.println("\n\n|==================================================|");
                                            System.out.println("|                 INPUTAN ANDA SALAH               |");
                                            System.out.println("|==================================================|");
                                        }
                                    }
                                    System.out.println("\n\t>>> Silahkan tekan [ENTER] <<<");
                                    new Scanner(System.in).nextLine();
                                }
                                break;
                            case 5:
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
                }
                else{
                    System.out.println("\n\n|==================================================|");
                    System.out.println("|          PASSWORD ATAU EMAIL ANDA SALAH          |");
                    System.out.println("|==================================================|");
                    System.out.println("\n\t>>> Silahkan tekan [ENTER] <<<");
                    new Scanner(System.in).nextLine();
                }
            }else{
                //karyawan
                for(Karyawan login : dataKaryawan){
                    if(login.getEmail().equals(email)){
                        if(login.getPassword().equals(pw)){
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
                                pilih = input.nextInt();
                                switch (pilih) {
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
                        System.out.println("\n\n|==================================================|");
                        System.out.println("|          PASSWORD ATAU EMAIL ANDA SALAH          |");
                        System.out.println("|==================================================|");
                        System.out.println("\n\t>>> Silahkan tekan [ENTER] <<<");
                        new Scanner(System.in).nextLine();
                        }
                    }else{
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
            
