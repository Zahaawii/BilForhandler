import java.util.ArrayList;

    public  class LamborghiniModeller {

        public static void LamborghiniBilModeller() {
            ArrayList<String> modeller = new ArrayList<>();

            modeller.add("1. Urus");
            modeller.add("2. GT");
            modeller.add("3. Revuelto");

            for (String bilModeller : modeller)
                System.out.println(bilModeller);


        }

        public static void LamborghiniDisplayInfo(String prompt) {
            System.out.println(prompt);
            LamborghiniBilModeller();

        }

        public static void GTModel() {
            BilerIndstillinger GTModel = new BilerIndstillinger("GT 1", "GT", "Gul", 0, "300 KM/T");
            GTModel.BilIndstilligerDisplay();
            BilerIndstillinger GTModel2 = new BilerIndstillinger("GT 2", "GT", "Sort", 0, "300 KM/T");
            GTModel2.BilIndstilligerDisplay();
            BilerIndstillinger GTModel3 = new BilerIndstillinger("GT 3", "GT", "Grøn", 0, "300 KM/T");
            GTModel3.BilIndstilligerDisplay();
        }

        public static void UrusModel() {
            BilerIndstillinger UrusModel = new BilerIndstillinger("Urus 1", "Urus", "Gul", 0, "300 KM/T");
            UrusModel.BilIndstilligerDisplay();
            BilerIndstillinger UrusModel2 = new BilerIndstillinger("Urus 2", "Urus", "Sort", 0, "300 KM/T");
            UrusModel2.BilIndstilligerDisplay();
            BilerIndstillinger UrusModel3 = new BilerIndstillinger("Urus 3", "Urus", "Grøn", 0, "300 KM/T");
            UrusModel3.BilIndstilligerDisplay();

        }

        public static void RevueltoModel() {
            BilerIndstillinger RevueltoModel = new BilerIndstillinger("Revuelto 1", "Revuelto", "Gul", 0, "300 KM/T");
            RevueltoModel.BilIndstilligerDisplay();
            BilerIndstillinger RevueltoModel2 = new BilerIndstillinger("Revuelto 2", "Revuelto", "Sort", 0, "300 KM/T");
            RevueltoModel2.BilIndstilligerDisplay();
            BilerIndstillinger RevueltoModel3 = new BilerIndstillinger("Revuelto 3", "Revuelto", "Grøn", 0, "300 KM/T");
            RevueltoModel3.BilIndstilligerDisplay();

        }
    }