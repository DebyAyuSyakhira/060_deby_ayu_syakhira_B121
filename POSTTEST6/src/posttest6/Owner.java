package posttest6;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Owner extends People implements UserOwner{
    Scanner x = new Scanner(System.in);
    InputStreamReader stream = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(stream);
    ArrayList<Karyawan> dataKaryawan = new ArrayList<>();
    private String email, password;

    
 
    public Owner(String email, String password, String nama, String alamat) {
        super(email, password, nama, alamat);
        this.email = email;
        this.password = password;
        dataKaryawan = new ArrayList<>();
    }

    public ArrayList<Karyawan> getDataKaryawan() {
        return dataKaryawan;
    }

    public void setDataKaryawan(ArrayList<Karyawan> dataKaryawan) {
        this.dataKaryawan = dataKaryawan;
    }

    @Override
    public void show() {
        System.out.println("| Nama : " + this.nama);
        System.out.println("| Alamat : " + this.alamat);
    }
    
    @Override
    public void tambahKaryawan(){
         try {
           System.out.print("\n-> Masukkan Nama Karyawan: ");
            String namaKaryawan = br.readLine();
            System.out.print("-> Masukkan E-mail Karyawan: ");
            String mail = br.readLine();
            System.out.print("-> Masukkan Alamat Karyawan: ");
            String alamatKaryawan = br.readLine();
            System.out.print("-> Masukkan Gaji Karyawan: ");
            int gaji = Integer.parseInt(br.readLine());
            Karyawan dataBaru;
            dataBaru = new Karyawan(mail, "123", gaji, namaKaryawan, alamatKaryawan);
            dataKaryawan.add(dataBaru);

            System.out.println("\n\n|==================================================|");
            System.out.println("|             DATA BERHASIL DITAMBAHKAN            |");
            System.out.println("|==================================================|");
            System.out.println("\n\t>>> Silahkan tekan [ENTER] <<<");
            new Scanner(System.in).nextLine();
        }catch (IOException | NumberFormatException e) {
            System.out.println(e);
        }
    }
    @Override
    public void tampilKaryawan(){
         if(dataKaryawan.isEmpty()){
            System.out.println("\n\n|==================================================|");
            System.out.println("|               DATA TIDAK DITEMUKAN               |");
            System.out.println("|==================================================|");
        }else{
            System.out.println("\n\n|==============================================|");
            System.out.println("|                  MENU OWNER                  |");
            System.out.println("|==============================================|");
            System.out.println("| 1. Tampil Data Karyawan (LENGKAP)            |");
            System.out.println("| 2. Tampil Data Karyawan (TANPA EMAIL & GAJI )|");
            System.out.println("|==============================================|");
            System.out.print("\n>>> Silahkan Masukkan Pilihan Anda: ");
            int pilih;
            pilih = x.nextInt();
            switch(pilih){
                case 1:
                    System.out.println("\n\n|==================================================|");
                    System.out.println("|                  DATA KARYAWAN                   |");
                    System.out.println("|==================================================|");
                    for (int i = 0; i < dataKaryawan.size(); i++) {  
                        dataKaryawan.get(i).show();
                        System.out.println("|==================================================|");
                    }
                    break;
                case 2:
                    System.out.println("\n\n|==================================================|");
                    System.out.println("|                  DATA KARYAWAN                   |");
                    System.out.println("|==================================================|");
                     for (int i = 0; i < dataKaryawan.size(); i++) {  
                        dataKaryawan.get(i).show(false);
                        System.out.println("|==================================================|");
                    }
                    break;
                default:
                    System.out.println("\n\n|==================================================|");
                    System.out.println("|                 INPUTAN ANDA SALAH               |");
                    System.out.println("|==================================================|");
            }     
        }
        System.out.println("\n\t>>> Silahkan tekan [ENTER] <<<");
        new Scanner(System.in).nextLine();
    }
    
    @Override
    public void ubahKaryawan(){
        try {
            if(dataKaryawan.isEmpty()){
                System.out.println("\n\n|==================================================|");
                System.out.println("|               DATA TIDAK DITEMUKAN               |");
                System.out.println("|==================================================|");
            }else{
                System.out.println("\n\n|==================================================|");
                System.out.println("|                  DATA KARYAWAN                   |");
                System.out.println("|==================================================|");
                for (int i = 0; i < dataKaryawan.size(); i++) {
                    System.out.println("|Data ke-" + (i + 1) + "   |");
                    System.out.println("|==================================================|");
                    System.out.println("1. Nama Karyawan       : " +dataKaryawan.get(i).getNama());
                    System.out.println("2. Alamat Karyawan     : " +dataKaryawan.get(i).getAlamat());
                    System.out.println("3. E-mail Karyawan     : " +dataKaryawan.get(i).getEmail());
                    System.out.println("4. Gaji Karyawan       : Rp. " +dataKaryawan.get(i).getGaji());
                    System.out.println("|==================================================|"); 
                }
                System.out.print("\nIngin Mengubah Data ke Berapa: ");
                int ind = Integer.parseInt(br.readLine());
                ind = ind-1;
                Karyawan edit = dataKaryawan.get(ind);
                if(dataKaryawan.size() <= ind){
                    System.out.println("\n\n|==================================================|");
                    System.out.println("|                 INPUTAN ANDA SALAH               |");
                    System.out.println("|==================================================|");
                }else{
                    System.out.println("\n\n|==============================================|");
                    System.out.println("|          MENU UPDATE DATA KARYAWAN           |");
                    System.out.println("|==============================================|");
                    System.out.println("| 1. Ubah Nama Karyawan                        |");
                    System.out.println("| 2. Ubah Alamat Karyawan                      |");
                    System.out.println("| 3. Ubah E-mail Karyawan                      |");
                    System.out.println("| 4. Ubah Gaji Karyawan                        |");
                    System.out.println("|==============================================|");
                    System.out.print("\nIngin Mengubah Data ke Berapa: ");
                    int plh = Integer.parseInt(br.readLine());
                    switch (plh){
                        case 1:
                            System.out.print("\n-> Masukkan Nama Karyawan: ");
                            edit.setNama(br.readLine());
                            break;
                        case 2:
                            System.out.print("\n-> Masukkan Alamat Karyawan: ");
                            edit.setAlamat(br.readLine());
                            break;
                        case 3:
                            System.out.print("\n-> Masukkan E-mail Karyawan: ");
                            edit.setEmail(br.readLine());
                            break;
                        case 4:
                            System.out.print("\n-> Masukkan Gaji Karyawan: ");
                            edit.setGaji(Integer.parseInt(br.readLine()));
                            break;
                        default:
                            System.out.println("\n\n|==================================================|");
                            System.out.println("|                 INPUTAN ANDA SALAH               |");
                            System.out.println("|==================================================|");
                            break;
                    }
                    System.out.println("\n\n|==================================================|");
                    System.out.println("|               DATA BERHASIL DIUBAH               |");
                    System.out.println("|==================================================|");
                }
            }
            System.out.println("\n\t>>> Silahkan tekan [ENTER] <<<");
            new Scanner(System.in).nextLine();
        }catch (IOException | NumberFormatException e) {
            System.out.println(e);
        }
    }
    
    @Override
    public void hapusDataKaryawan(){
       try {
            int ind;
            if(dataKaryawan.isEmpty()){
                System.out.println("\n\n|==================================================|");
                System.out.println("|               DATA TIDAK DITEMUKAN               |");
                System.out.println("|==================================================|");
            }else{
                System.out.println("\n\n|==================================================|");
                System.out.println("|                  DATA KARYAWAN                   |");
                System.out.println("|==================================================|");
                for (int i = 0; i < dataKaryawan.size(); i++) {
                    System.out.println("|Data ke-" + (i + 1) + "   |");
                    System.out.println("|==================================================|");
                    System.out.println("1. Nama Karyawan       : " +dataKaryawan.get(i).getNama());
                    System.out.println("2. Alamat Karyawan     : " +dataKaryawan.get(i).getAlamat());
                    System.out.println("3. E-mail Karyawan     : " +dataKaryawan.get(i).getEmail());
                    System.out.println("4. Gaji Karyawan       : Rp. " +dataKaryawan.get(i).getGaji());
                    System.out.println("|==================================================|");
                }
                System.out.print("\nIngin Menghapus Data ke Berapa: ");
                ind = Integer.parseInt(br.readLine());
                ind = ind-1;
                if(dataKaryawan.size() <= ind){
                    System.out.println("\n\n|==================================================|");
                    System.out.println("|                 INPUTAN ANDA SALAH               |");
                    System.out.println("|==================================================|");
                }else{
                    System.out.print("\nApakah Anda Yakin Ingin Menghapusnya(y/t)?  ");
                    String ans = br.readLine();
                    if(ans.equalsIgnoreCase("y")){
                        dataKaryawan.remove(ind);
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
                System.out.println("\n\t>>> Silahkan tekan [ENTER] <<<");
                new Scanner(System.in).nextLine();
            }
       }catch (IOException | NumberFormatException e) {
            System.out.println(e);
        }
    }

 
    @Override
    public void menu(){
        try {
            while(true){
                //owner
                System.out.println("\n\n|==============================================|");
                System.out.println("|                  MENU OWNER                  |");
                System.out.println("|==============================================|");
                System.out.println("|==============================================|");
                System.out.println("| 1. Tambah Data Karyawan                      |");
                System.out.println("| 2. Tampil Data Karyawan                      |");
                System.out.println("| 3. Ubah Data Karyawan                        |");
                System.out.println("| 4. Hapus Data Karyawan                       |");
                System.out.println("| 5. Log Out                                   |");
                System.out.println("|==============================================|");
                System.out.print("\n>>> Silahkan Masukkan Pilihan Anda: ");
                int pilh = x.nextInt();
                switch(pilh){
                    case 1:
                        this.tambahKaryawan();    
                        break;
                    case 2:
                        this.tampilKaryawan();    
                        break;
                    case 3:
                        this.ubahKaryawan();    
                        break;
                    case 4:
                        this.hapusDataKaryawan();    
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


