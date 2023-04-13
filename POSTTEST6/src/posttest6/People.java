package posttest6;

import java.io.BufferedReader;
import java.io.InputStreamReader;


//Abstract Class
public abstract class People {
    protected String email, password, nama, alamat;
 
    
    InputStreamReader strm = new InputStreamReader(System.in);
    BufferedReader input = new BufferedReader(strm);
    protected int pilihan;
    
    //penerapan keyword static
    protected static int jumlah = 0;
     
    public People(String email, String password, String nama, String alamat) {
        this.email = email;
        this.password = password;
        this.nama = nama;
        this.alamat = alamat;
        jumlah++;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String username) {
        this.email = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
        this.alamat = alamat;
    }

    public static int getJumlah() {
        return jumlah;
    }

    //Abstract method
    public abstract void show();
}