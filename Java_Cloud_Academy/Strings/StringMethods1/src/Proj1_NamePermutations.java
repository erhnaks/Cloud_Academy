import java.util.Scanner;
import java.util.ArrayList;

public class Proj1_NamePermutations {

    public static void main(String[] args) {
        ArrayList<String> firstNames = new ArrayList<>();
        ArrayList<String> lastNames = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        String fullName;
        String firstName;
        String lastName;
        int indexOfSpace;


        final int NUM_NAMES = 5;

        for (int i = 0; i < NUM_NAMES; i++) {
            System.out.print("Please enter your full name: " + i + "\t");
            fullName = scan.nextLine();
            indexOfSpace = fullName.indexOf(" ");

            firstName = fullName.substring(0, indexOfSpace);
            lastName = fullName.substring(indexOfSpace + 1);

            firstNames.add(firstName);
            lastNames.add(lastName);

        } // end of for

        for (int i = 0; i < firstNames.size(); i++) {
            for (int j = 0; j < lastNames.size(); j++) {
                System.out.println(firstNames.get(i) + " ");
                System.out.println(lastNames.get(j));
            }
        }


    } //end of main
}
