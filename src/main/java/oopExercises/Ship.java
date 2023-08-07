package oopExercises;

public class Ship {
    private int draft;
    private int crew;

    public Ship(int draft, int crew) {
        this.draft = draft;
        this.crew = crew;
    }

    //You have access to the ship "draft" and "crew". "Draft" is the total ship weight and "crew" is the number of humans on the ship.
    //Each crew member adds 1.5 units to the ship draft. If after removing the weight of the crew, the draft is still more than 20,
    //then the ship is worth looting. Any ship weighing that much must have a lot of booty!

    public boolean isWorthIt() {
        return (draft - 1.5 * crew) > 20;
    }
}
