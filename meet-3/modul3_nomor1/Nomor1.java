package nomor1;
public class Nomor1 {
    private int[] deret;
    private int hasilPenjumlahan;
    private int hasilRata;
    
    public void setDeret(int[] deret){
        this.deret = deret;
        deret = null;
    }
    
    public int[] getderet(){
        return deret;
    }
    
    public void setPenjumlahan(int[] deret){
        hasilPenjumlahan = 0;
        for(int i = 0; i<deret.length; i++){
            hasilPenjumlahan += deret[i];
        }
        deret = null;
    }
    
    public int getPenjumlahan(){
        return hasilPenjumlahan;
    }
    
    public void setRata(int[] deret){
        hasilRata = hasilPenjumlahan/deret.length;
    }
    
    public int getRata(){
        return hasilRata;
    }
    
    public void minMax(int[] deret){
        int max = deret[0];
        int min = deret[0];
        for(int i = 0; i<deret.length; i++){
            if(deret[i]>max){
                max = deret[i];
            }else if(deret[i]<min){
                min = deret[i];
            }
        }
        System.out.println("nilai max = "+max);
        System.out.println("nilai min = "+min);
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
