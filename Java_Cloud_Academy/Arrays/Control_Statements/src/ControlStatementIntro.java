/*
3 Categories of Control Statements
 - Sequential (Sequence)
 - Selection (Decision)
 - Repetition (Loops)
 */

public class ControlStatementIntro {
    public static void main(String[] args) {
        int age = 20;


        if (age >= 16) {
            System.out.println("You can drive!");
        } else {
            System.out.println("You can not drive.");
        } // end of if-else


        for (int i = 1; i <= age; i++) {
            System.out.println("Happy Birthday " + i);
        } // enf of for


    } //end of main
}
