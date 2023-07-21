package javaExercises;

public class ArrayExercises {

    int[] arrControl = {2, 7, 9, 1, 4, 6, 3, 5, 8, 2, 7, 9};
    int[] arrCNP = new int[13];

    public int[] verifyCNP(int[] arrCNP) {
        int i;
        int sum = 0;
        int sumRemainder = 0;
        int cfControl = 0;
        int[] multiplyArr = new int[arrCNP.length];
        for (i = 0; i < arrControl.length; i++) {
            multiplyArr[i] = arrCNP[i] * arrControl[i];
            sum = sum + multiplyArr[i];
        }
        sumRemainder = sum % 11;
        if (sumRemainder < 10) {
            cfControl = sumRemainder;
            arrCNP[12] = cfControl;
        }if(sumRemainder == 10){
            cfControl = 1;
            arrCNP[13] = cfControl;
        }
        return arrCNP;

    }
}
