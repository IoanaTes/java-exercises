package oopExercises;

public class Main {

    public static void main(String[] args) {

        Ship titanic = new Ship(15, 10);
        Ship cruiseShip = new Ship(100, 50);
        Ship anotherShip = new Ship(5, 1);
        Ship myPositiveShip = new Ship(36, 10);
        Ship myNegativeShip = new Ship(35, 10);

        System.out.println(titanic.isWorthIt()); //false
        System.out.println(cruiseShip.isWorthIt()); //true
        System.out.println(anotherShip.isWorthIt()); //false
        System.out.println(myPositiveShip.isWorthIt()); //true
        System.out.println(myNegativeShip.isWorthIt()); //false
    }
}
