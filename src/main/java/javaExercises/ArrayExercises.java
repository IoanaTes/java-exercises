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

    public boolean firstLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }

    public boolean sameFirstLast(int[] nums) {
        return (nums.length >= 1) && (nums[0] == nums[nums.length - 1]);
    }

    public int[] makePi() {
        return new int[]{3, 1, 4};
    }

    public boolean commonEnd(int[] a, int[] b) {
        return (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]);
    }

    public int sum3(int[] nums) {
        return nums[0] + nums[1] + nums[2];
    }

    public int[] rotateLeft3(int[] nums) {
        int[] numsRotated = new int[3];
        numsRotated[0] = nums[1];
        numsRotated[1] = nums[2];
        numsRotated[2] = nums[0];
        return numsRotated;
    }
    public int[] reverse3(int[] arr) {
        int[] reverseArr = new int[3];
        reverseArr[0] = arr[2];
        reverseArr[1] = arr[1];
        reverseArr[2] = arr[0];
        return reverseArr;
    }
    public int[] maxEnd3(int[] arr) {
        int max = arr[0];
        if(arr[2] > arr[0])
            max = arr[2];
        arr[0]=arr[1]=arr[2]=max;
        return arr;
    }
    public int sum2(int[] arr) {
        int sum;
        if(arr.length < 1)
            sum = 0;
        else if(arr.length == 1)
            sum = arr[0];
        else
            sum = arr[0] + arr[1];
        return sum;
    }
    public int[] middleWay(int[] a, int[] b) {
        int[] newArr = new int[2];
        newArr[0] = a[1];
        newArr[1] = b[1];
        return newArr;
    }
    public int[] makeEnds(int[] arr) {
        int[] newArr = new int[2];
        newArr[0] = arr[0];
        newArr[1] = arr[arr.length-1];
        return newArr;
    }
    public boolean has23(int[] arr) {
        return (arr[0] == 2 || arr[0] == 3 || arr[1] == 3 || arr[1] == 2);
    }
    public boolean no23(int[] arr) {
        return ((arr[0] != 2 && arr[0] != 3) && (arr[1] != 3 && arr[1] != 2));
    }
    






}
