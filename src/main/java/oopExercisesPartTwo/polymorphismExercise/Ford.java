package oopExercisesPartTwo.polymorphismExercise;

import oopExercisesPartTwo.polymorphismExercise.Car;

public class Ford extends Car {

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }
    public String startEngine(){
        return "Ford : The engine is starting!";
    }
    public String accelerate(){
        return "Ford : The car is accelerating!";
    }
    public String brake(){
        return "Ford : The car is braking!";
    }
}
