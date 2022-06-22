package tugasmodul8;
public class OperasiPengurangan extends OperasiBilanganAbs{
    
    OperasiPengurangan(double a, double b){
        set_A(a);
        set_B(b);
    }
    
    protected void set_A(double a) {
        this.a = a;
        
    }

    protected double get_A() {
        return this.a;
    }

    protected void set_B(double b) {
        this.b = b;
    }

    protected double get_B() {
        return this.b;
    }

    protected void set_C() {
        c = 0;
    }

    protected double get_C() {
        return this.c;
    }

    protected void tampil() {
        System.out.println("Hasil Pengurangan nilai A & B : "+(get_A() - get_B()));
    }
    
}
