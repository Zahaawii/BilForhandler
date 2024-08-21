import java.util.Scanner;

public class LeasingAftalerMåneder {

    static Scanner scanner = new Scanner(System.in);

    public static void etÅrsLeasingAftale(String prompt, int brugerValg){
        System.out.println(prompt);
        System.out.println("tast et tal og enter for at fortsætte");
        brugerValg = scanner.nextInt();

        if(brugerValg == 1){
            FerrariModeller.sportsModel();
            FerrariModeller.romaModel();
            FerrariModeller.GTSmodel();
            System.out.println("Hvilken model ønsker du at vide prisen på?: \n1: Sport model \n2: Roma \n3: GTS");
            System.out.println("Skriv navnet på modellen");
            PrisOmregner.prisOmregnerFerrariEtÅr(null);

        }

        if(brugerValg == 2) {
            LamborghiniModeller.UrusModel();
            LamborghiniModeller.GTModel();
            LamborghiniModeller.RevueltoModel();
            System.out.println("Hvilken model ønsker du at vide prisen på?: \n1: Urus \n2: GT \n3: Revuelto");
            System.out.println("Skriv navnet på modellen");
            PrisOmregner.prisOmregnerLamborghiniEtÅr(null);
        }

        if(brugerValg == 3){
            PorscheModeller.cayenneModel();
            PorscheModeller.caymanModel();
            PorscheModeller.porscheModel();
            System.out.println("Hvilken model ønsker du at vide prisen på?: \n1: Cayenne \n2: Cayman \n3: Porsche 911");
            System.out.println("Skriv navnet på modellen");
            PrisOmregner.prisOmregnerPorscheEtÅr(null);
        }

    }

    public static void toÅrsLeasingAftale(String prompt, int brugerValg){
        System.out.println(prompt);
        brugerValg = scanner.nextInt();

        if(brugerValg == 1){
            FerrariModeller.sportsModel();
            FerrariModeller.romaModel();
            FerrariModeller.GTSmodel();
            System.out.println("Hvilken model ønsker du at vide prisen på?: \n1: Sport \n2: Roma \n3: GTS");
            System.out.println("Skriv navnet på modellen");
            PrisOmregner.prisOmregnerFerrariToÅr(null);

        }

        if(brugerValg == 2) {
            LamborghiniModeller.UrusModel();
            LamborghiniModeller.GTModel();
            LamborghiniModeller.RevueltoModel();
            System.out.println("Hvilken model ønsker du at vide prisen på?: \n1: Urus \n2: GT \n3: Revuelto");
            System.out.println("Skriv navnet på modellen");
            PrisOmregner.prisOmregnerLamborghiniToÅr(null);
        }

        if(brugerValg == 3){
            PorscheModeller.cayenneModel();
            PorscheModeller.caymanModel();
            PorscheModeller.porscheModel();
            System.out.println("Hvilken model ønsker du at vide prisen på?: \n1: Cayenne \n2: Cayman \n3: Porsche 911");
            System.out.println("Skriv navnet på modellen");
            PrisOmregner.prisOmregnerPorscheToÅr(null);
        }

    }

    public static void treÅrsLeasingAftale(String prompt, int brugerValg){
        System.out.println(prompt);
        brugerValg = scanner.nextInt();

        if(brugerValg == 1){
            FerrariModeller.sportsModel();
            FerrariModeller.romaModel();
            FerrariModeller.GTSmodel();
            System.out.println("Hvilken model ønsker du at vide prisen på?: \n1: Sport model \n2: Roma \n3: GTS");
            System.out.println("Skriv navnet på modellen");
            PrisOmregner.prisOmregnerFerrariTreÅr(null);

        }

        if(brugerValg == 2) {
            LamborghiniModeller.UrusModel();
            LamborghiniModeller.GTModel();
            LamborghiniModeller.RevueltoModel();
            System.out.println("Hvilken model ønsker du at vide prisen på?: \n1: Urus \n2: GT \n3: Revuelto");
            System.out.println("Skriv navnet på modellen");
            PrisOmregner.prisOmregnerLamborghiniTreÅr(null);
        }

        if(brugerValg == 3){
            PorscheModeller.cayenneModel();
            PorscheModeller.caymanModel();
            PorscheModeller.porscheModel();
            System.out.println("Hvilken model ønsker du at vide prisen på?: \n1: Cayenne \n2: Cayman \n3: Porsche 911");
            System.out.println("Skriv navnet på modellen");
            PrisOmregner.prisOmregnerPorscheTreÅr(null);
        }

    }
}
