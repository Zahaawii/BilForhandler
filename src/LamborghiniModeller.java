import java.util.ArrayList;

    public  class LamborghiniModeller {

        public static void LamborghiniBilModeller(){
            ArrayList<String> modeller = new ArrayList<>();

            modeller.add("1. Urus");
            modeller.add("2. GT");
            modeller.add("3. Revuelto");

            for(String bilModeller : modeller)
                System.out.println(bilModeller);


        }

        public static void LamborghiniDisplayInfo(String prompt){
            System.out.println(prompt);
            LamborghiniBilModeller();

        }
    }
