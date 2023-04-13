package posttest6;

import java.io.IOException;
import java.util.Scanner;

public class Karyawan extends People{
    private String email; 
    //penerapan keyword final pada variable 'password'
    private final String password;
    private int gaji;
 
    Scanner input = new Scanner(System.in);
    
    Procedure item = new Procedure();
    public Karyawan(String email, String password, int gaji, String nama, String alamat) {
        super(email, password, nama, alamat);
        this.email = email;
        this.password = password;
        this.gaji = gaji;
  
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
   
    public void menu() throws IOException{
        try {
            boolean kondisi = false;
            while(kondisi){
                //owner
                System.out.println("\n|==============================================|");
                System.out.println("|                  MENU KARYAWAN               |");
                System.out.println("|==============================================|");
                System.out.println("| 1. Tambah Data Barang                        |");
                System.out.println("| 2. Tampil Data Barang                        |");
                System.out.println("| 3. Ubah Data Barang                          |");
                System.out.println("| 4. Hapus Data Barang                         |");
                System.out.println("| 5. Log Out                                   |");
                System.out.println("|==============================================|");
                System.out.print("\n>>> Silahkan Masukkan Pilihan Anda: ");
                int pilh = input.nextInt();
                switch(pilh){
                    case 1:
                        item.tambahBarang();
                        System.out.println("\n\n|==================================================|");
                        System.out.println("|             DATA BERHASIL DITAMBAHKAN            |");
                        System.out.println("|==================================================|");
                        System.out.println("\n\t>>> Silahkan tekan [ENTER] <<<");
                        new Scanner(System.in).nextLine();    
                        break;
                    case 2:
                        item.tampilBarang();
                        System.out.println("\n\t>>> Silahkan tekan [ENTER] <<<");
                        new Scanner(System.in).nextLine();   
                        break;
                    case 3:
                        item.ubahBarang();
                        System.out.println("\n\t>>> Silahkan tekan [ENTER] <<<");
                        new Scanner(System.in).nextLine(); 
                        break;
                    case 4:
                        item.hapusBarang();
                        System.out.println("\n\t>>> Silahkan tekan [ENTER] <<<");
                        new Scanner(System.in).nextLine();  
                        break;
                    case 5:
                        return;
                    default:
                        System.out.println("\n\n|==================================================|");
                        System.out.println("|                 INPUTAN ANDA SALAH               |");
                        System.out.println("|==================================================|");
                        System.out.println("\n\t>>> Silahkan tekan [ENTER] <<<");
                        new Scanner(System.in).nextLine();
                        break;
                }
            }
        }catch (NumberFormatException e){
            System.out.println(e);
        }
    }
}
