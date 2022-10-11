import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class WriteNames {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Eric");
        names.add("Johnny");
        names.add("Sunny");
        names.add("Donny");
        names.add("Pony");

        System.out.println(names);

        try {
            PrintWriter pw = new PrintWriter("names.txt");

            for (String name : names) {

                pw.println(name);
            }
            pw.close();

        } catch (FileNotFoundException ex) {
            System.out.println("File is not found!");
            System.out.println(ex.getMessage());
        }


    } // end of main

}
