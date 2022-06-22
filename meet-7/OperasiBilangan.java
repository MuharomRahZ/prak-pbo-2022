package tugas7polimorfis;
public class OperasiBilangan {
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
    
    protected void tampil(){
        System.out.println("nilai a = "+OperasiBilangan.this.getA()+", nilai B = "+OperasiBilangan.this.getB()+", nilai C = "+OperasiBilangan.this.getC());
    }
}
