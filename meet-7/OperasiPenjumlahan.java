package tugas7polimorfis;
public class OperasiPenjumlahan extends OperasiBilangan{
    protected double a,b,c;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    public void tampil(){
        System.out.println("Hasil Penjumlahan nilai A,B,&C : ");
        System.out.println(OperasiPenjumlahan.this.getA()+OperasiPenjumlahan.this.getB()+OperasiPenjumlahan.this.getC());
    }
}
