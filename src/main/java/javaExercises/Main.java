package javaExercises;

public class Main {

    public static void main(String[] args) {

        StringExercises myString = new StringExercises();


        //Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".

        // name = "Bob" -> displays "Hello Bob!"
        System.out.println(myString.helloName("Bob"));
        //name = "Alice" -> displays "Hello Alice!"
        System.out.println(myString.helloName("Alice"));

        //Given two strings, a and b, return the result of putting them together in the order abba.

        //makeAbba("Hi", "Bye") → "HiByeByeHi"
        System.out.println(myString.makeAbba("Hi", "Bye"));
        //makeAbba("Yo", "Alice") → "YoAliceAliceYo"
        System.out.println(myString.makeAbba("Yo", "Alice"));

        //Given tag and word strings, create the HTML string with tags around the word
        // makeTags("i", "Yay") → "<i>Yay</i>"
        System.out.println(myString.makeTags("i", "Yay"));
        //makeTags("address", "here") → "<address>here</address>"
        System.out.println(myString.makeTags("address", "here"));

        /*Given an "out" string length 4, and a word,
         return a new string where the word is in the middle of the out string.*/
        //makeOutWord("<<>>", "Yay") → "<<Yay>>"
        System.out.println(myString.makeOutWord("<<>>", "Yay"));
        //makeOutWord("HHoo", "Hello") → "HHHellooo"
        System.out.println(myString.makeOutWord("HHoo", "Hello"));

        /*Given a string, return a new string made of 3 copies of the last 2 chars of the original string.
        The string length will be at least 2.*/
        //extraEnd("Hi") → "HiHiHi"
        System.out.println(myString.extraEnd("Hi"));
        //extraEnd("Candy") → "dydydy"
        System.out.println(myString.extraEnd("Candy"));

        /*Given a string, return the string made of its first two chars.
         If the string is shorter than length 2, return whatever there is.*/
        //firstTwo("Hello") → "He"
        System.out.println(myString.firstTwo("Hello"));
        //firstTwo("ab") → "ab"
        System.out.println(myString.firstTwo("ab"));
        //firstTwo("a") → "a"
        System.out.println(myString.firstTwo("a"));
        //firstTwo("") → ""
        System.out.println(myString.firstTwo(""));

        //Given a string of even length, return the first half.
        //firstHalf("WooHoo") → "Woo"
        System.out.println(myString.firstHalf("WooHoo"));
        //firstHalf("HelloThere") → "Hello"
        System.out.println(myString.firstHalf("HelloThere"));
        //firstHalf("ab") → "a"
        System.out.println(myString.firstHalf("ab"));
        //firstHalf("") → ""
        System.out.println(myString.firstHalf(""));

        /*Given a string, return a version without the first and last char.
        The string length will be at least 2.*/
        //withoutEnd("Hello") → "ell"
        System.out.println(myString.withoutEnd("Hello"));
        //withoutEnd("ab") → ""
        System.out.println(myString.withoutEnd("ab"));
        //withoutEnd("Chocolate!") → "hocolate"
        System.out.println(myString.withoutEnd("Chocolate!"));
        //withoutEnd("abc") → "b"
        System.out.println(myString.withoutEnd("abc"));

        /*Given 2 strings, a and b, return a string of the form short+long+short,
         with the shorter string on the outside and the longer string on the inside.
         The strings will not be the same length, but they may be empty.*/
        //comboString("Hello", "hi") → "hiHellohi"
        System.out.println(myString.comboString("Hello","hi"));
        //comboString("hi", "Hello") → "hiHellohi"
        System.out.println(myString.comboString("hi","Hello"));
        //comboString("aaa", "") → "aaa"
        System.out.println(myString.comboString("aaa",""));
        //comboString("aaa", "1234") → "aaa1234aaa"
        System.out.println(myString.comboString("aaa","1234"));

        /*Given 2 strings, return their concatenation, except omit the first char of each.
         The strings will be at least length 1.*/
        //nonStart("Hello", "There") → "ellohere"
        System.out.println(myString.nonStart("Hello", "There"));
        //nonStart("ab", "xy") → "by"
        System.out.println(myString.nonStart("ab", "xy"));
        //nonStart("ab", "x") → "b"
        System.out.println(myString.nonStart("ab", "x"));
        //nonStart("x", "ac") → "c"
        System.out.println(myString.nonStart("x", "ac"));
        //nonStart("a", "x") → ""
        System.out.println(myString.nonStart("a", "x"));

        /*Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end.
        The string length will be at least 2.*/
        //left2("Hello") → "lloHe"
        System.out.println(myString.left2("Hello"));
        //left2("Hi") → "Hi"
        System.out.println(myString.left2("Hi"));
        //left2("cat") → "tca"
        System.out.println(myString.left2("cat"));
        //left2("12345") → "34512"
        System.out.println(myString.left2("12345"));
        //left2("Chocolate") → "ocolateCh"
        System.out.println(myString.left2("Chocolate"));

        /*Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start.
        The string length will be at least 2.*/
        //right2("Hello") → "loHel"
        System.out.println(myString.right2("Hello"));
        //right2("Hi") → "Hi"
        System.out.println(myString.right2("Hi"));
        //right2("cat") → "atc"
        System.out.println(myString.right2("cat"));
        //right2("12345") → "45123"
        System.out.println(myString.right2("12345"));

        /*Given a string, return a string length 1 from its front, unless front is false,
         in which case return a string length 1 from its back.
         The string will be non-empty.*/
        //theEnd("Hello", true) → "H"
        System.out.println(myString.theEnd("Hello",true));
        //theEnd("Hello", false) → "o"
        System.out.println(myString.theEnd("Hello",false));
        //theEnd("x", true) → "x"
        System.out.println(myString.theEnd("x",true));
        //theEnd("x", false) → "x"
        System.out.println(myString.theEnd("x",false));
        //theEnd("1234", true) → "1"
        System.out.println(myString.theEnd("1234",true));

        /*Given a string, return a version without both the first and last char of the string.
        The string may be any length, including 0.*/
        //withoutEnd2("Hello") → "ell"
        System.out.println(myString.withoutEnd2("Hello"));
        //withoutEnd2("abc") → "b"
        System.out.println(myString.withoutEnd2("abc"));
        //withoutEnd2("ab") → ""
        System.out.println(myString.withoutEnd2("ab"));
        //withoutEnd2("a") → ""
        System.out.println(myString.withoutEnd2("a"));
        //withoutEnd2("") → ""
        System.out.println(myString.withoutEnd2(""));

        /*Given a string of even length, return a string made of the middle two chars,
         so the string "string" yields "ri".
        The string length will be at least 2.*/
        //middleTwo("string") → "ri"
        System.out.println(myString.middleTwo("string"));
        //middleTwo("code") → "od"
        System.out.println(myString.middleTwo("code"));
        //middleTwo("Practice") → "ct"
        System.out.println(myString.middleTwo("Practice"));
        //middleTwo("ab") → "ab"
        System.out.println(myString.middleTwo("ab"));
        //middleTwo("0123456789") → "45"
        System.out.println(myString.middleTwo("0123456789"));

        //Given a string, return true if it ends in "ly".
        //endsLy("oddly") → true
        System.out.println(myString.endsLy("oddly"));
        //endsLy("y") → false
        System.out.println(myString.endsLy("y"));
        //endsLy("oddy") → false
        System.out.println(myString.endsLy("oddy"));
        //endsLy("olydd") → false
        System.out.println(myString.endsLy("olydd"));
        //endsLy("ly") → true
        System.out.println(myString.endsLy("ly"));
        //endsLy("") → false
        System.out.println(myString.endsLy(""));

        /*Given a string and an int n, return a string made of the first and last n chars from the string.
        The string length will be at least n.*/
        //nTwice("Hello", 2) → "Helo"
        System.out.println(myString.nTwice("Hello",2));
        //nTwice("Chocolate", 3) → "Choate"
        System.out.println(myString.nTwice("Chocolate",3));
        //nTwice("Chocolate", 0) → ""
        System.out.println(myString.nTwice("Chocolate",0));
        //nTwice("Chocolate", 1) → "Ce"
        System.out.println(myString.nTwice("Chocolate",1));
        //nTwice("Code", 4) → "CodeCode"
        System.out.println(myString.nTwice("Code",4));

        /*Given a string and an index, return a string length 2 starting at the given index.
         If the index is too big or too small to define a string length 2, use the first 2 chars.
         The string length will be at least 2.*/
        //twoChar("java", 0) → "ja"
        System.out.println(myString.twoChar("java",0 ));
        //twoChar("java", 2) → "va"
        System.out.println(myString.twoChar("java",2));
        //twoChar("java", 3) → "ja"
        System.out.println(myString.twoChar("java",3 ));
        //twoChar("java", -1) → "ja"
        System.out.println(myString.twoChar("java",-1 ));
        //twoChar("Hello", 0) → "He"
        System.out.println(myString.twoChar("Hello",0 ));
        //twoChar("Hello", 99) → "He"
        System.out.println(myString.twoChar("Hello",99 ));

        /*Given a string of odd length, return the string length 3 from its middle.
        The string length will be at least 3.*/
        //middleThree("Candy") → "and"
        System.out.println(myString.middleThree("Candy"));
        //middleThree("and") → "and"
        System.out.println(myString.middleThree("and"));
        //middleThree("solving") → "lvi"
        System.out.println(myString.middleThree("solving"));
        //middleThree("Hi yet Hi") → "yet"
        System.out.println(myString.middleThree("Hi yet Hi"));
        //middleThree("java yet java") → "yet"
        System.out.println(myString.middleThree("java yet java"));

        /*Given a string, return true if "bad" appears starting at index 0 or 1 in the string.
        The string may be any length, including 0.*/
        //hasBad("badxx") → true
        System.out.println(myString.hasBad("badxx"));
        //hasBad("xbadxx") → true
        System.out.println(myString.hasBad("xbadxx"));
        //hasBad("xxbadxx") → false
        System.out.println(myString.hasBad("xxbadxx"));
        //hasBad("code") → false
        System.out.println(myString.hasBad("code"));
        //hasBad("bad") → true
        System.out.println(myString.hasBad("bad"));
        //hasBad("ba") → false
        System.out.println(myString.hasBad("ba"));
        //hasBad("xba") → false
        System.out.println(myString.hasBad("xba"));
        //hasBad("xbad") → true
        System.out.println(myString.hasBad("xbad"));

        /*Given a string, return a string length 2 made of its first 2 chars.
        If the string length is less than 2, use '@' for the missing chars.*/
        //atFirst("hello") → "he"
        System.out.println(myString.atFirst("hello"));
        //atFirst("hi") → "hi"
        System.out.println(myString.atFirst("hi"));
        //atFirst("h") → "h@"
        System.out.println(myString.atFirst("h"));
        //atFirst("") → "@@"
        System.out.println(myString.atFirst(""));

        /*Given 2 strings, a and b, return a new string made of the first char of a and the last char of b.
         If either string is length 0, use '@' for its missing char.*/
        //lastChars("last", "chars") → "ls"
        System.out.println(myString.lastChars("last","chars"));
        //lastChars("yo", "java") → "ya"
        System.out.println(myString.lastChars("yo","java"));
        //lastChars("hi", "") → "h@"
        System.out.println(myString.lastChars("hi",""));
        //lastChars("", "hello") → "@o"
        System.out.println(myString.lastChars("","hello"));
        //lastChars("", "") → "@@"
        System.out.println(myString.lastChars("",""));

    }

}
