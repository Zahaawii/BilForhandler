import java.util.Scanner;
import java.util.ArrayList;

public class BrugerValgBrugteBiler {

    private static ArrayList <String> brugteBilTilføjelser = new ArrayList<>();

    static String [] brugteBilModeller = {"", "1. Ferrari GTS", "2. Mercedes C-Class", "3. Fiat 500", "4. Volskwagen Touran"};
    static String [] brugteBilerTilføjelser = {"", "Surround sound", "Ekstra bass", "Massage i sæderne"};

    static Scanner scanner = new Scanner(System.in);

    public static void BruugteBilerDisplayInfo(String prompt){
        KonsolTing.printFordeler(30);
        System.out.println(prompt);
        KonsolTing.printFordeler(30);
    }

    public static void BrugteBilerTrykForAtGåVidere(){
        KonsolTing.trykForAtFortsætte();
        KonsolTing.rensKonsol();;
    }

    public static void brugteBilModeller(String tekst) {
        System.out.println(tekst);
        KonsolTing.printFordeler(30);

        for(int i = 0; i < brugteBilModeller.length; i++){
            System.out.println(brugteBilModeller[i]);
        }

        System.out.println();
        KonsolTing.printFordeler(30);

    }

    public static void brugerValgLeasingBil(String tekst2){
        int brugerBrugteBilerValg;
        System.out.println("Hvilken bil er du interesseret i at kigge på");

        KonsolTing.printFordeler(30);
        do {
            System.out.println(tekst2);
            try {
                brugerBrugteBilerValg = Integer.parseInt(scanner.next());
            } catch (Exception e){
                System.out.println("Du skal taste et tal!");
                brugerBrugteBilerValg = 0;
            }
        } while (brugerBrugteBilerValg <= 0 || brugerBrugteBilerValg >= 5);

        KonsolTing.printFordeler(30);
        System.out.println("Du har valgt: " + brugteBilModeller[brugerBrugteBilerValg]);
        KonsolTing.printFordeler(30);

        }

        public static void TilføjEkstraTilBil(){
        System.out.println("Kunne du tænke dig at tilføje ekstra komponenter til din bil");

        for(int i = 0; i < brugteBilerTilføjelser.length; i++){
            System.out.println(brugteBilerTilføjelser[i]);
        }

        System.out.println("Skriv komponenterne du ønsker");

        System.out.println("Du kan tilføje op til 4 komponenter");

            brugteBilTilføjelser.add(scanner.nextLine());
            brugteBilTilføjelser.add(scanner.nextLine());
            brugteBilTilføjelser.add(scanner.nextLine());
            brugteBilTilføjelser.add(scanner.nextLine());

            KonsolTing.printFordeler(30);
            System.out.println("Du har valgt følgende komponenter: ");
            for(String brugerValg :brugteBilTilføjelser) {
                System.out.println(brugerValg);
            }
            System.out.println();
            KonsolTing.printFordeler(30);
        }

        public static void endeligeBestilling() {
        KonsolTing.trykForAtFortsætte();
        KonsolTing.rensKonsol();
        KonsolTing.printFordeler(30);
        System.out.println("Tak for din ordre " + "\nDit ordrenummer er: " + OrdreNummer.OrdrenummerOprettet());
        KonsolTing.printFordeler(30);
        System.out.println("Din ordre består af:");
        //Mangler at finde ud af hvordan jeg får input til at stå her:
        KonsolTing.printFordeler(30);
        System.out.println("Bil valg her");

        /*

            mangler at fremvise hvilken bilmodel de har valgt...
            viser indtil videre kun hvilke komponenter den har valgt
        */

            for(String brugerValg :brugteBilTilføjelser) {
                System.out.println(brugerValg);
            }
        }
    }