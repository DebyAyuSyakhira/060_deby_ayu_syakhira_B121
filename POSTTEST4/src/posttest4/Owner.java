package posttest4;

public class Owner extends People{
    private String email, password;
 
    public Owner(String email, String password, String nama, String alamat) {
        super(nama,alamat);
        this.email = email;
        this.password = password;
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
}

