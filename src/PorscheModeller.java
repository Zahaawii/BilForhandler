import java.util.ArrayList;

public  class PorscheModeller {

    public static void PorscheBilModeller(){
        ArrayList<String> modeller = new ArrayList<>();

        modeller.add("1. 911");
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
}
