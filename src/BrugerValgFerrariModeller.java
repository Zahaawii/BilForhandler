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
            NyeBilerModelValgt.NyeBilerModelValgtDisplay("Sport model");
            TilføjEkstraTingTilBilen.EkstraTilføjelser("Du har nu valgt din bil. \nDu kan tilføje yderligere komponenter til din bil");
            TilføjEkstraTingTilBilen.EkstraTilføjelser("Kunne du tænke dig at tilføje flere komponenter end den ene?");
            return;
        }

        if(brugervalg == Roma){
            BilerIndstillinger.BilIndstillingerDisplayIntro();
            FerrariModeller.romaModel();
            NyeBilerModelValgt.NyeBilerModelValgtDisplay("Roma model");
            TilføjEkstraTingTilBilen.EkstraTilføjelser("Du har nu valgt din bil. \nDu kan tilføje yderligere komponenter til din bil");
            TilføjEkstraTingTilBilen.EkstraTilføjelser("Kunne du tænke dig at tilføje flere komponenter end den ene?");
            return;
        }

        if(brugervalg == GTS){
            BilerIndstillinger.BilIndstillingerDisplayIntro();
            FerrariModeller.GTSmodel();
            NyeBilerModelValgt.NyeBilerModelValgtDisplay("GTS model");
            TilføjEkstraTingTilBilen.EkstraTilføjelser("Du har nu valgt din bil. \nDu kan tilføje yderligere komponenter til din bil");
            TilføjEkstraTingTilBilen.EkstraTilføjelser("Kunne du tænke dig at tilføje flere komponenter end den ene?");
        }

    }
}
