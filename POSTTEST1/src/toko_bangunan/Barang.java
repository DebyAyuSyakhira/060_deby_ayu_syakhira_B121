package toko_bangunan;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Barang { 
    String nama, jenis, kode;
    int stok, harga;
    
    InputStreamReader strm = new InputStreamReader(System.in);
    BufferedReader input = new BufferedReader(strm);
    static ArrayList<constr> brg = new ArrayList<>();
  
    void tambah() throws IOException{
        System.out.println("\nMasukkan Jumlah Data Yang Ingin Anda Masukkan: ");
        int jmlh = Integer.parseInt(input.readLine());
        for(int i = 0; i < jmlh; i++){
            System.out.println("\n-> Masukkan Nama Barang: ");
            nama = input.readLine();
            System.out.println("\n-> Masukkan Jenis Barang: ");
            jenis = input.readLine();
            System.out.println("\n-> Masukkan Kode Barang: ");
            System.out.println("==KETERANGAN==");
            System.out.println("1. Alat (A)");
            System.out.println("2. Bahan (B)\n");
            kode = input.readLine();
            System.out.println("\n-> Masukkan jumlah stok barang: ");
            stok = Integer.parseInt(input.readLine());
            System.out.println("\n-> Masukkan harga barang (per Satuan): ");
            harga = Integer.parseInt(input.readLine());

            constr itemBarang;
            itemBarang = new constr(nama,jenis,kode,stok,harga);
            brg.add(itemBarang);
        }  
    }   
    
    void tampil() throws IOException{
        if(brg.isEmpty()){
            System.out.println("\n\n|==================================================|");
            System.out.println("|               DATA TIDAK DITEMUKAN               |");
            System.out.println("|==================================================|");
        }else{
            System.out.println("\n\n|============================|");
            System.out.println("|        DATA BARANG         |");
            System.out.println("|============================|");
            for (int i = 0; i < brg.size(); i++) {
                System.out.println("|Data ke-" + (i + 1));
                System.out.println("|============================|");
                brg.get(i).show();
                System.out.println("|============================|");
            }
        }
    }
    
    void ubah() throws IOException{
        if(brg.isEmpty()){
            System.out.println("\n\n|==================================================|");
            System.out.println("|               DATA TIDAK DITEMUKAN               |");
            System.out.println("|==================================================|");
        }else{
            tampil();
            System.out.println("\nIngin Mengubah Data ke Berapa: ");
            int ind = Integer.parseInt(input.readLine());
            ind = ind-1;
            if(brg.size() <= ind){
                System.out.println("\n\n|==================================================|");
                System.out.println("|                 INPUTAN ANDA SALAH               |");
                System.out.println("|==================================================|");
            }else{  
                System.out.println("\n-> Masukkan Nama Barang: ");
                nama = input.readLine();
                System.out.println("\n-> Masukkan Jenis Barang: ");
                jenis = input.readLine();
                System.out.println("\n-> Masukkan Kode Barang: ");
                System.out.println("==KETERANGAN==");
                System.out.println("1. Alat (A)");
                System.out.println("2. Bahan (B)\n");
                kode = input.readLine();
                System.out.println("\n-> Masukkan jumlah stok barang: ");
                stok = Integer.parseInt(input.readLine());
                System.out.println("\n-> Masukkan harga barang (per Satuan): ");
                harga = Integer.parseInt(input.readLine());

                constr itemBarang;
                itemBarang = new constr(nama,jenis,kode,stok,harga);
                brg.set(ind, itemBarang);
                
                System.out.println("\n\n|==================================================|");
                System.out.println("|               DATA BERHASIL DIUBAH               |");
                System.out.println("|==================================================|");
            }
        }
        
    }
    
    void hapus() throws IOException {
        if(brg.isEmpty()){
            System.out.println("\n\n|==================================================|");
            System.out.println("|               DATA TIDAK DITEMUKAN               |");
            System.out.println("|==================================================|");
        }else{
            tampil();
            System.out.println("\nIngin Menghapus Data ke Berapa: ");
            int ind = Integer.parseInt(input.readLine());
            ind = ind-1;
            if(brg.size() <= ind){
                System.out.println("\n\n|==================================================|");
                System.out.println("|                 INPUTAN ANDA SALAH               |");
                System.out.println("|==================================================|");
            }else{
                System.out.println("\nApakah Anda Yakin Ingin Menghapusnya(y/t)?  ");
                String ans = input.readLine();
                if(ans.equalsIgnoreCase("y")){
                    brg.remove(ind);
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
        }
    }
   
    void keluar()throws IOException{
        System.out.println("\n\n|==================================================|");
        System.out.println("|      ANDA TELAH BERHASIL KELUAR DARI PROGRAM     |");
        System.out.println("|           TERIMAKASIH TELAH BERKUNJUNG           |");
        System.out.println("|==================================================|");
    }
}
