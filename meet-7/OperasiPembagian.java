package tugas7polimorfis;
public class OperasiPembagian extends OperasiBilangan{
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
        System.out.println("Hasil Pembagian nilai A,B,&C : ");
        System.out.println(OperasiPembagian.this.getA()/OperasiPembagian.this.getB()/OperasiPembagian.this.getC());
    }
}
