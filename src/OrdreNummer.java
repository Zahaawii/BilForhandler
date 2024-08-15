import java.util.Random;

public class OrdreNummer {

   static Random random = new Random();

   public static int OrdrenummerOprettet(){
       int ordreNummer = random.nextInt(10000);
       return ordreNummer;
   }

}
