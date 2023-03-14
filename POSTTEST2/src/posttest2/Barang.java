package posttest2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Barang { 
    
    InputStreamReader strm = new InputStreamReader(System.in);
    BufferedReader input = new BufferedReader(strm);
    static ArrayList<constr> brg = new ArrayList<>();
 
    public class constr {
        private String nama;
        private String jenis;
        private String kode;
        private int stok; 
        private int harga;

        public constr(String nama, String jenis, String kode, int stok, int harga){
            this.nama = nama;
            this.jenis = jenis;
            this.kode = kode;
            this.stok = stok;
            this.harga = harga;
        }
        public String getNama(){
            return nama;
        } 
        public String getJenis(){
            return jenis;
        } 
        public String getKode(){
            return kode;
        } 
        public int getStok(){
            return stok;
        } 
        public int getHarga(){
            return harga;
        } 

        public void setNama(String newnama){
            this.nama = newnama;
        }

        public void setJenis(String newjenis){
            this.jenis = newjenis;
        }

        public void setKode(String newkode){
            this.kode = newkode;
        }

        public void setStok(int newstok){
            this.stok = newstok;
        }

        public void setHarga(int newharga){
            this.harga= newharga;
        }
    }
    void tambah() throws IOException{
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
            int harga = Integer.parseInt(input.readLine());
            System.out.println("|====================================================|");

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
            System.out.println("1. Nama Barang  : " +brg.get(i).getNama());
            System.out.println("2. Jenis Barang : " +brg.get(i).getJenis());
            System.out.println("3. Kode Barang  : " +brg.get(i).getKode());
            System.out.println("4. Stok Barang  : " +brg.get(i).getStok());
            System.out.println("5. Harga Barang : " +brg.get(i).getHarga());
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
            System.out.print("\nIngin Mengubah Data ke Berapa: ");
            int ind = Integer.parseInt(input.readLine());
            ind = ind-1;
            if(brg.size() <= ind){
                System.out.println("\n\n|==================================================|");
                System.out.println("|                 INPUTAN ANDA SALAH               |");
                System.out.println("|==================================================|");
            }else{  
                System.out.print("-> Masukkan Nama Barang: ");
                String nama = input.readLine();
                System.out.print("-> Masukkan Jenis Barang: ");
                String jenis = input.readLine();
                System.out.print("-> Masukkan Kode Barang: ");
                String kode = input.readLine();
                System.out.print("-> Masukkan jumlah stok barang: ");
                int stok = Integer.parseInt(input.readLine());
                System.out.print("-> Masukkan harga barang (per Satuan): ");
                int harga = Integer.parseInt(input.readLine());

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
            System.out.print("\nIngin Menghapus Data ke Berapa: ");
            int ind = Integer.parseInt(input.readLine());
            ind = ind-1;
            if(brg.size() <= ind){
                System.out.println("\n\n|==================================================|");
                System.out.println("|                 INPUTAN ANDA SALAH               |");
                System.out.println("|==================================================|");
            }else{
                System.out.print("\nApakah Anda Yakin Ingin Menghapusnya(y/t)?  ");
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
