import java.util.Scanner;

public class KonsolTing {

    static Scanner scanner = new Scanner(System.in);

    public static void skærmInfo(String titel) {
        System.out.println(titel);
    }

    public static void rensKonsol(){
        for(int i = 0; i < 100; i++) {
            System.out.println();
        }
    }


    public static void printFordeler(int n) {
        for (int i = 0; i < n; i++)
            System.out.print("-");
            System.out.println();
    }

    public static void trykForAtFortsætte(){
        System.out.println("Tast enter for at fortsætte");
        scanner.next();
        rensKonsol();

    }

    public static void valgDisplay () {
        KonsolTing.printFordeler(30);
        System.out.println("Du har følgende valg:");
        System.out.println();
        System.out.println("Tast 1: For at se nye biler");
        System.out.println("Tast 2: For at se brugte biler");
        System.out.println("Tast 3: For at se leasing aftaler");
        System.out.println();
        KonsolTing.printFordeler(30);

    }

}
