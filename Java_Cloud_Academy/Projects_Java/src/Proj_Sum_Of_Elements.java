import java.util.ArrayList;

public class Proj_Sum_Of_Elements {

    public static void main(String[] args) {

        ArrayList<Integer> someList = new ArrayList<>();

        someList.add(10);
        someList.add(20);
        someList.add(32);
        someList.add(53);
        someList.add(14);

        int sum = sumElements(someList);

        System.out.println("sum is " + sum);
    } // end of main

    public static int sumElements(ArrayList<Integer> list) {
        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
}
