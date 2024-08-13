import java.util.Scanner;

public class BilForhandlerValg {

    static Scanner scanner = new Scanner(System.in);
    static int nyeBiler = 1;
    static int brugteBiler = 2;

    public static void BrugerBeslutning(int valg) {
        int brugerValg;

        do{
            System.out.println("Tast 1, 2 eller 3");
            try {
                brugerValg = Integer.parseInt(scanner.next());
                } catch (Exception e) {
                System.out.println("Vælg et tal mellem 1-3");
                brugerValg = 0;
            }
            } while (brugerValg <= 0 || brugerValg >= valg);


        if(brugerValg == nyeBiler){
            NyeBiler.NyeBilerDisplay("Du har valgt nye biler");
            NyeBiler.NyeBilerModeller("Hvilke bilmærke kunne du tænke dig at kigge på?:", 5);

            return;
        }
        if(brugerValg == brugteBiler){
            System.out.println("Du har valgt brugte biler");
            return;
        }

        }


    }


