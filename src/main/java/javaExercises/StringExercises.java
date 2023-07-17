package javaExercises;

public class StringExercises {
    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2, 4);
    }

    public String extraEnd(String str) {
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < 3; i++)
            string.append(str.substring((str.length() - 2)));
        return string.toString();
    }

    public String firstTwo(String str) {
        if (str.length() < 2)
            return str;
        else
            return str.substring(0, 2);
    }

    public String firstHalf(String str) {
        return str.substring(0, (str.length()) / 2);
    }

    public String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    public String comboString(String a, String b) {
        if (a.length() > b.length())
            return b + a + b;
        else
            return a + b + a;
    }

    public String nonStart(String a, String b) {
        String aWithoutFirst = a.substring(1);
        String bWithoutFirst = b.substring(1);
        return aWithoutFirst + bWithoutFirst;
    }

    public String left2(String str) {
        String firstTwo = str.substring(0, 2);
        String afterFirstTwo = str.substring(2);
        return afterFirstTwo.concat(firstTwo);
    }

    public String right2(String str) {
        String lastTwo = str.substring(str.length() - 2);
        String beforeLastTwo = str.substring(0, str.length() - 2);
        return lastTwo + beforeLastTwo;
    }

    public String theEnd(String str, boolean front) {
        if (front)
            return str.substring(0, 1);
        else
            return str.substring(str.length() - 1);
    }

    public String withoutEnd2(String str) {
        if (str.length() < 2)
            return "";
        else
            return str.substring(1, str.length() - 1);
    }

    public String middleTwo(String str) {
        String lastCharFirstHalf = str.substring((str.length() / 2) - 1, str.length() / 2);
        String firstCharLastHalf = str.substring((str.length() / 2), (str.length() / 2) + 1);
        return lastCharFirstHalf + firstCharLastHalf;
    }

    public boolean endsLy(String str) {
        if (str.length() < 2) {
            return false;
        } else return str.substring(str.length() - 2).equals("ly");
    }

    public String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n);
    }

    public String twoChar(String str, int index) {
        if (index < 0 || index + 2 > str.length())
            return str.substring(0, 2);
        else
            return str.substring(index, index + 2);
    }

    public String middleThree(String str) {
        int middleLength = str.length() / 2;
        char atMiddle = str.charAt(middleLength);
        char beforeMiddle = str.charAt(middleLength - 1);
        char afterMiddle = str.charAt(middleLength + 1);
        return String.valueOf(beforeMiddle) + atMiddle + afterMiddle;
    }

    public boolean hasBad(String str) {
        if (str.length() == 3)
            return str.substring(0, 3).equals("bad");
        else if (str.length() >= 4)
            return str.substring(0, 3).equals("bad") || str.substring(1, 4).equals("bad");
        else
            return false;
    }

    public String atFirst(String str) {
        if (str.length() >= 2)
            return str.substring(0, 2);
        if (str.length() == 1)
            return str + "@";
        else
            return "@@";
    }

    public String lastChars(String a, String b) {
        if (a.length() == 0)
            a = "@";
        if (b.length() == 0)
            b = "@";
        return a.substring(0, 1) + b.substring(b.length() - 1);
    }

    public String conCat(String a, String b) {
        if (a.length() == 0)
            return b;
        if (b.length() == 0)
            return a;
        char lastCharA = a.charAt(a.length() - 1);
        char firstCharB = b.charAt(0);
        if (lastCharA != firstCharB)
            return a.concat(b);
        else
            return a.concat(b.substring(1));
    }

    public String lastTwo(String str) {
        if (str.length() >= 2) {
            String lastChar = str.substring(str.length() - 1);
            String beforeTheLastChar = str.substring(str.length() - 2, str.length() - 1);
            String swappedChars = lastChar.concat(beforeTheLastChar);
            return str.substring(0, str.length() - 2) + swappedChars;
        } else
            return str;
    }

    public String seeColor(String str) {

        if ((str.length() >= 3 && (str.substring(0, 3)).equals("red")))
            return str.substring(0, 3);
        else if ((str.length() >= 4 && (str.substring(0, 4)).equals("blue")))
            return str.substring(0, 4);
        else
            return "";
    }

    public boolean frontAgain(String str) {
        return (str.length() >= 2 && (str.substring(0, 2)).equals(str.substring(str.length() - 2)));
    }

    public String minCat(String a, String b) {
        if (a.length() == b.length())
            return a.concat(b);
        else if (a.length() > b.length())
            return (a.substring((a.length() - b.length())).concat(b));
        else
            return a.concat(b.substring((b.length() - a.length())));
    }

    public String extraFront(String str) {
        String firstTwo;
        if (str.length() >= 2) {
            firstTwo = str.substring(0, 2);
            return firstTwo + firstTwo + firstTwo;
        } else
            return str + str + str;
    }
    public String without2(String str) {
        if(str.length() == 2 )
            return "";
        else if((str.length() > 2 && (str.substring(0,2)).equals(str.substring(str.length()-2))))
            return (str.substring(2));
        else
            return str;
    }
    public String deFront(String str) {
        if(str.length() < 2)
            return "";
        else if((str.charAt(0) == 'a') && (str.charAt(1) == 'b'))
            return str;
        else if(str.charAt(0) == 'a')
            return str.charAt(0) +str.substring(2);
        else if(str.charAt(1) == 'b')
            return str.charAt(1) +str.substring(2);
        else
            return str.substring(2);
    }
    public String withoutX(String str) {
        if(str.length() == 0)
            return "";
        String lastChar = str.substring(str.length()-1);
        String firstChar = str.substring(0,1);
        if(firstChar.equals("x") && lastChar.equals("x"))
            return str.substring(1,str.length()-1);
        else if(firstChar.equals("x"))
            return str.substring(1);
        else if(lastChar.equals("x"))
            return str.substring(0,str.length()-1);
        else
            return str;
    }




}

