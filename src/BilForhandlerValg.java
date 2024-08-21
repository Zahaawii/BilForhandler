import java.util.Scanner;

public class BilForhandlerValg {

    static Scanner scanner = new Scanner(System.in);
    static int nyeBiler = 1;
    static int brugteBiler = 2;
    static int leasingAftaler = 3;

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
            BrugerValgBrugteBiler.BruugteBilerDisplayInfo("Du har valgt at se på brugte biler");
            BrugerValgBrugteBiler.BrugteBilerTrykForAtGåVidere();
            BrugerValgBrugteBiler.brugteBilModeller("Vi har disse brugte biler på lager");
            BrugerValgBrugteBiler.brugerValgLeasingBil("Tast 1, 2, 3 eller 4 ");
            BrugerValgBrugteBiler.TilføjEkstraTilBil();
            BrugerValgBrugteBiler.endeligeBestilling();

            return;
        }
        if(brugerValg == leasingAftaler){
            LeasingAftaler.LeasingAftalerDisplay("Du har valgt at se på vores leasing aftaler");
            LeasingAftaler info = new LeasingAftaler();
            info.LeasingAftalerBrugerInformationer();
            info.valgMuligheder("Du kan vælge disse tre leasing aftaler", "indtast dit valg her");
        }

        }


    }


