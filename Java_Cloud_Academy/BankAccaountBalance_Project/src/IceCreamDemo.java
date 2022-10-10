public class IceCreamDemo {
    public static void main(String[] args) {

        IceCream myIc = new IceCream("Choco", 3, 2);
        IceCream yourIc = new IceCream("Vanny", 4, 3);

        myIc.addTopping("Strawberry");
        myIc.addTopping("Chocolate");

        yourIc.addTopping("Vanilla");
        yourIc.addTopping("Sprinkles");

        printIc(myIc);
        System.out.println();
        printIc(yourIc);


    }// end of main


    public static void printIc(IceCream iceCream) {

        System.out.println("You ice cream is " + iceCream.getName() + " and it has number of " + iceCream.getNumScoops() + " scoops." +
                "It cost: £" + iceCream.getCost());

        System.out.println("Toppings are");

        iceCream.printToppings();}



}// end of main
