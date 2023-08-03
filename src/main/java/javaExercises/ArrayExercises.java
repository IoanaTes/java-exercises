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
        if (arr[2] > arr[0])
            max = arr[2];
        arr[0] = arr[1] = arr[2] = max;
        return arr;
    }

    public int sum2(int[] arr) {
        int sum;
        if (arr.length < 1)
            sum = 0;
        else if (arr.length == 1)
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
        newArr[1] = arr[arr.length - 1];
        return newArr;
    }

    public boolean has23(int[] arr) {
        return (arr[0] == 2 || arr[0] == 3 || arr[1] == 3 || arr[1] == 2);
    }

    public boolean no23(int[] arr) {
        return ((arr[0] != 2 && arr[0] != 3) && (arr[1] != 3 && arr[1] != 2));
    }

    public int[] makeLast(int[] arr) {
        int[] newArr = new int[2 * arr.length];
        newArr[newArr.length - 1] = arr[arr.length - 1];
        return newArr;
    }

    public boolean double23(int[] arr) {
        int count2 = 0;
        int count3 = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == 2)
                count2++;
            if (arr[i] == 3)
                count3++;
        }
        return count2 == 2 || count3 == 2;
    }

    public int[] fix23(int[] arr) {
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == 2 && arr[i + 1] == 3) {
                arr[i + 1] = 0;
                break;
            }
        }
        return arr;
    }

    public int start1(int[] a, int[] b) {
        int count = 0;
        if (a.length > 0 && a[0] == 1)
            count++;
        if (b.length > 0 && b[0] == 1)
            count++;
        return count;
    }

    public int[] biggerTwo(int[] a, int[] b) {
        int sumA = 0;
        int sumB = 0;
        for (int i = 0; i <= a.length - 1; i++)
            sumA = sumA + a[i];
        for (int j = 0; j <= a.length - 1; j++)
            sumB = sumB + b[j];
        if (sumB > sumA)
            return b;
        else
            return a;
    }

    public int[] makeMiddle(int[] a) {
        int[] newArr = new int[2];
        newArr[0] = a[a.length / 2 - 1];
        newArr[1] = a[a.length / 2];
        return newArr;
    }

    public int[] plusTwo(int[] a, int[] b) {
        int[] newArr = new int[4];
        newArr[0] = a[0];
        newArr[1] = a[1];
        newArr[2] = b[0];
        newArr[3] = b[1];
        return newArr;
    }

    public int[] swapEnds(int[] arr) {
        int aux;
        aux = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = aux;
        return arr;
    }

    public int[] midThree(int[] arr) {
        int[] newArr = new int[3];
        int i;
        for (i = 0; i <= arr.length; i++) {
            if (i == (arr.length / 2) - 1) {
                newArr[0] = arr[i];
            }
            if (i == (arr.length / 2)) {
                newArr[1] = arr[i];
            }
            if (i == (arr.length / 2) + 1) {
                newArr[2] = arr[i];
            }
        }
        return newArr;
    }

    public int maxTriple(int[] arr) {
        int max = arr[0];
        if (arr[(arr.length / 2)] > max)
            max = arr[(arr.length / 2)];
        if (arr[(arr.length - 1)] > max)
            max = arr[(arr.length - 1)];
        return max;
    }

    public int[] frontPiece(int[] a) {
        int[] newArr = new int[2];
        if (a.length > 2) {
            for (int i = 0; i <= 1; i++) {
                newArr[i] = a[i];
            }
            return newArr;
        } else
            return a;
    }
    public boolean unlucky1(int[] a) {
        int unlucky = 0;
        if(a.length >= 2)
            if((a[0] == 1 && a[1] == 3)||(a[1] == 1 && a[2] == 3)||(a[a.length-2] == 1 && a[a.length-1] == 3))
                unlucky++;
        return unlucky == 1;
    }

}









