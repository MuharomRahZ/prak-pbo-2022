package tugasmodul9;
final class KomputerCetak {
    private final void cetak(Komputer[] ob){
        System.out.println("");
        for(int i=0;i<ob.length;i++){
            ob[i].hidupkan_os();
            ob[i].klik_kanan();
            ob[i].klik_kiri();
            ob[i].tekan_enter();
            ob[i].cetak_data();
            ob[i].matikan_os();
            System.out.println("##########################");
        }
        ob = null;
    }
    
    public static void main (String[] args){
        //PC pc_cetak = new PC();
        Komputer[] ob = {
            new PC(),
            new Laptop(),
            new Netbook()
        };
        
        KomputerCetak abc = new KomputerCetak();
        abc.cetak(ob);
        
        ob = null;
        abc = null;
    }
}
