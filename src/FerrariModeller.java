import java.util.ArrayList;


public  class FerrariModeller {

    public static void FerrariBilModeller(){
        ArrayList<String> modeller = new ArrayList<>();

        modeller.add("1. Sport");
        modeller.add("2. Ferrari");
        modeller.add("3. GTS");

        for(String bilModeller : modeller)
            System.out.println(bilModeller);


    }
    public static void FerrariDisplayInfo(String prompt){
        System.out.println(prompt);
        System.out.println();
        FerrariBilModeller();
        System.out.println();
    }
}
