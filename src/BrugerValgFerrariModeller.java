import java.util.Scanner;

public class BrugerValgFerrariModeller {

    static Scanner scanner = new Scanner(System.in);

    public static void BrugerValgForskelligeFerrariModeller() {

        int brugervalg;
        int sport = 1;
        int Roma = 2;
        int GTS = 3;

        do {
            System.out.println("Tast 1, 2 eller 3 for at komme videre");
            try{
                brugervalg = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Du skal taste et tal");
                brugervalg = 0;
            }
        } while (brugervalg <= 0 || brugervalg >= 4);

        if(brugervalg == sport) {
            BilerIndstillinger.BilIndstillingerDisplayIntro();
            FerrariModeller.sportsModel();
            return;
        }

        if(brugervalg == Roma){
            BilerIndstillinger.BilIndstillingerDisplayIntro();
            FerrariModeller.romaModel();
            return;
        }

        if(brugervalg == GTS){
            BilerIndstillinger.BilIndstillingerDisplayIntro();
            FerrariModeller.GTSmodel();
        }

    }
}
