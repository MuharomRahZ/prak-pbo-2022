package nomor2;
public class nomor2main {
    public static void main(String[] args) {
        Nomor2 main = new Nomor2();
        int deret[] = {2,5,3,5,9,5};
        int deret2[] = {2,1,3,1,9,1};
        System.out.println("Deret : ");
        main.setDeret(deret);
        main.tampil(main.getderet());
        System.out.println("Deret Baru : ");
        main.setDeret(deret2);
        main.tampil(main.getderet());
        System.out.println("Hasil masing-masing nilai dalam deret dikalikan dengan 0.5 : ");
        main.kaliSetengah(deret2);
    }
}
