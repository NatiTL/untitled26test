package CoffeMachine;

public class Drink {
    private Size size;

    public Drink() {


    }
     public void setSize(Size size) {

this.size = size;

    }
    public Size getSize() {
        return size;

    }
    public String toString() {
        return " Here is your Coffe! " + size;
    }
}
