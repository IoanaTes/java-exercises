package javaExercises;

public class ArrayExercises {

    final int[] arrControl = {2, 7, 9, 1, 4, 6, 3, 5, 8, 2, 7, 9};
    public String verifyCNP(int[] arrCNP) {
        int i;
        int sum = 0;
        int sumRemainder;
        int cfControl = 0;
        int[] multiplyArr = new int[arrCNP.length];
        for (i = 0; i < arrControl.length; i++) {
            multiplyArr[i] = arrCNP[i] * arrControl[i];
            sum += multiplyArr[i];
        }
        sumRemainder = sum % 11;
        if (sumRemainder < 10) {
            cfControl = sumRemainder;
        }
        if (sumRemainder == 10) {
            cfControl = 1;
        }
        if (cfControl == 0)
            return "CNP is correct";
        else
            return "CNP is incorrect";
    }
}
