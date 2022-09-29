import java.util.Scanner;

public class NameParser_Exercise {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String fullName;
        String name;
        String lastName;
        String upper;
        String lower;

        System.out.println("Please enter your name and surname: ");

        fullName = scan.nextLine();

        System.out.println("Your full name is: " + fullName);

        upper = fullName.toUpperCase();

        System.out.println("Your name is in upper case: " + upper);

        lower = fullName.toLowerCase();
        System.out.println("Your full name in lower case is: " + lower);


    } // end of main

}
