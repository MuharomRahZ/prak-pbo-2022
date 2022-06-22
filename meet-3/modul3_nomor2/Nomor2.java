package nomor2;
public class Nomor2 {
    private int[] deret;
    
    public void setDeret(int[] deret){
        this.deret = deret;
        deret = null;
    }
    
    public int[] getderet(){
        return deret;
    }
    
    public void kaliSetengah(int[] deret){
        String data = "";
        for(int i = 0; i < deret.length; i++){
            if(i == 0){
                data += deret[i]*0.5;
            }else{
                data += ", " + deret[i]*0.5;
            }
        }
        System.out.println(data);
        deret = null;
        data = null;
    }
    
    
    public void tampil(int a){
        System.out.println(a);
    }
    
    public void tampil(int a[]){
        String data = "";
        for(int i = 0; i < a.length; i++){
            if(i == 0){
                data += a[i];
            }else{
                data += ", " + a[i];
            }
        }
        System.out.println(data);
        a = null;
        data = null;
    }
    
}
