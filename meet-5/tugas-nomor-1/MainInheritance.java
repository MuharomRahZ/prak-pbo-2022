package MainInheritance;
import javax.swing.*;

public class MainInheritance {
    public static void main(String[] args) {
        String r;
        
        r = JOptionPane.showInputDialog("Masukkan panjang jari-jari lingkaran (cm): ");
        
        Lingkaran li = new Lingkaran();
        
        li.setNamaClass("lingkaran");
        
        li.setR(Double.parseDouble(r));
        li.setHitungKeliling();
        li.setHitungLuas();
        
        System.out.println("Panjang Jari-Jari "+li.getNamaClass()+" = "+li.getR()+" cm");
        System.out.println("Keliling "+li.getNamaClass()+" = "+li.getKeliling()+" cm");
        System.out.println("Luas "+li.getNamaClass()+" = "+li.getLuas()+" cm");
        
        //String panjang, lebar;
        
        
        //panjang = JOptionPane.showInputDialog("Masukkan panjang persegi panjang (cm): ");
        //lebar = JOptionPane.showInputDialog("Masukkan lebar persegi panjang (cm): ");
        
        //PersegiPanjang pe = new PersegiPanjang();
        
        
        //pe.setNamaClass("persegi panjang");
        
        //pe.setPanjang(Double.parseDouble(panjang));
        //pe.setLebar(Double.parseDouble(lebar));
        //pe.setHitungKeliling();
        //pe.setHitungLuas();
        
        //System.out.println("Panjang "+pe.getNamaClass()+" = "+pe.getPanjang()+" cm");
        //System.out.println("Lebar "+pe.getNamaClass()+" = "+pe.getLebar()+" cm");
        //System.out.println("Keliling "+pe.getNamaClass()+" = "+pe.getKeliling()+" cm");
        //System.out.println("Luas "+pe.getNamaClass()+" = "+pe.getLuas()+" cm2");
    }
    
}
