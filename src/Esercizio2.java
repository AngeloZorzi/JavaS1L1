import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci la frase/parola:");
        String a = input.nextLine();
        System.out.println("Un'altra:");
        String b = input.nextLine();
        System.out.println("Ultima giuro:");
        String c = input.nextLine();

        String normal = a+" "+b+" "+c;
        String dinnerbone = c+" "+a+" "+b;

        System.out.println(normal);
        System.out.println(dinnerbone);


    }
}
