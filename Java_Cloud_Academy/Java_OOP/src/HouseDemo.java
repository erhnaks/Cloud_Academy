public class HouseDemo {

    public static void main(String[] args) {

        House myHouse = new House(3,18,"White");
        House yourHouse = new House(5, 30,"Green");

//        myHouse.setNumOfFloors(3);
//        myHouse.setNumWindows(6);
//        myHouse.setColour("White");

//        yourHouse.setNumOfFloors(4);
//        yourHouse.setNumWindows(12);
//        yourHouse.setColour("Blue");

        System.out.println("My House has a " + myHouse.getNumOfFloors() + " floor, and it has " + myHouse.getNumWindows()
                + " windows. It's exterior colour is " + myHouse.getColour() + ".");

        System.out.println();

        System.out.println("Your House has a " + yourHouse.getNumOfFloors() + " floor, and it has " + yourHouse.getNumWindows()
                + " windows. It's exterior colour is " + yourHouse.getColour() + ".");

    } // end of main
} // end of houseDemo
