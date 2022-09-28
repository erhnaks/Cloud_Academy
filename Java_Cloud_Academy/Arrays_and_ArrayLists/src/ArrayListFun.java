import java.util.ArrayList;

public class ArrayListFun {

    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();

        nameList.add("Emma");
        nameList.add("Johny");
        nameList.add("Bunny");
        nameList.add("Honey");
        nameList.add("Gary");
        nameList.add("Josy");

//        for (int i = 0; i < nameList.size(); i++) {
//            System.out.println(nameList.get(i));
//        }

        for (String s : nameList) {
            System.out.println(s);
        }

    } // end of main

}
