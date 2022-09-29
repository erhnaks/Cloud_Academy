import java.util.Random;

public class RandomFun {
    public static void main(String[] args) {

        Random random = new Random();

        int randomNumber;

        randomNumber = random.nextInt();

        System.out.println( "number is" + "\t" +randomNumber);

        randomNumber = random.nextInt(100) + 1; // Shifting to get between 1 and 100 and not 0-99!

        System.out.println("random number within 1000 is " + "\t" + randomNumber);
    } // end of main
}
