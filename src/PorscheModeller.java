import java.util.ArrayList;

public  class PorscheModeller {

    public static void PorscheBilModeller(){
        ArrayList<String> modeller = new ArrayList<>();

        modeller.add("1. Porsche 911");
        modeller.add("2. Cayman");
        modeller.add("3. Cayenne");

        for(String bilModeller : modeller)
            System.out.println(bilModeller);


    }
    public static void PorscheDisplayInfo(String prompt){
        System.out.println(prompt);
        System.out.println();
        PorscheBilModeller();
        System.out.println();
    }

    public static void cayenneModel () {
        BilerIndstillinger cayenneodel = new BilerIndstillinger("Cayenne 1", "Cayenne", "Sort",0, "250 KM/T");
        cayenneodel.BilIndstilligerDisplay();
        BilerIndstillinger cayenneodel2 = new BilerIndstillinger("Cayenne 2", "Cayenne", "Sølv",0, "250 KM/T");
        cayenneodel2.BilIndstilligerDisplay();
        BilerIndstillinger cayenneodel3 = new BilerIndstillinger("Cayenne 3", "Cayenne", "Grøn",0, "250 KM/T");
        cayenneodel3.BilIndstilligerDisplay();

    }

    public static void caymanModel () {
        BilerIndstillinger caymanModel = new BilerIndstillinger("Cayman 1", "Cayman", "Sort",0, "250 KM/T");
        caymanModel.BilIndstilligerDisplay();
        BilerIndstillinger caymanModel2 = new BilerIndstillinger("Cayman 2", "Cayman", "Sølv",0, "250 KM/T");
        caymanModel2.BilIndstilligerDisplay();
        BilerIndstillinger caymanModel3 = new BilerIndstillinger("Cayman 3", "Cayman", "Grøn",0, "250 KM/T");
        caymanModel3.BilIndstilligerDisplay();

    }

    public static void porscheModel () {
        BilerIndstillinger porscheModel = new BilerIndstillinger("Porsche 911 1", "Porsche 911", "Sort",0, "250 KM/T");
        porscheModel.BilIndstilligerDisplay();
        BilerIndstillinger porscheModel2 = new BilerIndstillinger("Porsche 911 2", "Porsche 911", "Sølv",0, "250 KM/T");
        porscheModel2.BilIndstilligerDisplay();
        BilerIndstillinger porscheModel3 = new BilerIndstillinger("Porsche 911 3", "Porsche 911", "Grøn",0, "250 KM/T");
        porscheModel3.BilIndstilligerDisplay();

    }


}
