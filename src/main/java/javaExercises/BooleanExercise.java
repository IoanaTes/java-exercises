package javaExercises;

public class BooleanExercise {

    public boolean returnTrueWithRightTurn(boolean greenLight, boolean pedestrian, boolean rightTurn, boolean otherLane) {
        if (((rightTurn && !pedestrian || otherLane) || (rightTurn && !pedestrian && greenLight)) == true)
            return true;
        else
            return false;
    }

    public boolean returnTrueWithOtherLane(boolean greenLight, boolean pedestrian, boolean rightTurn, boolean otherLane) {
        if (((rightTurn && !pedestrian || otherLane) || (otherLane && !pedestrian && greenLight)) == true)
            return true;
        else
            return false;
    }

    public boolean returnTrueWithPedestrian(boolean greenLight, boolean pedestrian, boolean rightTurn, boolean otherLane) {
        if (((rightTurn && !pedestrian || otherLane) || (pedestrian && !pedestrian && greenLight)) == true)
            return true;
        else
            return false;
    }

    public boolean returnTrueWithGreenLight(boolean greenLight, boolean pedestrian, boolean rightTurn, boolean otherLane) {
        if (((rightTurn && !pedestrian || otherLane) || (greenLight && !pedestrian && greenLight)) == true)
            return true;
        else
            return false;
    }


}
