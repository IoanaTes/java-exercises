package javaExercises;

public class LogicExercises {
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (!isWeekend && cigars >= 40 && cigars <= 60)
            return true;
        else return isWeekend && cigars >= 40;
    }

    public int dateFashion(int you, int date) {
        final int yes = 2;
        final int maybe = 1;
        final int no = 0;
        if (you <= 2 || date <= 2)
            return no;
        else if (you >= 8 || date >= 8)
            return yes;
        else
            return maybe;
    }

    public boolean squirrelPlay(int temp, boolean isSummer) {
        if (!isSummer && (temp >= 60 && temp <= 90))
            return true;
        else return isSummer && (temp >= 60 && temp <= 100);
    }

    public boolean love6(int a, int b) {
        if (a == 6 || b == 6)
            return true;
        else if (a + b == 6)
            return true;
        else return Math.abs(a - b) == 6;
    }
    public int caughtSpeeding(int speed, boolean isBirthday) {
        final int noTicket = 0;
        final int smallTicket = 1;
        final int bigTicket = 2;
        if((!isBirthday && (speed > 60 && speed <= 80)) || (isBirthday && (speed > 65 && speed <= 85)))
            return smallTicket;
        else if((!isBirthday && (speed > 80)) || (isBirthday && (speed >85)))
            return bigTicket;
        else
            return noTicket;
    }



}
