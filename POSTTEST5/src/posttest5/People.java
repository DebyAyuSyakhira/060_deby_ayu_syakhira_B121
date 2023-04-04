package posttest5;

//Abstract Class
public abstract class People {
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
    
    
    //Abstract method
    public abstract void show();
}