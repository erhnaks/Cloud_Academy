import java.util.Scanner;

public class UserInput {
    public static void main (String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String name;
        int age;
        int number;
        String city;

        System.out.println("What is your name? ");

        name = keyboard.nextLine();

        System.out.println("how old are you?");

        age = keyboard.nextInt();
        /*
        Whenever you ask for and Integer input from a user and then a String input then a known bug will not ask for a String input
        after and Integer input. This is known as lost in stream. In order to get String input after and Integer Inpout from a user then

        YOU NEED TO USE AN EMPTY
        NEXTLINE() eg keyboard.nextLine(); to consume the new line!
         */
        System.out.println("Give us your favourite number and I will double it !");
        number = keyboard.nextInt();
        number *= 2;

        keyboard.nextLine();
        System.out.println("where do you live? ");

        city = keyboard.nextLine();

        System.out.println("Hello " + name + "!");

        System.out.println("You are " + age + " years old, ");
        System.out.println("Your doubled number is " + number);
        System.out.println("You live in " + city);




    } //end of main
}
