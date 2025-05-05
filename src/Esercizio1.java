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

        String[] original = { "a", "b", "c", "d", "e" };
        String nuova = "f";

        String[] result = changes(original, nuova);

        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println(result[2]);
        System.out.println(result[3]);
        System.out.println(result[4]);
        System.out.println(result[5]);


    }
    public static int moltiplicazione (int a , int b ){
        return a*b;
    }
    public static String concatenare (String testo, int numero){
        return testo + numero;
    }
    public static String[] changes (String[] array5, String nuova) {
        String[] array6 = new String[6];


        array6[0] = array5[0];
        array6[1] = array5[1];


        array6[2] = nuova;


        array6[3] = array5[2];
        array6[4] = array5[3];
        array6[5] = array5[4];

        return array6;
    }


}
