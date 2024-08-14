public class BilerIndstillinger {

    private String titel;
    private String model;
    private String farve;
    private int alder;
    private String hastighed;

    public BilerIndstillinger(String titel, String model, String farve, int alder, String hastighed) {
        this.titel = titel;
        this.model = model;
        this.farve = farve;
        this.alder = alder;
        this.hastighed = hastighed;
    }

    public static void BilIndstillingerDisplayIntro(){
        System.out.println();
        System.out.println("Vi har disse modeller på lager:");
    }

    public void BilIndstilligerDisplay(){
        System.out.println();
        System.out.println(titel);
        KonsolTing.printFordeler(30);
        System.out.println("Model: " + model + "\nfarve: " + farve + "\nalder: " + alder + "\nhastighed: " + hastighed);
        KonsolTing.printFordeler(30);
    }

    public String getTitel(){
        return titel;
    }

    public String getModel() {
        return model;
    }

    public String getFarve() {
        return farve;
    }

    public int getAlder() {
        return alder;
    }

    public String getHastighed() {
        return hastighed;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setFarve(String farve) {
        this.farve = farve;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }

    public void setHastighed(String hastighed) {
        this.hastighed = hastighed;
    }
}
