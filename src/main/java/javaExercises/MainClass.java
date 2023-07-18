package javaExercises;

import java.sql.SQLOutput;
import java.util.zip.DeflaterOutputStream;

public class MainClass {


    public static void main(String[] args) {

        LogicExercises myLogic = new LogicExercises();
        //Bool exercise
        BooleanExercise myBool = new BooleanExercise();
        System.out.println("This is the boolean exercise:");
        System.out.println(myBool.returnTrueWithRightTurn(true, false, true, false));
        System.out.println(myBool.returnTrueWithOtherLane(true, false, true, false));
        System.out.println(myBool.returnTrueWithGreenLight(true, false, true, false));
        System.out.println(myBool.returnTrueWithPedestrian(true, false, true, false));

        //If-else exercise
        System.out.println("This is the if-else exercise:");
        Object obj1 = new Object();
        Object obj2 = obj1;
        if (obj1.equals(obj2))
            System.out.println("true");
        else
            System.out.println("false");


    /*When squirrels get together for a party, they like to have cigars. A squirrel party is successful when the number of cigars is between 40 and 60, inclusive.
    Unless it is the weekend, in which case there is no upper bound on the number of cigars.
    Return true if the party with the given values is successful, or false otherwise.*/
        //cigarParty(30, false) → false
        System.out.println(myLogic.cigarParty(30, false));
        //cigarParty(40, false) → true
        System.out.println(myLogic.cigarParty(40, false));
        //cigarParty(50, false) → true
        System.out.println(myLogic.cigarParty(50, false));
        //cigarParty(60, false) → true
        System.out.println(myLogic.cigarParty(60, false));
        //cigarParty(70, false) → false
        System.out.println(myLogic.cigarParty(70, false));
        //cigarParty(30, true) → false
        System.out.println(myLogic.cigarParty(30, true));
        //cigarParty(40, true) → true
        System.out.println(myLogic.cigarParty(40, true));
        //cigarParty(50, true) → true
        System.out.println(myLogic.cigarParty(50, true));

        /*You and your date are trying to get a table at a restaurant.
        The parameter "you" is the stylishness of your clothes, in the range 0..10,
        and "date" is the stylishness of your date's clothes.
        The result getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes.
        If either of you is very stylish, 8 or more, then the result is 2 (yes).
        With the exception that if either of you has style of 2 or less, then the result is 0 (no).
        Otherwise the result is 1 (maybe).*/
        //dateFashion(5, 10) → 2
        System.out.println(myLogic.dateFashion(5,10));
        //dateFashion(8, 8) → 2
        System.out.println(myLogic.dateFashion(8,8));
        //dateFashion(2, 10) → 0
        System.out.println(myLogic.dateFashion(2,10));
        //dateFashion(2, 2) → 0
        System.out.println(myLogic.dateFashion(2,2));
        //dateFashion(9, 2) → 0
        System.out.println(myLogic.dateFashion(9,2));
        //dateFashion(5, 6) → 1
        System.out.println(myLogic.dateFashion(5,6));

        /*The squirrels in Palo Alto spend most of the day playing.
        In particular, they play if the temperature is between 60 and 90 (inclusive).
        Unless it is summer, then the upper limit is 100 instead of 90.
        Given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise.*/
        //squirrelPlay(50, false) → false
        System.out.println(myLogic.squirrelPlay(50,false));
        //squirrelPlay(60, false) → true
        System.out.println(myLogic.squirrelPlay(60,false));
        //squirrelPlay(75, false) → true
        System.out.println(myLogic.squirrelPlay(75,false));
        //squirrelPlay(90, false) → true
        System.out.println(myLogic.squirrelPlay(90,false));
        //squirrelPlay(95, false) → false
        System.out.println(myLogic.squirrelPlay(95,false));
        //squirrelPlay(55, true) → false
        System.out.println(myLogic.squirrelPlay(55,true));
        //squirrelPlay(60, true) → true
        System.out.println(myLogic.squirrelPlay(60,true));
        //squirrelPlay(70, true) → true
        System.out.println(myLogic.squirrelPlay(70,true));
        //squirrelPlay(90, true) → true
        System.out.println(myLogic.squirrelPlay(90,true));
        //squirrelPlay(100, true) → true
        System.out.println(myLogic.squirrelPlay(100,true));
        //squirrelPlay(105, true) → false
        System.out.println(myLogic.squirrelPlay(105,true));

        /*Given two int values, a and b, return true if either one is 6.
        Or if their sum or difference is 6.*/
        //love6(6, 4) → true
        System.out.println(myLogic.love6(6,4));
        //love6(4, 6) → true
        System.out.println(myLogic.love6(4,6));
        //love6(5, 4) → false
        System.out.println(myLogic.love6(5,4));
        //love6(10, 4) → true
        System.out.println(myLogic.love6(10,4));
        //love6(4, 10) → true
        System.out.println(myLogic.love6(4,10));
        /*Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket.
        If speed is 60 or less, the result is 0.
        If speed is between 61 and 80 inclusive, the result is 1.
        If speed is 81 or more, the result is 2.
        Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.*/
        //caughtSpeeding(60, false) → 0
        System.out.println(myLogic.caughtSpeeding(60, false));
        //caughtSpeeding(61, false) → 1
        System.out.println(myLogic.caughtSpeeding(61, false));
        //caughtSpeeding(80, false) → 1
        System.out.println(myLogic.caughtSpeeding(80, false));
        //caughtSpeeding(81, false) → 2
        System.out.println(myLogic.caughtSpeeding(81, false));
        //caughtSpeeding(65, true) → 0
        System.out.println(myLogic.caughtSpeeding(65, true));
        //caughtSpeeding(66, true) → 1
        System.out.println(myLogic.caughtSpeeding(66, true));
        //caughtSpeeding(85, true) → 1
        System.out.println(myLogic.caughtSpeeding(85, true));
        //caughtSpeeding(86, true) → 1
        System.out.println(myLogic.caughtSpeeding(86, true));

    }
}
