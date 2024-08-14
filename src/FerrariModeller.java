import java.util.ArrayList;


public  class FerrariModeller {

    public static void FerrariBilModeller() {
        ArrayList<String> modeller = new ArrayList<>();

        modeller.add("1. Sport");
        modeller.add("2. Roma");
        modeller.add("3. GTS");

        for (String bilModeller : modeller)
            System.out.println(bilModeller);


    }

    public static void FerrariDisplayInfo(String prompt) {
        System.out.println(prompt);
        System.out.println();
        FerrariBilModeller();
        System.out.println();
    }

    public static void romaModel() {
        BilerIndstillinger romaModel = new BilerIndstillinger("Roma 1", "Roma", "Rød", 0, "300 KM/T");
        romaModel.BilIndstilligerDisplay();
        BilerIndstillinger romaModel2 = new BilerIndstillinger("Roma 2", "Roma", "Sort", 0, "300 KM/T");
        romaModel2.BilIndstilligerDisplay();
        BilerIndstillinger romaModel3 = new BilerIndstillinger("Roma 3", "Roma", "Blå", 0, "300 KM/T");
        romaModel3.BilIndstilligerDisplay();

    }

    public static void sportsModel() {
        BilerIndstillinger sport = new BilerIndstillinger("Sport 1", "Sport", "Sort", 0, "250 KM/T");
        sport.BilIndstilligerDisplay();
        BilerIndstillinger sport1 = new BilerIndstillinger("Sport 2", "Sport", "Rød", 0, "250 KM/T");
        sport1.BilIndstilligerDisplay();
        BilerIndstillinger sport2 = new BilerIndstillinger("Sport 3", "Sport", "Blå", 0, "250 KM/T");
        sport2.BilIndstilligerDisplay();

    }

    public static void GTSmodel(){
        BilerIndstillinger GTSmodel = new BilerIndstillinger("GTS 1", "GTS", "Rød", 0, "280 KM/T");
        GTSmodel.BilIndstilligerDisplay();
        BilerIndstillinger GTSmodel2 = new BilerIndstillinger("GTS 2", "GTS", "Sort", 0, "280 KM/T");
        GTSmodel2.BilIndstilligerDisplay();
        BilerIndstillinger GTSmodel3 = new BilerIndstillinger("GTS 3", "GTS", "Blå", 0, "280 KM/T");
        GTSmodel3.BilIndstilligerDisplay();

    }

}

