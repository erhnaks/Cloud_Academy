public class StringMethod_1 {

    public static void main(String[] args) {

        String name = "John Doe";
        String name1 = "John Doe";
        String name2 = "Rob Barrister";

        for (int i = 0; i < name.length(); i++) {

            System.out.print(name.charAt(i) + " "); // It is print as it does print the same line! It is not println

        } // end of for

        System.out.println(); // prints and empty line

        if (name.equals(name1)) {
            System.out.println("names are equal");
        } else {
            System.out.println("names are not equal");
        }

        if (name.compareTo(name2) > 0) {
            System.out.println("name > name2");
        } else {
            System.out.println(" name <= name2 ");
        }


    } // end of main

}
