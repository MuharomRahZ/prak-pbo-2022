package nomor1;
public class nomor1main {
    public static void main(String[] args) {
        Nomor1 main = new Nomor1();
        int deret[] = {-5,-3,-6,-3,-4};
        System.out.println("Deret : ");
        main.setDeret(deret);
        main.tampil(main.getderet());
        System.out.println("Hasil penjumlahan Deret : ");
        main.setPenjumlahan(deret);
        main.tampil(main.getPenjumlahan());
        System.out.println("Hasil rata-rata Deret : ");
        main.setRata(deret);
        main.tampil(main.getRata());
        main.minMax(deret);
    }
}
