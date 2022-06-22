package tugas7polimorfis;
public class OperasiBilanganCetak extends OperasiBilangan{
    
    private void cetakSemua(OperasiBilangan[] obj){
        for(int i = 0; i<obj.length; i++){
            obj[i].setA(a);
            obj[i].getA();
            obj[i].setB(b);
            obj[i].getB();
            obj[i].setC(c);
            obj[i].getC();
            obj[i].tampil();
            System.out.println("===========================");
        }
    }
    
    public static void main(String[] args) {
        OperasiBilangan[] obj = {
            new OperasiPenjumlahan(),
            new OperasiPengurangan(),
            new OperasiPerkalian(),
            new OperasiPembagian()
        };
        
        OperasiBilanganCetak cetak = new OperasiBilanganCetak();
        
        cetak.setA(150);
        cetak.getA();
        cetak.setB(50);
        cetak.getB();
        cetak.setC(5);
        cetak.getC();
        cetak.tampil();
        System.out.println("===========================");
        
        cetak.cetakSemua(obj);
    }
    
}
