package ujiantengahsemester;
public class zakatPertanian extends superZakat{
    private double pendapatan;
    private double hargaBeras;

    public double getPendapatan() {
        return pendapatan;
    }

    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    public double getHargaBeras() {
        return hargaBeras;
    }

    public void setHargaBeras(double hargaBeras) {
        this.hargaBeras = hargaBeras;
    }
    
    public void setNisab(){
        this.nisab = this.hargaBeras * 520;
    }
    
    public void setZakat(){
        this.zakat = this.pendapatan * 0.1;
    }
}
