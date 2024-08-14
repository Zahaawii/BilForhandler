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
            return;
        }

        if(brugervalg == GT){
            BilerIndstillinger.BilIndstillingerDisplayIntro();
            LamborghiniModeller.GTModel();
            return;
        }

        if(brugervalg == Revuelto){
            BilerIndstillinger.BilIndstillingerDisplayIntro();
            LamborghiniModeller.RevueltoModel();
        }

    }
}
