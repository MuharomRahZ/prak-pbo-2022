package selection;
import java.util.Scanner;
public class Selection {
    public static void main(String[] args) {
        int a = 8;
        int b = 12;
        int c = a + b;
        //System.out.println("a = 8");
        //System.out.println("b = 12");
        //System.out.println("c = a + b");
        System.out.println("---SELECTION IF---");
        System.out.println("");
        if(c == a + b){
            System.out.println("TRUE");
        }
        System.out.println("");
        System.out.println("---SELECTION IF-ELSE---");
        System.out.println("");
        if(a > b){
            System.out.println("BENAR! Nilai a lebih besar dari b");
        }else{
            System.out.println("SALAH! Nilai b lebih besar dari a");
        }
        System.out.println("");
        System.out.println("---SELECTION IF-ELSE-IF---");
        System.out.println("");
        if(c < 20){
            System.out.println("Nilai c kurang dari 20");
        }else if(c > 20){
            System.out.println("Nilai c lebih dari 20");
        }else{
            System.out.println("Nilai c sama dengan 20");
        }
        System.out.println("");
        System.out.println("---SELECTION SWITCH---");
        Scanner masuk =new Scanner(System.in);
        System.out.println("Masukkan Pilihan: ");
        int insert = masuk.nextInt();
        switch(insert){
            case 1:
                System.out.println("Nilai a = "+a);
                break;
            case 2:
                System.out.println("Nilai b = "+b);
                break;
            case 3:
                System.out.println("Nilai c = "+c);
                break;
        }
        System.out.println("");
        
    }
    
}
