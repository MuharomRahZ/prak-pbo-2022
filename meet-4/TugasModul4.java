package tugasmodul4;
public class TugasModul4 {
    private double[][] data, matriks1, matriks2, hasilj, hasil;
    //private double[][] hasil;
    
    public void setMatriks1(double[][] matriks1){
        this.matriks1 = matriks1;
        matriks1 = null;
    }
    
    public double[][] getMatriks1(){
        return matriks1;
    }
    
    public void setMatriks2(double[][] matriks2){
        this.matriks2 = matriks2;
        matriks2 = null;
    }
    
    public double[][] getMatriks2(){
        return matriks2;
    }
    
    public void setPenjumlahan(double[][] matriks1, double[][] matriks2){
        hasilj= matriks1;
        int i,j;
        for(i=0; i<matriks1.length;i++){
            for(j=0; j<matriks1[i].length;j++){
                hasilj[i][j] = matriks1[i][j] + matriks2[i][j];
            }
        }
        matriks1 = null;
    }
    
    public double[][] getPenjumlahan(){
        return hasilj;
    }
    
    public void setPerkalian(double[][] data, double a){
        hasil = data;
        int i,j;
        for(i=0; i<data.length; i++){
            for(j=0; j<data[i].length; j++){
                hasil[i][j] = data[i][j] * a;
            }
        }
    }
    
    
    public double[][] getPerkalian(){
        return hasil;
    }
    
    public void tampil(double data[][]){
        int i,j;
        for(i=0; i<data.length; i++){
            for(j=0;j<data[i].length;j++){
                System.out.print(data[i][j]+"  ");
            }
            System.out.println();
        }
        data=null;
    }
    
}
