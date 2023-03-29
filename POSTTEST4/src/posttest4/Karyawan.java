
package posttest4;

public class Karyawan extends People{
    private String email, password;
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
 
    public void setPassword(String password) {
        this.password = password;
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
        super.show();
        System.out.println("| Email Karyawan : " + this.email);
        System.out.println("| Gaji Karyawan  : " + this.gaji);
    }
  
    //overloading
    public void show(boolean showEmail){
        if (showEmail) show();
        else super.show();
    }
    
 
}

