package tugasinheritance2;
public class Karyawan {
    private String namaClass, namaKaryawan, kotaAsal;
    public int masaTugas, jumlahAnak, bonus, tunjangan;
    
    public void setNamaClass(String kelas){
        this.namaClass = kelas;
    }
    
    public String getNamaClass(){
        return namaClass;
    }
    
    public void setNamaKaryawan(String karyawan){
        this.namaKaryawan = karyawan;
    }
    
    public String getNamaKaryawan(){
        return namaKaryawan;
    }
    
    public void setKotaAsal(String kota){
        this.kotaAsal = kota;
    }
    
    public String getKotaAsal(){
        return kotaAsal;
    }
    
    public void setMasaTugas(int masa){
        this.masaTugas = masa;
    }
    
    public int getMasaTugas(){
        return masaTugas;
    }
    
    public void setJumlahAnak(int anak){
        this.jumlahAnak = anak;
    }
    
    
    public int getJumlahAnak(){
        return jumlahAnak;
    }
    
    public void setBonus(){
        this.bonus = 0;
    }
    
    public int getBonus(){
        return bonus;
    }
    
    public void setTunjangan(){
        this.tunjangan = 0;
    }
    
    public int getTunjangan(){
        return tunjangan;
    }
    
    
}
