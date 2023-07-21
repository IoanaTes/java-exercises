package javaExercises;
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
        Otherwise, the result is 1 (maybe).*/
        //dateFashion(5, 10) → 2
        System.out.println(myLogic.dateFashion(5, 10));
        //dateFashion(8, 8) → 2
        System.out.println(myLogic.dateFashion(8, 8));
        //dateFashion(2, 10) → 0
        System.out.println(myLogic.dateFashion(2, 10));
        //dateFashion(2, 2) → 0
        System.out.println(myLogic.dateFashion(2, 2));
        //dateFashion(9, 2) → 0
        System.out.println(myLogic.dateFashion(9, 2));
        //dateFashion(5, 6) → 1
        System.out.println(myLogic.dateFashion(5, 6));

        /*The squirrels in Palo Alto spend most of the day playing.
        In particular, they play if the temperature is between 60 and 90 (inclusive).
        Unless it is summer, then the upper limit is 100 instead of 90.
        Given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise.*/
        //squirrelPlay(50, false) → false
        System.out.println(myLogic.squirrelPlay(50, false));
        //squirrelPlay(60, false) → true
        System.out.println(myLogic.squirrelPlay(60, false));
        //squirrelPlay(75, false) → true
        System.out.println(myLogic.squirrelPlay(75, false));
        //squirrelPlay(90, false) → true
        System.out.println(myLogic.squirrelPlay(90, false));
        //squirrelPlay(95, false) → false
        System.out.println(myLogic.squirrelPlay(95, false));
        //squirrelPlay(55, true) → false
        System.out.println(myLogic.squirrelPlay(55, true));
        //squirrelPlay(60, true) → true
        System.out.println(myLogic.squirrelPlay(60, true));
        //squirrelPlay(70, true) → true
        System.out.println(myLogic.squirrelPlay(70, true));
        //squirrelPlay(90, true) → true
        System.out.println(myLogic.squirrelPlay(90, true));
        //squirrelPlay(100, true) → true
        System.out.println(myLogic.squirrelPlay(100, true));
        //squirrelPlay(105, true) → false
        System.out.println(myLogic.squirrelPlay(105, true));

        /*Given two int values, a and b, return true if either one is 6.
        Or if their sum or difference is 6.*/
        //love6(6, 4) → true
        System.out.println(myLogic.love6(6, 4));
        //love6(4, 6) → true
        System.out.println(myLogic.love6(4, 6));
        //love6(5, 4) → false
        System.out.println(myLogic.love6(5, 4));
        //love6(10, 4) → true
        System.out.println(myLogic.love6(10, 4));
        //love6(4, 10) → true
        System.out.println(myLogic.love6(4, 10));

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

        /*Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20.*/
        //sortaSum(3, 4) → 7
        System.out.println(myLogic.sortaSum(3, 4));
        //sortaSum(9, 4) → 20
        System.out.println(myLogic.sortaSum(9, 4));
        //sortaSum(10, 11) → 21
        System.out.println(myLogic.sortaSum(10, 11));
        //sortaSum(12, -3) → 9
        System.out.println(myLogic.sortaSum(12, -3));

        /*Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are on vacation,
        return a string of the form "7:00" indicating when the alarm clock should ring. Weekdays, the alarm should be "7:00"
        and on the weekend it should be "10:00".
        Unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off".*/
        //alarmClock(1, false) → "7:00"
        System.out.println(myLogic.alarmClock(1, false));
        //alarmClock(5, false) → "7:00"
        System.out.println(myLogic.alarmClock(5, false));
        //alarmClock(0, false) → "10:00"
        System.out.println(myLogic.alarmClock(0, false));
        //alarmClock(6, false) → "10:00"
        System.out.println(myLogic.alarmClock(6, false));
        //alarmClock(0, true) → "off"
        System.out.println(myLogic.alarmClock(0, true));
        //alarmClock(6, true) → "off"
        System.out.println(myLogic.alarmClock(6, true));
        //alarmClock(1, true) → "10:00"
        System.out.println(myLogic.alarmClock(1, true));
        //alarmClock(3, true) → "10:00"
        System.out.println(myLogic.alarmClock(3, true));

        /*We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11.
         Return true if the given non-negative number is special.*/
        //specialEleven(22) → true
        System.out.println(myLogic.specialEleven(22));
        //specialEleven(23) → true
        System.out.println(myLogic.specialEleven(23));
        //specialEleven(24) → false
        System.out.println(myLogic.specialEleven(24));
        //specialEleven(21) → false
        System.out.println(myLogic.specialEleven(21));

        /*Given a number n, return true if n is in the range 1..10, inclusive.
        Unless outsideMode is true, in which case return true if the number is less or equal to 1,
        or greater or equal to 10.*/
        //in1To10(11, false) → false
        System.out.println(myLogic.in1To10(11, false));
        //in1To10(11, true) → true
        System.out.println(myLogic.in1To10(11, true));
        //in1To10(10, false) → true
        System.out.println(myLogic.in1To10(10, false));
        //in1To10(10, true) → true
        System.out.println(myLogic.in1To10(10, true));
        //in1To10(9, false) → true
        System.out.println(myLogic.in1To10(9, false));
        //in1To10(9, true) → false
        System.out.println(myLogic.in1To10(9, true));

        /*Return true if the given non-negative number is 1 or 2 more than a multiple of 20.*/
        //more20(20) → false
        System.out.println(myLogic.more20(20));
        //more20(21) → true
        System.out.println(myLogic.more20(21));
        //more20(22) → true
        System.out.println(myLogic.more20(22));
        //more20(23) → false
        System.out.println(myLogic.more20(23));
        //more20(30) → false
        System.out.println(myLogic.more20(30));
        //more20(60) → false
        System.out.println(myLogic.more20(60));

        /*Return true if the given non-negative number is a multiple of 3 or 5, but not both.*/
        //old35(3) → true
        System.out.println(myLogic.old35(3));
        //old35(5) → true
        System.out.println(myLogic.old35(5));
        //old35(10) → true
        System.out.println(myLogic.old35(10));
        //old35(9) → true
        System.out.println(myLogic.old35(9));
        //old35(15) → false
        System.out.println(myLogic.old35(15));
        //old35(30) → false
        System.out.println(myLogic.old35(30));


        /*Return true if the given non-negative number is 1 or 2 less than a multiple of 20.*/
        //less20(18) → true
        System.out.println(myLogic.less20(18));
        //less20(19) → true
        System.out.println(myLogic.less20(19));
        //less20(20) → false
        System.out.println(myLogic.less20(20));
        //less20(21) → false
        System.out.println(myLogic.less20(21));
        //less20(22) → false
        System.out.println(myLogic.less20(22));

        /*Given a non-negative number "num", return true if num is within 2 of a multiple of 10.*/
        //nearTen(8) → true
        System.out.println(myLogic.nearTen(8));
        //nearTen(9) → true
        System.out.println(myLogic.nearTen(9));
        //nearTen(10) → true
        System.out.println(myLogic.nearTen(10));
        //nearTen(11) → true
        System.out.println(myLogic.nearTen(11));
        //nearTen(12) → true
        System.out.println(myLogic.nearTen(12));
        //nearTen(13) → false
        System.out.println(myLogic.nearTen(13));


        /*Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive, are extra lucky.
        So if either value is a teen, just return 19.*/
        //teenSum(3, 4) → 7
        System.out.println(myLogic.teenSum(3, 4));
        //teenSum(10, 13) → 19
        System.out.println(myLogic.teenSum(10, 13));
        //teenSum(13, 2) → 19
        System.out.println(myLogic.teenSum(13, 2));
        //teenSum(3, 19) → 19
        System.out.println(myLogic.teenSum(3, 19));
        //teenSum(13, 13) → 19
        System.out.println(myLogic.teenSum(13, 13));
        //teenSum(10, 10) → 20
        System.out.println(myLogic.teenSum(10, 10));

        /*Your cell phone rings. Return true if you should answer it. Normally you answer,
        except in the morning you only answer if it is your mom calling.
        In all cases, if you are asleep, you do not answer.*/
        //answerCell(false, false, false) → true
        System.out.println(myLogic.answerCell(false, false, false));
        //answerCell(false, false, true) → false
        System.out.println(myLogic.answerCell(false, false, true));
        //answerCell(true, false, false) → false
        System.out.println(myLogic.answerCell(true, false, false));
        //answerCell(true, true, false) → true
        System.out.println(myLogic.answerCell(true, true, false));
        //answerCell(false, true, false) → true
        System.out.println(myLogic.answerCell(false, true, false));
        //answerCell(true, true, true) → false
        System.out.println(myLogic.answerCell(true, true, true));

        /*Return the int outcome of the party encoded as 0=bad, 1=good, or 2=great.
        A party is good (1) if both tea and candy are at least 5. However, if either tea or candy is at least double the amount of the other one,
        the party is great (2). However, in all cases, if either tea or candy is less than 5, the party is always bad (0).*/
        //teaParty(6, 8) → 1
        System.out.println(myLogic.teaParty(6, 8));
        //teaParty(3, 8) → 0
        System.out.println(myLogic.teaParty(3, 8));
        //teaParty(20, 6) → 2
        System.out.println(myLogic.teaParty(20, 6));
        //teaParty(12, 6) → 2
        System.out.println(myLogic.teaParty(12, 6));
        //teaParty(11, 6) → 1
        System.out.println(myLogic.teaParty(11, 6));
        //teaParty(11, 4) → 0
        System.out.println(myLogic.teaParty(11, 4));

        /*Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b" return "Buzz".
        If both the "f" and "b" conditions are true, return "FizzBuzz". In all other cases, return the string unchanged.*/
        //fizzString("fig") → "Fizz"
        System.out.println(myLogic.fizzString("fig"));
        //fizzString("dib") → "Buzz"
        System.out.println(myLogic.fizzString("dib"));
        //fizzString("fib") → "FizzBuzz"
        System.out.println(myLogic.fizzString("fib"));
        //fizzString("abc") → "abc"
        System.out.println(myLogic.fizzString("abc"));

        /*Given an int n, return the string form of the number followed by "!". So the int 6 yields "6!".
        Except if the number is divisible by 3 use "Fizz" instead of the number,
        and if the number is divisible by 5 use "Buzz", and if divisible by both 3 and 5, use "FizzBuzz".*/
        //fizzString2(1) → "1!"
        System.out.println(myLogic.fizzString2(1));
        //fizzString2(2) → "2!"
        System.out.println(myLogic.fizzString2(2));
        //fizzString2(3) → "Fizz!"
        System.out.println(myLogic.fizzString2(3));
        //fizzString2(5) → "Buzz!"
        System.out.println(myLogic.fizzString2(5));
        //fizzString2(15) → "FizzBuzz!"
        System.out.println(myLogic.fizzString2(15));

        /*Given three ints, a b c, return true if it is possible to add two of the ints to get the third.*/
        //twoAsOne(1, 2, 3) → true
        System.out.println(myLogic.twoAsOne(1, 2, 3));
        //twoAsOne(3, 1, 2) → true
        System.out.println(myLogic.twoAsOne(3, 1, 2));
        //twoAsOne(3, 2, 2) → false
        System.out.println(myLogic.twoAsOne(3, 2, 2));
        //twoAsOne(2, 3, 1) → true
        System.out.println(myLogic.twoAsOne(2, 3, 1));

        /*Given three ints, a b c, return true if b is greater than a, and c is greater than b.
        However, with the exception that if "bOk" is true, b does not need to be greater than a.*/
        //inOrder(1, 2, 4, false) → true
        System.out.println(myLogic.inOrder(1, 2, 4, false));
        //inOrder(1, 2, 1, false) → false
        System.out.println(myLogic.inOrder(1, 2, 1, false));
        //inOrder(3, 2, 4, false) → false
        System.out.println(myLogic.inOrder(3, 2, 4, false));
        //inOrder(2, 4, 6, true) → true
        System.out.println(myLogic.inOrder(2, 4, 6, true));
        //inOrder(1, 1, 2, true) → true
        System.out.println(myLogic.inOrder(1, 1, 2, true));
        //inOrder(3, 2, 4, true) → true
        System.out.println(myLogic.inOrder(3, 2, 4, true));
        //inOrder(4, 5, 2, true) → false
        System.out.println(myLogic.inOrder(4, 5, 2, true));

        /*Given three ints, a b c, return true if they are in strict increasing order, such as 2 5 11, or 5 6 7, but not 6 5 7 or 5 5 7.
        However, with the exception that if "equalOk" is true, equality is allowed, such as 5 5 7 or 5 5 5.*/
        //inOrderEqual(2, 5, 11, false) → true
        System.out.println(myLogic.inOrderEqual(2, 5, 11, false));
        //inOrderEqual(5, 7, 6, false) → false
        System.out.println(myLogic.inOrderEqual(5, 7, 6, false));
        //inOrderEqual(5, 5, 7, false) → false
        System.out.println(myLogic.inOrderEqual(5, 5, 7, false));
        //inOrderEqual(5, 5, 7, true) → true
        System.out.println(myLogic.inOrderEqual(5, 5, 7, true));
        //inOrderEqual(3, 4, 4, true) → true
        System.out.println(myLogic.inOrderEqual(3, 4, 4, true));
        //inOrderEqual(5, 5, 5, true) → true
        System.out.println(myLogic.inOrderEqual(5, 5, 5, true));
        //inOrderEqual(2, 2, 1, true) → false
        System.out.println(myLogic.inOrderEqual(2, 2, 1, true));

        /*Given three ints, a b c, return true if two or more of them have the same rightmost digit.
        The ints are non-negative.*/
        //lastDigit(23, 19, 13) → true
        System.out.println(myLogic.lastDigit(23, 19, 13));
        //lastDigit(23, 19, 39) → true
        System.out.println(myLogic.lastDigit(23, 19, 39));
        //lastDigit(23, 19, 12) → false
        System.out.println(myLogic.lastDigit(23, 19, 12));
        //lastDigit(1, 2, 3) → false
        System.out.println(myLogic.lastDigit(1, 2, 3));
        //lastDigit(2, 2, 2) → true
        System.out.println(myLogic.lastDigit(2, 2, 2));

        /*Given three ints, a b c, return true if one of them is 10 or more less than one of the others.*/
        //lessBy10(1, 7, 11) → true
        System.out.println(myLogic.lessBy10(1, 7, 11));
        //lessBy10(1, 7, 10) → false
        System.out.println(myLogic.lessBy10(1, 7, 10));
        //lessBy10(11, 1, 7) → true
        System.out.println(myLogic.lessBy10(11, 1, 7));
        //lessBy10(10, 7, 1) → false
        System.out.println(myLogic.lessBy10(10, 7, 1));
        //lessBy10(-10, 2, 2) → true
        System.out.println(myLogic.lessBy10(-10, 2, 2));
        //lessBy10(2, 11, 11) → false
        System.out.println(myLogic.lessBy10(2, 11, 11));

        /*Return the sum of two 6-sided dice rolls, each in the range 1..6.
        However, if noDoubles is true, if the two dice show the same value,
        increment one dice to the next value, wrapping around to 1 if its value was 6.*/
        //withoutDoubles(2, 3, true) → 5
        System.out.println(myLogic.withoutDoubles(2, 3, true));
        //withoutDoubles(3, 3, true) → 7
        System.out.println(myLogic.withoutDoubles(3, 3, true));
        //withoutDoubles(3, 3, false) → 6
        System.out.println(myLogic.withoutDoubles(3, 3, false));
        //withoutDoubles(2, 3, false) → 5
        System.out.println(myLogic.withoutDoubles(2, 3, false));
        //withoutDoubles(6, 6, true) → 7
        System.out.println(myLogic.withoutDoubles(6, 6, true));
        //withoutDoubles(6, 6, false) → 12
        System.out.println(myLogic.withoutDoubles(6, 6, false));
        //withoutDoubles(1, 6, true) → 7
        System.out.println(myLogic.withoutDoubles(1, 6, true));
        //withoutDoubles(6, 1, false) → 7
        System.out.println(myLogic.withoutDoubles(6, 1, false));

        /*Given two int values, return whichever value is larger.
        However if the two values have the same remainder when divided by 5, then the return the smaller value.
        However, in all cases, if the two values are the same, return 0.*/
        //maxMod5(2, 3) → 3
        System.out.println(myLogic.maxMod5(2, 3));
        //maxMod5(6, 2) → 6
        System.out.println(myLogic.maxMod5(6, 2));
        //maxMod5(3, 2) → 3
        System.out.println(myLogic.maxMod5(3, 2));
        //maxMod5(12, 12) → 0
        System.out.println(myLogic.maxMod5(12, 12));
        //maxMod5(7, 12) → 7
        System.out.println(myLogic.maxMod5(7, 12));
        //maxMod5(11, 6) → 6
        System.out.println(myLogic.maxMod5(11, 6));

        /*You have a red lottery ticket showing ints a, b, and c, each of which is 0, 1, or 2. If they are all the value 2, the result is 10.
        Otherwise if they are all the same, the result is 5.
        Otherwise so long as both b and c are different from a, the result is 1.
        Otherwise the result is 0.*/
        //redTicket(2, 2, 2) → 10
        System.out.println(myLogic.redTicket(2, 2, 2));
        //redTicket(2, 2, 1) → 0
        System.out.println(myLogic.redTicket(2, 2, 1));
        //redTicket(0, 0, 0) → 5
        System.out.println(myLogic.redTicket(0, 0, 0));
        //redTicket(2, 0, 0) → 1
        System.out.println(myLogic.redTicket(2, 0, 0));
        //redTicket(1, 1, 1) → 5
        System.out.println(myLogic.redTicket(1, 1, 1));
        //redTicket(1, 2, 1) → 0
        System.out.println(myLogic.redTicket(1, 2, 1));

        /*You have a green lottery ticket, with ints a, b, and c on it.
        If the numbers are all different from each other, the result is 0.
        If all of the numbers are the same, the result is 20.
        If two of the numbers are the same, the result is 10.*/
        //greenTicket(1, 2, 3) → 0
        System.out.println(myLogic.greenTicket(1, 2, 3));
        //greenTicket(2, 2, 2) → 20
        System.out.println(myLogic.greenTicket(2, 2, 2));
        //greenTicket(1, 1, 2) → 10
        System.out.println(myLogic.greenTicket(1, 1, 2));
        //greenTicket(2, 1, 1) → 10
        System.out.println(myLogic.greenTicket(2, 1, 1));
        //greenTicket(1, 2, 1) → 10
        System.out.println(myLogic.greenTicket(1, 2, 1));
        //greenTicket(3, 2, 1) → 0
        System.out.println(myLogic.greenTicket(3, 2, 1));

        /*You have a blue lottery ticket, with ints a, b, and c on it.
        This makes three pairs, which we'll call ab, bc, and ac.
        Consider the sum of the numbers in each pair. If any pair sums to exactly 10, the result is 10.
        Otherwise if the ab sum is exactly 10 more than either bc or ac sums, the result is 5.
        Otherwise the result is 0.*/
        //blueTicket(9, 1, 0) → 10
        System.out.println(myLogic.blueTicket(9, 1, 0));
        //blueTicket(9, 2, 0) → 0
        System.out.println(myLogic.blueTicket(9, 2, 0));
        //blueTicket(6, 1, 4) → 10
        System.out.println(myLogic.blueTicket(6, 1, 4));
        //blueTicket(6, 1, 5) → 0
        System.out.println(myLogic.blueTicket(6, 1, 5));
        //blueTicket(0, 10, 0) → 10
        System.out.println(myLogic.blueTicket(0, 10, 0));
        //blueTicket(15, 0, 5) → 5
        System.out.println(myLogic.blueTicket(15, 0, 5));
        //blueTicket(13, 2, 3) → 5
        System.out.println(myLogic.blueTicket(13, 2, 3));
        //blueTicket(4, 11, 1) → 5
        System.out.println(myLogic.blueTicket(4, 11, 1));

        /*Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers*/
        //shareDigit(12, 23) → true
        System.out.println(myLogic.shareDigit(12, 23));
        //shareDigit(12, 43) → false
        System.out.println(myLogic.shareDigit(12, 43));
        //shareDigit(12, 44) → false
        System.out.println(myLogic.shareDigit(12, 44));
        //shareDigit(23, 12) → true
        System.out.println(myLogic.shareDigit(23, 12));
        //shareDigit(30, 90) → true
        System.out.println(myLogic.shareDigit(30, 90));

        /*Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same number of digits as a.
        If the sum has more digits than a, just return a without b.*/
        //sumLimit(90000000, 1) → 90000001
        System.out.println(myLogic.sumLimit(90000000, 1));
        //sumLimit(9000, 1000) → 9000
        System.out.println(myLogic.sumLimit(9000, 1000));
        //sumLimit(0, 0) → 0
        System.out.println(myLogic.sumLimit(0, 0));
        //sumLimit(11, 39) → 50
        System.out.println(myLogic.sumLimit(11, 39));
        //sumLimit(11, 99) → 11
        System.out.println(myLogic.sumLimit(11, 99));

        //While exercise
        while(myLogic.tester())
        {
            System.out.println("running...");
        }
    }
}



