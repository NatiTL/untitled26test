package CoffeMachine;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        new Test().run();

    }

    void run() {
        Scanner In = new Scanner(System.in);
        CoffeMachine moca = new CoffeMachine();
        int svar;
        int size;

        System.out.println("1. Sort Kaffe ");
        System.out.println("2. Espresso ");
        System.out.println("3. Dobbelt Espresso");
        System.out.println("What would you like?");

        svar = In.nextInt();
        switch (svar) {
            case 1:
                moca.setDrink(new BlackCoffe());

        }

        System.out.println("1. Small  ");
        System.out.println("2. Medium ");
        System.out.println("3. Large ");
        System.out.println("What size would you like?");
        size = In.nextInt();
        System.out.println(moca.serve(size));
    }
}
