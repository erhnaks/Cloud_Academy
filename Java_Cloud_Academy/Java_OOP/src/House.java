public class House {

    private int numFloors;
    private int numWindows;
    private String colour;


    // no-arg constructor
    public House() {
        numFloors = 2;
        numWindows = 8;
        colour = "Green";
    } // end ctor  ===  ctor means "constructor"

    // Parameterized ctor
    public House( int numFloors,int numWindows, String colour) {
        this.numFloors = numFloors;
        this.numWindows = numWindows;
        this.colour = colour;
    } // end parameterized ctor


    public int getNumOfFloors() {
        return numFloors;
    } // getter for number of floors

    public void setNumOfFloors(int numOfFloors) {
        this.numFloors = numOfFloors;
    } // setter for number of floors

    public int getNumWindows() {
        return numWindows;
    } // getter for number of windows of the house!

    public void setNumWindows(int numWindows) {
        this.numWindows = numWindows;
    } // setter for number of windows

    public String getColour() {
        return colour;
    } // getter for colour of the house

    public void setColour(String colour) {
        this.colour = colour;
    } // setter for the colour of the house!


} // end of house class
