package tugas1;
public class Tugas1 {
    static void cetak(){
        System.out.println("I Love ");
}
    static void cetak2(int a){
        System.out.println("Nilai x: "+a);
    }
    static int kuadrat(int bil){
        return bil*bil;
    }
    static int penjumlahan(int bil_1, int bil_2){
        return bil_1 + bil_2;
    }
    public static void main(String[] args) {
        System.out.println("NOMOR 1");
        cetak();
        System.out.println("JAVA");
        System.out.println("--------------------");
        System.out.println("NOMOR 2");
        int x;
        for(x=0; x<3; x++){
            cetak2(x);
        }
        System.out.println("Nilai x terakhir: "+x);
        System.out.println("--------------------");
        System.out.println("NOMOR 3");
        int y = 5;
        System.out.println(y + " kuadrat adalah "+ kuadrat(y));
        System.out.println("--------------------");
        System.out.println("NOMOR 4");
        int z1 = 2;
        int z2 = 3;
        System.out.println(z1+" + "+z2+" = "+ penjumlahan(z1,z2));
    }
    
}
