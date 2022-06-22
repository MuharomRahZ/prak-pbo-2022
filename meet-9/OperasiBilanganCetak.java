package tugasmodul8;
public final class OperasiBilanganCetak {
    //private final String barang = "Laptop";
    private final void cetak(OperasiBilanganAbs[] ob){
        //System.out.println("Nama Barang : "+barang);
        System.out.println("");
        for(int i=0;i<ob.length;i++){
            ob[i].get_A();
            ob[i].get_B();
            ob[i].tampil();
            System.out.println("##########################");
        }
        ob = null;
    }
    
    public static void main (String[] args){
        //String pemilik = "Ahmad";
        OperasiBilanganAbs[] ob = {
            new OperasiPenjumlahan(6.5, 0.5),
            new OperasiPengurangan(6.5, 0.5),
            new OperasiPerkalian(6.5, 0.5),
            new OperasiPembagian(6.5, 0.5)
        };
        
        OperasiBilanganCetak abc = new OperasiBilanganCetak();
        abc.cetak(ob);
        
        ob = null;
        abc = null;
    }
}
