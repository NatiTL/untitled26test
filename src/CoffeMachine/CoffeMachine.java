package CoffeMachine;

public class CoffeMachine {
    private Drink drink;

    public CoffeMachine() {

    }

    public void setDrink(Drink drink) {
        this.drink = drink;


    }

    public Drink serve(int size) {
        switch (size) {
            case 1:
                this.drink.setSize(Size.SMALL);
            case 2:
               this.drink.setSize(Size.MEDIUM);
            case 3:
                this.drink.setSize(Size.LARGE);



        }
        return drink;
    }

    }

