import java.util.Scanner;

public class UserInput {
    public static void main (String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String name;

        System.out.println("What is your name? ");

        name = keyboard.nextLine();

        int age;

        System.out.println("how old are you?");

        age = keyboard.nextInt();

        System.out.println("Hello " + name + "!");

        System.out.println("You are " + age + " years old!");







    } //end of main
}
