package tugasinheritance2;

import javax.swing.*;

public class MainPerhitungan {
    public static void main(String[] args) {
        String namaKaryawan, kotaAsal, masaTugas, jumlahAnak;
        
        namaKaryawan = JOptionPane.showInputDialog("Masukkan nama karyawan PT.ABC : ");
        kotaAsal = JOptionPane.showInputDialog("Masukkan kota asal karyawan PT.ABC : ");
        masaTugas = JOptionPane.showInputDialog("Masukkan masa tugas karyawan PT.ABC (dalam bulan) : ");
        jumlahAnak = JOptionPane.showInputDialog("Masukkan jumlah anak karyawan PT.ABC : ");
        
        BagianMarketing bm = new BagianMarketing();
        
        bm.setNamaClass("karyawan PT.ABC bagian marketing");
        bm.setNamaKaryawan(namaKaryawan);
        bm.setKotaAsal(kotaAsal);
        bm.setMasaTugas(Integer.parseInt(masaTugas));
        bm.setJumlahAnak(Integer.parseInt(jumlahAnak));
        
        System.out.println("RECORD DATA KARYAWAN PT.ABC");
        System.out.println("===========================");
        System.out.println("Nama Karyawan = "+bm.getNamaKaryawan());
        System.out.println("Kota Asal Karyawan = "+bm.getKotaAsal());
        System.out.println("Total Gaji Karyawan = Rp"+bm.getBonus());
        System.out.println("Total Tunjangan Karyawan = Rp"+bm.getTunjangan());
        //System.out.println(bm.getNamaKaryawan()+" merupakan "+bm.getNamaClass());
        
    }
    
}
