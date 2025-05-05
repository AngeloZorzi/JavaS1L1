import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Abbiamo un rettangolo, dammi il primo lato:");
        int a = input.nextInt();
        System.out.println("Ora dammi l'altro lato:");
        int b = input.nextInt();

        System.out.println("Il perimetro è -> " + perimetro(a,b));

        System.out.println("Ora dammi un numero:");
        int c = input.nextInt();
        int ver = verify(c);


        System.out.println("Il risultato -> " + ver);

        System.out.println("Abbiamo un triangolo ora, dammi il primo lato:");
        double x = input.nextDouble();
        System.out.println("Il secondo:");
        double y = input.nextDouble();
        System.out.println("Ora il terzo");
        double z = input.nextDouble();

        double area = erone(x, y, z);

        System.out.println("Per la formula di Erone, area = " + area);


    }
    public static int perimetro (int a ,int b){
        return (a+b)*2;
    }
    public static int verify (int c){
        if(c % 2==0){
            return 0;
        } else {return 1;}
    };
    public static double erone(double x, double y, double z){
        double p = (x + y + z)/2.0;
        return Math.sqrt(p*(p-x)*(p-y)*(p-z));
    }
}
