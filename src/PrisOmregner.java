import java.util.Scanner;

public class PrisOmregner {

    static Scanner scanner = new Scanner(System.in);

    public static void prisOmregnerFerrariEtÅr(String brugerValg) {
        int leasingPeriode = 12;

        int ferrariModelEt = 1000000;
        int ferrariModelTo = 500000;
        int ferrariModelTre = 100000;

        KonsolTing.printFordeler(30);
        brugerValg = scanner.nextLine();

        if (brugerValg.equalsIgnoreCase("Sport")) {
            System.out.println("Bilen kommer til at koste: " + ferrariModelEt + ",-");
            System.out.println("Fordelt på 12 måneder er prisen: " + ferrariModelEt / leasingPeriode + ",-");
        }

        if (brugerValg.equalsIgnoreCase("Roma")) {
            System.out.println("Bilen kommer til at koste: " + ferrariModelTo + ",-");
            System.out.println("Fordelt på 12 måneder er prisen: " + ferrariModelTo / leasingPeriode + ",-");
        }
        if (brugerValg.equalsIgnoreCase("GTS")) {
            System.out.println("Bilen kommer til at koste: " + ferrariModelTre + ",-");
            System.out.println("Fordelt på 12 måneder er prisen: " + ferrariModelTre / leasingPeriode + ",-");
        }

    }

    public static void prisOmregnerLamborghiniEtÅr(String brugerValg) {
        int leasingPeriode = 12;

        int lamborginiModelEt = 1000000;
        int lamborginiModelTo = 500000;
        int lamborginiModelTre = 100000;

        KonsolTing.printFordeler(30);
        brugerValg = scanner.nextLine();

        if (brugerValg.equalsIgnoreCase("Urus")) {
            System.out.println("Bilen kommer til at koste: " + lamborginiModelEt + ",-");
            System.out.println("Fordelt på 12 måneder er prisen: " + lamborginiModelEt / leasingPeriode + ",-");
        }

        if (brugerValg.equalsIgnoreCase("GT")) {
            System.out.println("Bilen kommer til at koste: " + lamborginiModelTo + ",-");
            System.out.println("Fordelt på 12 måneder er prisen: " + lamborginiModelTo / leasingPeriode + ",-");
        }
        if (brugerValg.equalsIgnoreCase("Revuelto")) {
            System.out.println("Bilen kommer til at koste: " + lamborginiModelTre + ",-");
            System.out.println("Fordelt på 12 måneder er prisen: " + lamborginiModelTre / leasingPeriode + ",-");
        }
    }

    public static void prisOmregnerPorscheEtÅr(String brugerValg) {
        int leasingPeriode = 12;

        int porscheModelEt = 1000000;
        int porscheModelto = 500000;
        int porscheModeltre = 100000;

        KonsolTing.printFordeler(30);
        brugerValg = scanner.nextLine();

        if (brugerValg.equalsIgnoreCase("Cayenne")) {
            System.out.println("Bilen kommer til at koste: " + porscheModelEt + ",-");
            System.out.println("Fordelt på 12 måneder er prisen: " + porscheModelEt / leasingPeriode + ",-");
        }

        if (brugerValg.equalsIgnoreCase("Cayman")) {
            System.out.println("Bilen kommer til at koste: " + porscheModelto + ",-");
            System.out.println("Fordelt på 12 måneder er prisen: " + porscheModelto / leasingPeriode + ",-");
        }
        if (brugerValg.equalsIgnoreCase("Porsche 911")) {
            System.out.println("Bilen kommer til at koste: " + porscheModeltre + ",-");
            System.out.println("Fordelt på 12 måneder er prisen: " + porscheModeltre / leasingPeriode + ",-");
        }
    }

        public static void prisOmregnerFerrariToÅr(String brugerValg) {
            int leasingPeriode = 24;

            int ferrariModelEt = 1000000;
            int ferrariModelTo = 500000;
            int ferrariModelTre = 100000;

            KonsolTing.printFordeler(30);
            brugerValg = scanner.nextLine();

            if (brugerValg.equalsIgnoreCase("Sport")) {
                System.out.println("Bilen kommer til at koste: " + ferrariModelEt + ",-");
                System.out.println("Fordelt på 24 måneder er prisen: " + ferrariModelEt / leasingPeriode + ",-");
            }

            if (brugerValg.equalsIgnoreCase("Roma")) {
                System.out.println("Bilen kommer til at koste: " + ferrariModelTo + ",-");
                System.out.println("Fordelt på 24 måneder er prisen: " + ferrariModelTo / leasingPeriode + ",-");
            }
            if (brugerValg.equalsIgnoreCase("GTS")) {
                System.out.println("Bilen kommer til at koste: " + ferrariModelTre + ",-");
                System.out.println("Fordelt på 24 måneder er prisen: " + ferrariModelTre / leasingPeriode + ",-");
            }

        }

