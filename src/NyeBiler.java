import java.util.Arrays;
import java.util.Scanner;

public class NyeBiler {
static Scanner scanner = new Scanner(System.in);

static int ferrari = 1;
static int lamborghini = 2;
static int porshce = 3;
static int mercedes = 4;


 public static void NyeBilerDisplay(String velkommen){
     System.out.println(velkommen);
     KonsolTing.printFordeler(30);


 }

 public static void NyeBilerModeller(String prompt, int brugerValg) {
     int valgAfModel;
     System.out.println(prompt);
     bilMærker bilModeller = new bilMærker();
     System.out.println();
     KonsolTing.printFordeler(30);

     do {
         System.out.println("Tast 1, 2, 3 eller 4 for at se mere");

         try {
             valgAfModel = Integer.parseInt(scanner.next());
         } catch (Exception e) {
             System.out.println("Du skal vælge et tal");
             valgAfModel = 0;
         }
      } while (valgAfModel <= 0|| valgAfModel >= brugerValg);

     if (valgAfModel == ferrari){
         System.out.println("Du har valgt ferrari");
         return;
     }
     if (valgAfModel == lamborghini){
         System.out.println("Du har valgt lamborghini");
         return;
     }
     if (valgAfModel == porshce){
         System.out.println("Du har valgt porsche");
         return;
     }

     if (valgAfModel == mercedes){
         System.out.println("Du har valgt mercedes");
     }

 }
}
