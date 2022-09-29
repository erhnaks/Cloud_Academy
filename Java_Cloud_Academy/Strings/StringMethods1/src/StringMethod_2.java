public class StringMethod_2 {

    public static void main(String[] args) {

        String myName = "John Doe";

        String upper = myName.toUpperCase();
        String lower = myName.toLowerCase();

        int whereIsD = myName.indexOf("D");

        String lastName = myName.substring(5);

        System.out.println("upper is: " + upper);
        System.out.println("Lower is: " + lower);
        System.out.println("D is at index: " + whereIsD);
        System.out.println("Last name is: " + lastName);


    } // end of main


}
