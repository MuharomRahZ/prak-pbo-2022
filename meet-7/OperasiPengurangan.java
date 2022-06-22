package tugas7polimorfis;
public class OperasiPengurangan extends OperasiBilangan{
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
        System.out.println("Hasil Pengurangan nilai A,B,&C : ");
        System.out.println(OperasiPengurangan.this.getA()-OperasiPengurangan.this.getB()-OperasiPengurangan.this.getC());
    }
}
