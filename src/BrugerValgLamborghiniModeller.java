import java.util.Scanner;

public class BrugerValgLamborghiniModeller {

    static Scanner scanner = new Scanner(System.in);

    public static void BrugerValgForskelligeLamborghiniModeller() {

        int brugervalg;
        int urus = 1;
        int GT = 2;
        int Revuelto = 3;

        do {
            System.out.println("Tast 1, 2 eller 3 for at komme videre");
            try{
                brugervalg = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Du skal taste et tal");
                brugervalg = 0;
            }
        } while (brugervalg <= 0 || brugervalg >= 4);

        if(brugervalg == urus) {
            BilerIndstillinger.BilIndstillingerDisplayIntro();
            LamborghiniModeller.UrusModel();
            NyeBilerModelValgt.NyeBilerModelValgtDisplay("Urus model");
            TilføjEkstraTingTilBilen.EkstraTilføjelser("Du har nu valgt din bil. \nDu kan tilføje yderligere komponenter til din bil");
            TilføjEkstraTingTilBilen.EkstraTilføjelser("Kunne du tænke dig at tilføje flere komponenter end den ene?");
            return;
        }

        if(brugervalg == GT){
            BilerIndstillinger.BilIndstillingerDisplayIntro();
            LamborghiniModeller.GTModel();
            NyeBilerModelValgt.NyeBilerModelValgtDisplay("GT model");
            TilføjEkstraTingTilBilen.EkstraTilføjelser("Du har nu valgt din bil. \nDu kan tilføje yderligere komponenter til din bil");
            TilføjEkstraTingTilBilen.EkstraTilføjelser("Kunne du tænke dig at tilføje flere komponenter end den ene?");
            return;
        }

        if(brugervalg == Revuelto){
            BilerIndstillinger.BilIndstillingerDisplayIntro();
            LamborghiniModeller.RevueltoModel();
            NyeBilerModelValgt.NyeBilerModelValgtDisplay("Revuelto model");
            TilføjEkstraTingTilBilen.EkstraTilføjelser("Du har nu valgt din bil. \nDu kan tilføje yderligere komponenter til din bil");
            TilføjEkstraTingTilBilen.EkstraTilføjelser("Kunne du tænke dig at tilføje flere komponenter end den ene?");
        }

    }
}
