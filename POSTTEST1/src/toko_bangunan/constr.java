package toko_bangunan;

public class constr {
    String nama, jenis, kode;
    int stok, harga;
   
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
    public int getharga(){
        return harga;
    } 

    void show() {
        System.out.println("1. Nama Barang  : " +this.nama);
        System.out.println("2. Jenis Barang : " +this.jenis);
        System.out.println("3. Kode Barang  : " +this.kode);
        System.out.println("4. Stok Barang  : " +this.stok);
        System.out.println("5. Harga Barang : " +this.harga);
    }
    
}
