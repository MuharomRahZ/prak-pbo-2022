package tugasmodul4;
public class tugasModul4main {
    public static void main(String[] args) {
        TugasModul4 main = new TugasModul4();
        double[][] m1 = {
            {1,2},
            {3,5},
            {6,7}
        };
        System.out.println("Matriks A : ");
        main.setMatriks1(m1);
        //System.out.println(main.getMatriks1());
        main.tampil(main.getMatriks1());
        double[][] m2 = {
            {8,9},
            {10,11},
            {12,13}
        };
        System.out.println();
        System.out.println("Matriks B : ");
        main.setMatriks2(m2);
        //System.out.println(main.getMatriks2());
        main.tampil(main.getMatriks2());
        System.out.println();
        System.out.println("TUGAS NO.1");
        System.out.println("Hasil Penjumlahan Matriks A + Matriks B = Matriks C");
        System.out.println("Matriks C : ");
        main.setPenjumlahan(main.getMatriks1(), main.getMatriks2());
        main.tampil(main.getPenjumlahan());
        System.out.println();
        System.out.println("TUGAS NO.2");
        System.out.println("Hasil Perkalian Matriks C dengan 0.5 = ");
        double pengali = 0.5;
        main.setPerkalian(main.getPenjumlahan(), pengali);
        main.tampil(main.getPerkalian());
        //System.out.println(main.getPenjumlahan());
        //int[][] jumlah = main.getMatriks1() + main.getMatriks2();
    }
}
