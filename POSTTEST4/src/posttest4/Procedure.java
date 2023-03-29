package posttest4;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;


public class Procedure {
    InputStreamReader strm = new InputStreamReader(System.in);
    BufferedReader input = new BufferedReader(strm);
    ArrayList<Barang> dataBarang = new ArrayList<>();

    //prosedur manajemen barang
    void tambahBarang() throws IOException{
        System.out.print("\n>>> Masukkan Jumlah Data Yang Ingin Anda Masukkan: ");
        int jmlh = Integer.parseInt(input.readLine());
        System.out.println("|====================================================|");
        for(int i = 0; i < jmlh; i++){
            System.out.println("|Data ke-" + (i + 1)+"|");
            System.out.println("|=========|");
            System.out.print("-> Masukkan Nama Barang: ");
            String nama = input.readLine();
            System.out.print("-> Masukkan Jenis Barang: ");
            String jenis = input.readLine();
            System.out.print("-> Masukkan Kode Barang: ");
            String kode = input.readLine();
            System.out.print("-> Masukkan jumlah stok barang: ");
            int stok = Integer.parseInt(input.readLine());
            System.out.print("-> Masukkan harga barang (per Satuan): ");
            String harga = input.readLine();
            System.out.println("|====================================================|");

            Barang itemBarang;
            itemBarang = new Barang(nama, harga, jenis, stok, kode);
            dataBarang.add(itemBarang);
        }    
    }
 
    void tampilBarang() throws IOException{
        if(dataBarang.isEmpty()){
            System.out.println("\n\n|==================================================|");
            System.out.println("|               DATA TIDAK DITEMUKAN               |");
            System.out.println("|==================================================|");
        }else{
            System.out.println("\n\n|============================|");
            System.out.println("|        DATA BARANG         |");
            System.out.println("|============================|");
            for (int i = 0; i < dataBarang.size(); i++) {
                System.out.println("|Data ke-" + (i + 1));
                System.out.println("|============================|");
                System.out.println("1. Nama Barang  : " +dataBarang.get(i).getNama());
                System.out.println("2. Jenis Barang : " +dataBarang.get(i).getJenis());
                System.out.println("3. Kode Barang  : " +dataBarang.get(i).getKode());
                System.out.println("4. Stok Barang  : " +dataBarang.get(i).getStok());
                System.out.println("5. Harga Barang : " +dataBarang.get(i).getHarga());
                System.out.println("|============================|");
            }
        }
    }
 
    void ubahBarang() throws IOException{
        if(dataBarang.isEmpty()){
            System.out.println("\n\n|==================================================|");
            System.out.println("|               DATA TIDAK DITEMUKAN               |");
            System.out.println("|==================================================|");
        }else{
            tampilBarang(); 
                 System.out.print("Masukkan Nama Barang yang ingin diubah: ");
                 String nma = input.readLine();
                 System.out.println("|==================================================|");
                 for(Barang setdetail : dataBarang){
                    if (setdetail.getNama().equals(nma)){
                        System.out.print("-> Masukkan Nama Barang: ");
                        setdetail.setNama(input.readLine());
                        System.out.print("-> Masukkan Jenis Barang: ");
                        setdetail.setJenis(input.readLine());
                        System.out.print("-> Masukkan Kode Barang: ");
                        setdetail.setKode(input.readLine());
                        System.out.print("-> Masukkan jumlah stok barang: ");
                        setdetail.setStok(Integer.parseInt(input.readLine()));
                        System.out.print("-> Masukkan harga barang (per Satuan): ");
                        setdetail.setHarga(input.readLine());
                        System.out.println("\n\n|==================================================|");
                        System.out.println("|               DATA BERHASIL DIUBAH               |");
                        System.out.println("|==================================================|");
                        break;
                    
                    }else{
                        System.out.println("\n\n|==================================================|");
                        System.out.println("|                 INPUTAN ANDA SALAH               |");
                        System.out.println("|==================================================|");
                    }
                }
    }
//        }             
    }
 
    void hapusBarang() throws IOException {
        if(dataBarang.isEmpty()){
            System.out.println("\n\n|==================================================|");
            System.out.println("|               DATA TIDAK DITEMUKAN               |");
            System.out.println("|==================================================|");
        }else{
            tampilBarang();
            System.out.print("\nIngin Menghapus Data ke Berapa: ");
            int ind = Integer.parseInt(input.readLine());
            ind = ind-1;
            if(dataBarang.size() <= ind){
                System.out.println("\n\n|==================================================|");
                System.out.println("|                 INPUTAN ANDA SALAH               |");
                System.out.println("|==================================================|");
            }else{
                System.out.print("\nApakah Anda Yakin Ingin Menghapusnya(y/t)?  ");
                String ans = input.readLine();
                if(ans.equalsIgnoreCase("y")){
                    dataBarang.remove(ind);
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
