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
        if (isAsleep)
            answer = false;
        else if (isMorning && isMom)
            answer = true;
        else if (isMorning)
            answer = false;
        return answer;
    }

    public int teaParty(int tea, int candy) {
        final int bad = 0;
        final int good = 1;
        final int great = 2;
        if ((tea >= 5 && candy >= 5) && (tea >= 2 * candy || candy >= 2 * tea))
            return great;
        else if (tea >= 5 && candy >= 5)
            return good;
        else
            return bad;
    }

    public String fizzString(String str) {
        if (str.charAt(0) == 'f' && str.substring(str.length() - 1).equals("b"))
            str = "FizzBuzz";
        if (str.charAt(0) == 'f')
            str = "Fizz";
        if (str.substring(str.length() - 1).equals("b"))
            str = "Buzz";
        return str;
    }

    public String fizzString2(int n) {
        if (n % 3 == 0 && n % 5 == 0)
            return "FizzBuzz!";
        else if (n % 3 == 0)
            return "Fizz!";
        else if (n % 5 == 0)
            return "Buzz!";
        else
            return n + "!";
    }

    public boolean twoAsOne(int a, int b, int c) {
        return ((a + b == c) || (a + c == b) || (b + c == a));
    }

    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if (!bOk && b > a && c > b)
            return true;
        else return bOk && c > b;
    }

    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if (!equalOk && c > b && b > a)
            return true;
        else return equalOk && c >= b && b >= a;
    }

    public boolean lastDigit(int a, int b, int c) {
        int lastA = a % 10;
        int lastB = b % 10;
        int lastC = c % 10;
        return (lastA == lastB || lastA == lastC || lastC == lastB);
    }

    public boolean lessBy10(int a, int b, int c) {
        return (Math.abs(a - b) >= 10 || Math.abs(b - c) >= 10 || Math.abs(a - c) >= 10);
    }

    public int withoutDoubles(int dice1, int dice2, boolean noDoubles) {
        if (noDoubles) {
            if (dice1 == dice2) {
                if (dice1 == 6)
                    dice1 = 1;
                else
                    dice1++;
            }
        }
        return dice1 + dice2;
    }

    public int maxMod5(int a, int b) {
        if (a == b)
            return 0;
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        if (a % 5 == b % 5)
            return min;
        else
            return max;
    }

    public int redTicket(int a, int b, int c) {
        int result = 0;
        if (a == b && b == c)
            result = 5;
        if (a == b && b == c && c == 2)
            result = 10;
        if (b != a && c != a)
            result = 1;
        return result;
    }

    public int greenTicket(int a, int b, int c) {
        int result = 0;
        if (a == b || a == c || b == c)
            result = 10;
        if (a == b && b == c)
            result = 20;
        return result;
    }

    public int blueTicket(int a, int b, int c) {
        int abSum = a + b;
        int acSum = a + c;
        int bcSum = b + c;
        if (abSum == 10 || acSum == 10 || bcSum == 10)
            return 10;
        else if (abSum == bcSum + 10 || abSum == acSum + 10)
            return 5;
        else
            return 0;
    }

    public boolean shareDigit(int a, int b) {
        int firstDigitA = a / 10;
        int lastDigitA = a % 10;
        int firstDigitB = b / 10;
        int lastDigitB = b % 10;
        return (((firstDigitA == firstDigitB) || (firstDigitA == lastDigitB)) || ((lastDigitA == firstDigitB) || (lastDigitA == lastDigitB)));
    }

    public int sumLimit(int a, int b) {
        int sum = a + b;
        int stringA = String.valueOf(a).length();
        int stringSum = String.valueOf(sum).length();
        if (stringA == stringSum)
            return sum;
        else if (sum > stringA)
            return a;
        else
            return 0;
    }

    public boolean tester(){
        double number = Math.random()*10;
        return (int)number%2 == 0;
    }

}