        public static void prisOmregnerLamborghiniToÅr(String brugerValg) {
            int leasingPeriode = 24;

            int lamborginiModelEt = 1000000;
            int lamborginiModelTo = 500000;
            int lamborginiModelTre = 100000;

            KonsolTing.printFordeler(30);
            brugerValg = scanner.nextLine();

            if (brugerValg.equalsIgnoreCase("Urus")) {
                System.out.println("Bilen kommer til at koste: " + lamborginiModelEt + ",-");
                System.out.println("Fordelt på 24 måneder er prisen: " + lamborginiModelEt / leasingPeriode + ",-");
            }

            if (brugerValg.equalsIgnoreCase("GT")) {
                System.out.println("Bilen kommer til at koste: " + lamborginiModelTo + ",-");
                System.out.println("Fordelt på 24 måneder er prisen: " + lamborginiModelTo / leasingPeriode + ",-");
            }
            if (brugerValg.equalsIgnoreCase("Revuelto")) {
                System.out.println("Bilen kommer til at koste: " + lamborginiModelTre + ",-");
                System.out.println("Fordelt på 24 måneder er prisen: " + lamborginiModelTre / leasingPeriode + ",-");
            }
        }

        public static void prisOmregnerPorscheToÅr(String brugerValg) {
            int leasingPeriode = 24;

            int porscheModelEt = 1000000;
            int porscheModelto = 500000;
            int porscheModeltre = 100000;

            KonsolTing.printFordeler(30);
            brugerValg = scanner.nextLine();

            if (brugerValg.equalsIgnoreCase("Cayenne")) {
                System.out.println("Bilen kommer til at koste: " + porscheModelEt + ",-");
                System.out.println("Fordelt på 24 måneder er prisen: " + porscheModelEt / leasingPeriode + ",-");
            }

            if (brugerValg.equalsIgnoreCase("Cayman")) {
                System.out.println("Bilen kommer til at koste: " + porscheModelto + ",-");
                System.out.println("Fordelt på 24 måneder er prisen: " + porscheModelto / leasingPeriode + ",-");
            }
            if (brugerValg.equalsIgnoreCase("Porsche 911")) {
                System.out.println("Bilen kommer til at koste: " + porscheModeltre + ",-");
                System.out.println("Fordelt på 24 måneder er prisen: " + porscheModeltre / leasingPeriode + ",-");
            }
        }
    public static void prisOmregnerFerrariTreÅr(String brugerValg) {
        int leasingPeriode = 36;

        int ferrariModelEt = 1000000;
        int ferrariModelTo = 500000;
        int ferrariModelTre = 100000;

        KonsolTing.printFordeler(30);
        brugerValg = scanner.nextLine();

        if (brugerValg.equalsIgnoreCase("Sport")) {
            System.out.println("Bilen kommer til at koste: " + ferrariModelEt + ",-");
            System.out.println("Fordelt på 36 måneder er prisen: " + ferrariModelEt / leasingPeriode + ",-");
        }

        if (brugerValg.equalsIgnoreCase("Roma")) {
            System.out.println("Bilen kommer til at koste: " + ferrariModelTo + ",-");
            System.out.println("Fordelt på 36 måneder er prisen: " + ferrariModelTo / leasingPeriode + ",-");
        }
        if (brugerValg.equalsIgnoreCase("GTS")) {
            System.out.println("Bilen kommer til at koste: " + ferrariModelTre + ",-");
            System.out.println("Fordelt på 36 måneder er prisen: " + ferrariModelTre / leasingPeriode + ",-");
        }

    }

    public static void prisOmregnerLamborghiniTreÅr(String brugerValg) {
        int leasingPeriode = 36;

        int lamborginiModelEt = 1000000;
        int lamborginiModelTo = 500000;
        int lamborginiModelTre = 100000;

        KonsolTing.printFordeler(30);
        brugerValg = scanner.nextLine();

        if (brugerValg.equalsIgnoreCase("Urus")) {
            System.out.println("Bilen kommer til at koste: " + lamborginiModelEt + ",-");
            System.out.println("Fordelt på 36 måneder er prisen: " + lamborginiModelEt / leasingPeriode + ",-");
        }

        if (brugerValg.equalsIgnoreCase("GT")) {
            System.out.println("Bilen kommer til at koste: " + lamborginiModelTo + ",-");
            System.out.println("Fordelt på 36 måneder er prisen: " + lamborginiModelTo / leasingPeriode + ",-");
        }
        if (brugerValg.equalsIgnoreCase("Revuelto")) {
            System.out.println("Bilen kommer til at koste: " + lamborginiModelTre + ",-");
            System.out.println("Fordelt på 36 måneder er prisen: " + lamborginiModelTre / leasingPeriode + ",-");
        }
    }

    public static void prisOmregnerPorscheTreÅr(String brugerValg) {
        int leasingPeriode = 36;

        int porscheModelEt = 1000000;
        int porscheModelto = 500000;
        int porscheModeltre = 100000;

        KonsolTing.printFordeler(30);
        brugerValg = scanner.nextLine();

        if (brugerValg.equalsIgnoreCase("Cayenne")) {
            System.out.println("Bilen kommer til at koste: " + porscheModelEt + ",-");
            System.out.println("Fordelt på 36 måneder er prisen: " + porscheModelEt / leasingPeriode + ",-");
        }

        if (brugerValg.equalsIgnoreCase("Cayman")) {
            System.out.println("Bilen kommer til at koste: " + porscheModelto + ",-");
            System.out.println("Fordelt på 36 måneder er prisen: " + porscheModelto / leasingPeriode + ",-");
        }
        if (brugerValg.equalsIgnoreCase("Porsche 911")) {
            System.out.println("Bilen kommer til at koste: " + porscheModeltre + ",-");
            System.out.println("Fordelt på 36 måneder er prisen: " + porscheModeltre / leasingPeriode + ",-");
        }
    }
}

