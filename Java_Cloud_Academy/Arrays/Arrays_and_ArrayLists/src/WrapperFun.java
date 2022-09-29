import java.util.ArrayList;

public class WrapperFun {

    public static void main (String[] args){

        ArrayList<Integer> myAl = new ArrayList<>();

        myAl.add(20);
        myAl.add(30);

        for(int i =0; i < myAl.size(); i++){
            System.out.println(myAl.get(i));
        } //end of for loop

        for (int num : myAl){
            System.out.println(num);
        } // end of enhanced for loop


        String someValue = "450";

        int parsedValue = Integer.parseInt(someValue); // Parsing String value into an Integer

        parsedValue += 10;

        System.out.println(parsedValue);


        String randomValue = "3.14159";

        double parsedDoubleValue = Double.parseDouble(randomValue);

        parsedDoubleValue += 10;

        System.out.println(parsedDoubleValue);





    } // end of main
}
