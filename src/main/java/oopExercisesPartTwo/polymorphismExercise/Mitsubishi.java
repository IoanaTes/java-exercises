package oopExercisesPartTwo.polymorphismExercise;

import oopExercisesPartTwo.polymorphismExercise.Car;

public class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }
    public String startEngine(){
        return "Mitsubishi : The engine is starting!";
    }
    public String accelerate(){
        return "Mitsubishi : The car is accelerating!";
    }
    public String brake(){
        return "Mitsubishi : The car is braking!";
    }
}
