import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci il primo numero:");
        int a = input.nextInt();
        System.out.println("Inserisci il secondo numero:");
        int b = input.nextInt();


       int m = moltiplicazione(a,b);
        System.out.println(m);

       String c = concatenare("Result -> ",m);
        System.out.println(c);
    }
    public static int moltiplicazione (int a , int b ){
        return a*b;
    }
    public static String concatenare (String testo, int numero){
        return testo + numero;
    }
    

}
