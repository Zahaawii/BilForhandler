import java.util.Scanner;

public class LeasingAftaler {

    static Scanner scanner = new Scanner(System.in);

    private String navn;
    private String adresse;
    private int alder;

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
            System.out.println("Du er ikke gammel nok til at lease en bil");
        }
    }

}

