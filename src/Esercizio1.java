public class Esercizio1 {
    public static void main(String[] args) {

       int m = moltiplicazione(3,5);
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
