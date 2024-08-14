import java.util.Scanner;

public class TilføjEkstraTingTilBilen {

    static Scanner scanner = new Scanner(System.in);
    static String [] nyeKomponenter = {"1. Surround Sound", "2. Varme i sæderne", "3. Massage i sæderne", "4. Apple CarPLay"};

    public static void EkstraTilføjelser(String prompt) {

        System.out.println(prompt);
        KonsolTing.printFordeler(30);

        for(int i = 0; i < nyeKomponenter.length; i++) {
            System.out.println(nyeKomponenter[i]);
            KonsolTing.printFordeler(30);
        }



        int brugerValg = scanner.nextInt();

        switch (brugerValg) {
            case 1:
                System.out.println("Du har tilføjet: Surround sound");
                KonsolTing.printFordeler(30);
                break;

            case 2:
                System.out.println("Du har tilføjet: Varme i sæderne");
                KonsolTing.printFordeler(30);
                break;

            case 3:
                System.out.println("Du har tilføjet: Massage i sæderne");
                KonsolTing.printFordeler(30);
                    break;

                case 4:
                    System.out.println("Du har tilføjet: Apple CarPlay");
                    KonsolTing.printFordeler(30);
                    break;

            default:
                System.out.println("Dit valg er ugyldigt. Du bliver nød til at starte forfra");
                KonsolTing.printFordeler(30);
                break;

        }
    }
}
