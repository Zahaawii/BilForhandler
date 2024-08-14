import java.util.Scanner;

public class NyeBilerModelValgt {

    static Scanner scanner = new Scanner(System.in);
    static int bilValg1 = 1;
    static int bilValg2 = 2;
    static int bilValg3 = 3;


    public static void NyeBilerModelValgtDisplay(String model){
    int brugerValg;

        do {
            System.out.println("Vælg tallet på den bil du ønsker at kigge på");
            try {
                brugerValg = Integer.parseInt(scanner.nextLine());

            } catch (Exception e) {
                System.out.println("Du skal vælge et tal mellem 1-3");
                brugerValg = 0;
            }
        } while (brugerValg <= 0 || brugerValg >= 4);

        System.out.println("Du har valgt modellen: " + model + " " + brugerValg);
        KonsolTing.trykForAtFortsætte();
        KonsolTing.rensKonsol();

    }

}
