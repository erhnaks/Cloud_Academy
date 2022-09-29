import java.util.Scanner;

public class NameParser_Exercise {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String fullName;
        String name;
        String lastName;
        String upper;
        String lower;

        System.out.println("Please enter your full name: ");

        fullName = scan.nextLine();

        System.out.println("Your full name is: " + fullName);

        upper = fullName.toUpperCase();

        System.out.println("Your name is in upper case: " + upper);

        lower = fullName.toLowerCase();
        System.out.println("Your full name in lower case is: " + lower);

        int indexOfSpace = fullName.indexOf(" ");

        name = fullName.substring(0, indexOfSpace);
        lastName = fullName.substring(indexOfSpace + 1);

        System.out.println("Your first name is: " + name.toLowerCase());
        System.out.println("Your last name is: " + lastName.toUpperCase());

    } // end of main

}
