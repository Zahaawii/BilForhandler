import java.util.ArrayList;

public  class MercedesModeller {

    public static void MercedesBilModeller(){
        ArrayList<String> modeller = new ArrayList<>();

        modeller.add("1. A-class");
        modeller.add("2. B-Class");
        modeller.add("3. C-Class");

        for(String bilModeller : modeller)
            System.out.println(bilModeller);


    }
    public static void MercedesDisplayInfo(String prompt){
        System.out.println(prompt);
        System.out.println();
        MercedesBilModeller();
        System.out.println();
    }

    public static void aClassModel() {
        BilerIndstillinger aClassModel = new BilerIndstillinger("A-Class 1", "A-Class", "Sort", 0, "300 KM/T");
        aClassModel.BilIndstilligerDisplay();
        BilerIndstillinger aClassModel2 = new BilerIndstillinger("A-Class 2", "A-Class", "Grå", 0, "300 KM/T");
        aClassModel2.BilIndstilligerDisplay();
        BilerIndstillinger aClassModel3 = new BilerIndstillinger("A-Class 3", "A-Class", "Hvid", 0, "300 KM/T");
        aClassModel3.BilIndstilligerDisplay();

    }

    public static void bClassModel() {
        BilerIndstillinger bClassModel = new BilerIndstillinger("B-Class 1", "B-Class", "Sort", 0, "300 KM/T");
        bClassModel.BilIndstilligerDisplay();
        BilerIndstillinger bClassModel2 = new BilerIndstillinger("B-Class 2", "B-Class", "Grå", 0, "300 KM/T");
        bClassModel2.BilIndstilligerDisplay();
        BilerIndstillinger bClassModel3 = new BilerIndstillinger("B-Class 3", "B-Class", "Hvid", 0, "300 KM/T");
        bClassModel3.BilIndstilligerDisplay();

    }

    public static void cClassModel() {
        BilerIndstillinger cClassModel = new BilerIndstillinger("C-Class 1", "C-Class", "Sort", 0, "300 KM/T");
        cClassModel.BilIndstilligerDisplay();
        BilerIndstillinger cClassModel2 = new BilerIndstillinger("C-Class 2", "C-Class", "Grå", 0, "300 KM/T");
        cClassModel2.BilIndstilligerDisplay();
        BilerIndstillinger cClassModel3 = new BilerIndstillinger("C-Class 3", "C-Class", "Hvid", 0, "300 KM/T");
        cClassModel3.BilIndstilligerDisplay();

    }


}
