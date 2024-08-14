import java.util.Scanner;

public class BrugerValgPorscheModeller {

    static Scanner scanner = new Scanner(System.in);

    public static void BrugerValgForskelligePorscheModeller() {

        int brugervalg;
        int porsche911 = 1;
        int cayman = 2;
        int cayenne = 3;

        do {
            System.out.println("Tast 1, 2 eller 3 for at komme videre");
            try{
                brugervalg = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Du skal taste et tal");
                brugervalg = 0;
            }
        } while (brugervalg <= 0 || brugervalg >= 4);

        if(brugervalg == porsche911) {
            BilerIndstillinger.BilIndstillingerDisplayIntro();
            PorscheModeller.porscheModel();
            NyeBilerModelValgt.NyeBilerModelValgtDisplay("Porsche 911 model");
            TilføjEkstraTingTilBilen.EkstraTilføjelser("Du har nu valgt din bil. \nDu kan tilføje yderligere komponenter til din bil");
            TilføjEkstraTingTilBilen.EkstraTilføjelser("Kunne du tænke dig at tilføje flere komponenter end den ene?");
            return;
        }

        if(brugervalg == cayman){
            BilerIndstillinger.BilIndstillingerDisplayIntro();
            PorscheModeller.caymanModel();
            NyeBilerModelValgt.NyeBilerModelValgtDisplay("Cayman model");
            TilføjEkstraTingTilBilen.EkstraTilføjelser("Du har nu valgt din bil. \nDu kan tilføje yderligere komponenter til din bil");
            TilføjEkstraTingTilBilen.EkstraTilføjelser("Kunne du tænke dig at tilføje flere komponenter end den ene?");
            return;
        }

        if(brugervalg == cayenne){
            BilerIndstillinger.BilIndstillingerDisplayIntro();
            PorscheModeller.cayenneModel();
            NyeBilerModelValgt.NyeBilerModelValgtDisplay("Cayenne model");
            TilføjEkstraTingTilBilen.EkstraTilføjelser("Du har nu valgt din bil. \nDu kan tilføje yderligere komponenter til din bil");
            TilføjEkstraTingTilBilen.EkstraTilføjelser("Kunne du tænke dig at tilføje flere komponenter end den ene?");
        }

    }
}
