public class ArrayfunExercise {
    public static void main(String[] args) {

        int[] myArray = new int[10];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i + 1;
        } // end of for loop

        for (int num : myArray) {
            System.out.println(num);
        } // end of enhanced for loop
    } // end of main
}
