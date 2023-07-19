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
        if ((!isBirthday && (speed > 60 && speed <= 80)) || (isBirthday && (speed > 65 && speed <= 85)))
            return smallTicket;
        else if ((!isBirthday && (speed > 80)) || (isBirthday && (speed > 85)))
            return bigTicket;
        else
            return noTicket;
    }

    public int sortaSum(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 19)
            return 20;
        else
            return sum;
    }

    public String alarmClock(int day, boolean vacation) {
        String alarm = "";
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                if (!vacation)
                    alarm = "7:00";
                else
                    alarm = "10:00";
                break;
            case 6:
            case 0:
                if (!vacation)
                    alarm = "10:00";
                else
                    alarm = "off";
                break;
            default:
                System.out.println("You've not entered a valid day. Try again.");
        }
        return alarm;
    }

    public boolean specialEleven(int n) {
        return (n >= 0) && (n % 11 == 0 || n % 11 == 1);
    }

    public boolean in1To10(int n, boolean outsideMode) {
        return (!outsideMode && (n >= 1 && n <= 10)) || (outsideMode && (n <= 1 || n >= 10));
    }

    public boolean more20(int n) {
        return (((n % 20 == 1) || (n % 20 == 2)));
    }

    public boolean old35(int n) {
        return (n > 0 && ((n % 3 == 0 && n % 5 != 0) || (n % 3 != 0 && n % 5 == 0)));
    }

    public boolean less20(int n) {
        return ((n + 1) % 20 == 0 || (n + 2) % 20 == 0);
    }

    public boolean nearTen(int num) {
        return (num % 10 == 0 || (num + 1) % 10 == 0 || (num + 2) % 10 == 0 || (num - 1) % 10 == 0 || (num - 2) % 10 == 0);
    }

    public int teenSum(int a, int b) {
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19))
            return 19;
        else
            return a + b;
    }

    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        boolean answer = true;
        if (!isAsleep) {
            if (!isMorning) {
                answer = true;
            } else if (isMom) {
                answer = true;
            } else
                answer = false;
        } else {
            answer = false;
        }
        return answer;
    }


}
