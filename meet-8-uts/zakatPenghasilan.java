package ujiantengahsemester;
public class zakatPenghasilan extends superZakat {
    private double penghasilan;
    private double hargaEmas;

    public double getPenghasilan() {
        return penghasilan;
    }

    public void setPenghasilan(double penghasilan) {
        this.penghasilan = penghasilan;
    }

    public double getHargaEmas() {
        return hargaEmas;
    }

    public void setHargaEmas(double hargaEmas) {
        this.hargaEmas = hargaEmas;
    }
    
    public void setNisab(){
        this.nisab = (this.hargaEmas * 85) / 12;
    }
    
    public void setZakat(){
        this.zakat = this.penghasilan * 0.025;
    }
}
