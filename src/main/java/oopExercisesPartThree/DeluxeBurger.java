package oopExercisesPartThree;
public class DeluxeBurger extends Hamburger {
    public DeluxeBurger(){
        super(14.54,"Deluxe","Sausage & Beacon", "White Roll" );
    }

    public void addHamburgerAddition1(String name, double price) {
        System.out.println("You cannot add any item for Deluxe");
    }

    public void addHamburgerAddition2(String name, double price) {
        System.out.println("You cannot add any item for deluxe");
    }

    public void addHamburgerAddition3(String name, double price) {
        System.out.println("You cannot add any item for deluxe");
    }

    public void addHamburgerAddition4(String name, double price) {
        System.out.println("You cannot add any item for deluxe");
    }

    public double itemizeHamburger() {
        double chips = 2.75;
        double drinks = 1.81;
        return chips + drinks + super.itemizeHamburger();
    }
}