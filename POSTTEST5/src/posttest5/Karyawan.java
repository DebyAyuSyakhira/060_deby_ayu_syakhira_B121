package posttest5;
public class Karyawan extends People{
    private String email; 
    //penerapan keyword final pada variable 'password'
    private final String password;
    private int gaji;
 
    public Karyawan(String email, String password, int gaji, String nama, String alamat) {
        super(nama, alamat);
        this.email = email;
        this.password = password;
        this.gaji = gaji;
    }
 
    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }
 
    public String getPassword() {
        return password;
    }
 
    public int getGaji() {
        return gaji;
    }
 
    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
    
    //override
    @Override
    public void show(){
        System.out.println("| Nama : " + this.nama);
        System.out.println("| Alamat : " + this.alamat);
        System.out.println("| Email Karyawan : " + this.email);
        System.out.println("| Gaji Karyawan  : " + this.gaji);
    }
  
    //overloading
    public void show(boolean showEmail){
        if (showEmail) show();
        System.out.println("| Nama : " + this.nama);
        System.out.println("| Alamat : " + this.alamat);
    }
    
 
}
