package javaExercises;

public class MainClass {

    public static void main(String[] args) {
        ArrayExercises myArr = new ArrayExercises();
        int [] cnp = {2,9,9,0,2,1,9,4,6,9,0,0,0};
        System.out.println(myArr.verifyCNP(cnp));
    }
}