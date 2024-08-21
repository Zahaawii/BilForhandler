import java.util.Scanner;

public class LeasingAftaler {

    static Scanner scanner = new Scanner(System.in);

    private String navn;
    private String adresse;
    private int alder;
    int etÅr = 12;
    int toÅr = 24;
    int treÅr = 36;

    public String getNavn() {
        return navn;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getAlder() {
        return alder;
    }

    public void setNavn(String navn) {
        this.navn = navn;

    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;

    }

    public void setAlder(int alder) {
        this.alder = alder;

    }

    public static void LeasingAftalerDisplay(String prompt) {
        System.out.println(prompt);
        KonsolTing.printFordeler(30);
        KonsolTing.trykForAtFortsætte();
        KonsolTing.rensKonsol();
    }

    public void LeasingAftalerBrugerInformationer() {
        System.out.println("For at komme videre skal vi bruge følgende informationer: ");
        KonsolTing.printFordeler(30);
        System.out.println("Navn:");
        setNavn(scanner.next());
        KonsolTing.printFordeler(30);
        System.out.println("Alder");
        setAlder(scanner.nextInt());
        KonsolTing.printFordeler(30);
        System.out.println("Adresse:");
        setAdresse(scanner.next());

        if(this.getAlder() >= 18){
            System.out.println("Hej " + this.getNavn());
        } else {
            System.out.println("Du er ikke gammel nok til at lease en bil.");
            System.exit(30);
        }
    }

    public void valgMuligheder(String prompt, String prompt2){
        KonsolTing.printFordeler(30);
        System.out.println(prompt);
        System.out.println("Vi har: " + "\n1: " + etÅr + " måneder"+ "\n2: " + toÅr + " måneder " + "\n3: " + treÅr + " måneder");
        KonsolTing.printFordeler(30);
        System.out.println(prompt2);
        int brugerValgLeasingPeriode = scanner.nextInt();

        switch (brugerValgLeasingPeriode){
            case 1:
                System.out.println("Du har valgt at se vores 12 måneders leasing aftale");
                LeasingAftalerMåneder.etÅrsLeasingAftale("Du kan vælge følgende biler:", 1);
                break;

            case 2:
                System.out.println("Du har valgt at se vores 24 måneders leasing aftale");
                LeasingAftalerMåneder.toÅrsLeasingAftale("Du kan vælge følgende biler:", 1);
                break;

            case 3:
                System.out.println("Du har valgt at se vores 36 måneders leasing aftale");
                LeasingAftalerMåneder.treÅrsLeasingAftale("Du kan vælge følgende biler:", 1);
                break;

            default:
                System.out.println("Du har tastet et forkert valg. Du må starte forfra.");
                break;
        }

    }

}

