package posttest4;
 
public class People {
    protected String nama, alamat;
 
    public People(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }
 
    public String getNama() {
        return nama;
    }
 
    public void setNama(String nama) {
        this.nama = nama;
    }
 
    public String getAlamat() {
        return alamat;
    }
 
    public void setAlamat(String alamat) {
        this.alamat= alamat;
    }
    
    public void show(){
        System.out.println("| Nama : " + this.nama);
        System.out.println("| Alamat : " + this.alamat);
    }
 
 
}
 