package tugas6constructor;
public class ConstructorMahasiswa extends ConstructorUniversitas {
    private String jurusan;
    
    protected ConstructorMahasiswa(String nim, String jurusan){
        super(nim);
        this.jurusan = jurusan;
        
        nim = null;
        jurusan = null;
    }
    
    protected String getJurusan(){
        return jurusan;
    }
    
    protected void hapus(){
        jurusan = null;
        super.hapus();
    }
}
