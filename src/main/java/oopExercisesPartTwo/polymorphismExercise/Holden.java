package oopExercisesPartTwo.polymorphismExercise;

import oopExercisesPartTwo.polymorphismExercise.Car;

public class Holden extends Car {

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }
    public String startEngine(){
        return "Holden : The engine is starting!";
    }
    public String accelerate(){
        return "Holden : The car is accelerating!";
    }
    public String brake(){
        return "Holden : The car is braking!";
    }
}
