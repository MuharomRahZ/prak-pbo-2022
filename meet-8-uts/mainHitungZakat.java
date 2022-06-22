package ujiantengahsemester;
import javax.swing.*;

public class mainHitungZakat {
    public static void main(String[] args) {
        //double penghasilan,  pendapatan;
        //double hargaEmas, hargaBeras;
        String angka = JOptionPane.showInputDialog("Mau Bayar Zakat Mal Apa Hari Ini? Ketik 1 = Zakat Penghasilan, 2 = Zakat Pertanian");
        switch(angka){
            case "1":
                zakatPenghasilan zphasil = new zakatPenghasilan();
                String hargaEmas = JOptionPane.showInputDialog("Masukkan harga 1 gr emas hari ini");
                String penghasilan = JOptionPane.showInputDialog("Masukkan penghasilan anda per bulan");
                
                zphasil.setHargaEmas(Double.parseDouble(hargaEmas));
                zphasil.setPenghasilan(Double.parseDouble(penghasilan));
                zphasil.setNisab();
                
                System.out.println("=========KETENTUAN ZAKAT PENGHASILAN=========");
                System.out.println("Ketentuan harga 1 gr emas : Rp"+zphasil.getHargaEmas());
                System.out.println("Ketentuan nisab : Rp"+zphasil.getNisab());
                System.out.println("Besar penghasilan anda : Rp"+zphasil.getPenghasilan());
                System.out.println("Besar Zakat Penghasilan yang wajib anda bayarkan sebesar : ");
                
                zphasil.setZakat();
                if(zphasil.getPenghasilan() >= zphasil.getNisab()){
                    System.out.println("Rp"+zphasil.getZakat());
                }else{
                    System.out.println("Tidak ada. Mohon maaf anda belum wajib membayar zakat, karena anda belum memenuhi nisab.");
                }
                break;
            case "2":
                zakatPertanian zptani = new zakatPertanian();
                String hargaBeras = JOptionPane.showInputDialog("Masukkan harga 1 Kg beras hari ini");
                String pendapatan = JOptionPane.showInputDialog("Masukkan pendapatan hasil panen pertanian anda");
                
                zptani.setHargaBeras(Double.parseDouble(hargaBeras));
                zptani.setPendapatan(Double.parseDouble(pendapatan));
                zptani.setNisab();
                
                System.out.println("=========KETENTUAN ZAKAT PERTANIAN=========");
                System.out.println("Ketentuan harga 1 Kg beras : Rp"+zptani.getHargaBeras());
                System.out.println("Ketentuan nisab : Rp"+zptani.getNisab());
                System.out.println("Besar pendapatan hasil panen pertanian anda : Rp"+zptani.getPendapatan());
                System.out.println("Besar Zakat Pertanian yang wajib anda bayarkan sebesar : ");
                
                zptani.setZakat();
                if(zptani.getPendapatan() >= zptani.getNisab()){
                    System.out.println("Rp"+zptani.getZakat());
                }else{
                    System.out.println("Tidak ada. Mohon maaf anda belum wajib membayar zakat, karena anda belum memenuhi nisab.");
                }
                break;
        }
    }
    
}
