import java.util.Random;

public class RollDice {

    public static void main(String[] args) {

        Random random = new Random();

        int dice;

     for (int i = 0; i<10; i++){
         dice = random.nextInt(6) + 1;

         System.out.println("Your lucky numbers are: "  + dice);
     }


    } // end of Main
}
