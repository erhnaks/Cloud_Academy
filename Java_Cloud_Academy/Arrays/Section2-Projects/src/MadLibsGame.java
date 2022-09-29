import java.util.Scanner;

public class MadLibsGame {
    public static void main (String[] args) {

        String adjective1;
        String girlName;
        String adjective2;
        String occupation1;
        String place;
        String clothing;
        String hobby;
        String adjective3;
        String occupation2;
        String boyName;
        String kingName;

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an adjective1" );
        adjective1 = scan.nextLine();

        System.out.println("Please enter a girl name" );
        girlName = scan.nextLine();

        System.out.println("Please enter an  adjective2" );
        adjective2 = scan.nextLine();

        System.out.println("Please enter a occupation1" );
        occupation1 = scan.nextLine();

        System.out.println("Please enter a place" );
        place = scan.nextLine();

        System.out.println("Please enter a clothing" );
        clothing = scan.nextLine();

        System.out.println("Please enter a hobby" );
        hobby = scan.nextLine();

        System.out.println("Please enter an adjective3" );
        adjective3 = scan.nextLine();


        System.out.println("Please enter a occupation2" );
        occupation2 = scan.nextLine();


        System.out.println("Please enter a boy name" );
        boyName = scan.nextLine();

        System.out.println("Please enter a king name" );
        kingName = scan.nextLine();


        System.out.println("There once was a " + adjective1 + " girl named " + girlName + ", who was a " +
            adjective2 + " " + occupation1 + " in the Kingdom of "
            + place + ". She loved to wear " + clothing + " and enjoyed " + hobby + ". She wanted to marry the "
            + adjective3 + " " + occupation2 + " named " + boyName +
            "but her father, King " + kingName + " forbid her from seeing him...");




    }// end of main
}
