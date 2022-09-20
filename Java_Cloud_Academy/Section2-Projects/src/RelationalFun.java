public class RelationalFun {
    public static void main (String[] args){

/*
The Relational Operators
> Greater than
>= Greater than or equal to
< Less than
<= Less than equal to
== equal to
!= not equal to
 */

        boolean myBool = true;
        boolean yourBool = false;
        int myAge = 37;
        int yourAge = 20;
        int bobsAge = 20;


        String myName = "John";
        String yourName = "John";

        System.out.println("myBool is " + myBool);
        System.out.println("your boolean is " + yourBool);

        // Relational operations;

        boolean ageComparision = myAge > yourAge;
        System.out.println("myage > yourAge? " + ageComparision);

        ageComparision = yourAge > bobsAge;

        System.out.println("Yourage > bobsage? " + ageComparision);

        ageComparision = yourAge == bobsAge;

        System.out.println("yourage == bobsage? " + ageComparision);


        boolean nameComparision = myName.equals(yourName);

        System.out.println("do names match? " + nameComparision);


    } //end of main
}
