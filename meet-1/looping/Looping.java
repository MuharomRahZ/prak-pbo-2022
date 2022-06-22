package looping;
public class Looping {
    public static void main(String[] args) {
        int i = 0;
        int angka [] = {1,2,3,4,5};
        System.out.println("---FOR LOOPING---");
        for(int x : angka){
            System.out.print(x + " ");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("---WHILE LOOPING---");
        while(i <= 10){
            System.out.println("Perulangan ke + "+i);
            i++;
        }
        System.out.println("");
    }
    
}
