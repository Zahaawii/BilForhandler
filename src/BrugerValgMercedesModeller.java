import java.util.Scanner;

public class BrugerValgMercedesModeller {
    static Scanner scanner = new Scanner(System.in);

    public static void BrugerValgForskelligeMercedesModeller() {

        int brugervalg;
        int aClass = 1;
        int bClass = 2;
        int cClass = 3;

        do {
            System.out.println("Tast 1, 2 eller 3 for at komme videre");
            try{
                brugervalg = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Du skal taste et tal");
                brugervalg = 0;
            }
        } while (brugervalg <= 0 || brugervalg >= 4);

        if(brugervalg == aClass) {
            BilerIndstillinger.BilIndstillingerDisplayIntro();
            MercedesModeller.aClassModel();
            NyeBilerModelValgt.NyeBilerModelValgtDisplay("A-Class model");
            TilføjEkstraTingTilBilen.EkstraTilføjelser("Du har nu valgt din bil. \nDu kan tilføje yderligere komponenter til din bil");
            TilføjEkstraTingTilBilen.EkstraTilføjelser("Kunne du tænke dig at tilføje flere komponenter end den ene?");
            return;
        }

        if(brugervalg == bClass){
            BilerIndstillinger.BilIndstillingerDisplayIntro();
            MercedesModeller.bClassModel();
            NyeBilerModelValgt.NyeBilerModelValgtDisplay("B-Class model");
            TilføjEkstraTingTilBilen.EkstraTilføjelser("Du har nu valgt din bil. \nDu kan tilføje yderligere komponenter til din bil");
            TilføjEkstraTingTilBilen.EkstraTilføjelser("Kunne du tænke dig at tilføje flere komponenter end den ene?");
            return;
        }

        if(brugervalg == cClass){
            BilerIndstillinger.BilIndstillingerDisplayIntro();
            MercedesModeller.cClassModel();
            NyeBilerModelValgt.NyeBilerModelValgtDisplay("C-Class model");
            TilføjEkstraTingTilBilen.EkstraTilføjelser("Du har nu valgt din bil. \nDu kan tilføje yderligere komponenter til din bil");
            TilføjEkstraTingTilBilen.EkstraTilføjelser("Kunne du tænke dig at tilføje flere komponenter end den ene?");
        }

    }
}
