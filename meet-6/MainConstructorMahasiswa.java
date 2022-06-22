package tugas6constructor;

import javax.swing.*;
import java.util.*;

public class MainConstructorMahasiswa {
    public static void main(String[] args) {
        String nim, nama, alamat, jurusan;
        
        String a = "";
        
        Scanner scan = new Scanner(System.in);
        
        do{
            System.out.println("============SILAKAN INPUT DATA DIRI MAHASISWA============");
            System.out.println("Keterangan NIM & Jurusan");
            System.out.println("61=Matematika, 62=Biologi, 63=Kimia, 64=Fisika,");
            System.out.println("65=Teknik Informatika, 66=Teknik Arsitektur");
            System.out.println("=========================================================");
            System.out.println("Masukkan NIM Mahasiswa : ");
            nim = scan.next();
            System.out.println("Masukkan Nama Mahasiswa : ");
            nama = scan.next();
            System.out.println("Masukkan Alamat Mahasiswa : ");
            alamat = scan.next();
            System.out.println("Masukkan Jurusan Mahasiswa : ");
            jurusan = scan.next();;
            
            System.out.println("===================DATA DIRI MAHASISWA===================");
            ConstructorUniversitas.setNama(nama);
            System.out.println("Nama Mahasiswa = "+ConstructorUniversitas.getNama());
            ConstructorMahasiswa ob = new ConstructorMahasiswa(nim,jurusan);
            ob.setNim(nim);
            ob.tampil("NIM Mahasiswa = "+ob.getNim());
            ConstructorUniversitas.setAlamat(alamat);
            System.out.println("Alamat Mahasiswa = "+ConstructorUniversitas.getAlamat());
            ob.tampil("Jurusan Mahasiswa = "+ob.getJurusan());
            System.out.println("=========================================================");
            
            
            System.out.println("Apakah Anda Ingin Menginput Data Mahasiswa Lagi?");
            System.out.println("Ketik 'Y' untuk melanjutkan. Ketik 'T' untuk berhenti.");
            a = scan.next();
        }while(a.equals("Y"));
    }
    
}
