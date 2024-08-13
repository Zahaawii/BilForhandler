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
    public static void FerrariDisplayInfo(String prompt){
        System.out.println(prompt);
        System.out.println();
        MercedesBilModeller();
        System.out.println();
    }
}
