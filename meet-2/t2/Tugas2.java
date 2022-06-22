package tugas2;
public class Tugas2 {
    private int bolpoint, pensil, penghapus;
    private double totalHarga;
    
    public void setBolpoint(int bolpoint){
        this.bolpoint = bolpoint;
    }
    
    public int getBolpoint(){
        return bolpoint;
    }
    
    public void setPensil(int pensil){
        this.pensil = pensil;
    }
    
    public int getPensil(){
        return pensil;
    }
    
    public void setPenghapus(int penghapus){
        this.penghapus = penghapus;
    }
    
    public int getPenghapus(){
        return penghapus;
    }
    
    public void setTotalHarga(int bolpoint, int pensil, int penghapus){
        totalHarga = 10*(double)(bolpoint + pensil + penghapus);
    }
    
    public double getTotalHarga(){
        return totalHarga;
    }
    
}
