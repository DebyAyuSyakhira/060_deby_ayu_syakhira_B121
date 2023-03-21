package posttest3;

public class Barang {
    protected String nama;
    protected int stok; 
    protected String harga;
    protected String jenis;
    protected String kode;
 
    public Barang(String nama, String harga, String jenis, int stok, String kode){
        this.nama = nama;
        this.stok = stok;
        this.harga = harga;
        this.jenis = jenis;
        this.kode = kode;
    }
 
    public String getNama() {
        return nama;
    }
 
    public void setNama(String nama) {
        this.nama = nama;
    }
 
    public int getStok() {
        return stok;
    }
 
    public void setStok(int stok) {
        this.stok = stok;
    }
 
    public String getHarga() {
        return harga;
    }
 
    public void setHarga(String harga) {
        this.harga = harga;
    }
 
    public String getJenis() {
        return jenis;
    }
 
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
 
    public String getKode() {
        return kode;
    }
 
    public void setKode(String kode) {
        this.kode = kode;
    }
 
}
