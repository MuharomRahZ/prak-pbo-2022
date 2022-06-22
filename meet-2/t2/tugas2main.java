package tugas2;
public class tugas2main {
    public static void main (String args[]){
        Tugas2 main = new Tugas2();
        main.setBolpoint(2000);
        main.setPensil(1000);
        main.setPenghapus(500);
        System.out.println("Harga 1 buah bolpoint : Rp"+main.getBolpoint());
        System.out.println("Harga 1 buah pensil : Rp"+main.getPensil());
        System.out.println("Harga 1 buah penghapus : Rp"+main.getPenghapus());
        main.setTotalHarga(main.getBolpoint(), main.getPensil(), main.getPenghapus());
        System.out.println("Total harga & uang yang diterima oleh penjual adalah sebesar Rp"+main.getTotalHarga());
    }
}
