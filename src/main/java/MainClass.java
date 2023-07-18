public class MainClass {

    public static void main(String[] args) {
        BooleanExercise myBool = new BooleanExercise();
        System.out.println("This is the boolean exercise:");
        System.out.println(myBool.returnTrueWithRightTurn(true,false,true,false));
        System.out.println(myBool.returnTrueWithOtherLane(true,false,true,false));
        System.out.println(myBool.returnTrueWithGreenLight(true,false,true,false));
        System.out.println(myBool.returnTrueWithPedestrian(true,false,true,false));

//If-else exercise
        System.out.println("This is the if-else exercise:");
        Object obj1 = new Object();
        Object obj2 = obj1;
        if (obj1.equals(obj2))
            System.out.println("true");
        else
            System.out.println("false");


    }
}
