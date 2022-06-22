package tugas6constructor;
public class ConstructorUniversitas {
    private String nim;
    private static String nama;
    private static String alamat;
    
    protected ConstructorUniversitas(){
        nim = null;
    }
    
    protected ConstructorUniversitas(String nim){
        this.nim = nim;
        nim = null;
    }
    
    protected void setNim(String nim){
        this.nim = nim;
    }
    
    protected String getNim(){
        return nim;
    }
    
    protected static void setNama(String nama){
        ConstructorUniversitas.nama = nama;
    }
    
    protected static String getNama(){
        return ConstructorUniversitas.nama;
    }
    
    protected static void setAlamat(String alamat){
        ConstructorUniversitas.alamat = alamat;
    }
    
    protected static String getAlamat(){
        return ConstructorUniversitas.alamat;
    }
    
    protected void tampil(String a){
        System.out.println(a);
        a = null;
    }
    
    protected void hapus(){
        nim = null;
        nama = null;
        alamat = null;
    }
}
