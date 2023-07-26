package javaExercises;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayExercises myArr = new ArrayExercises();
//        int [] cnp = {2,9,9,0,2,1,9,4,6,9,0,0,0};
//        System.out.println(myArr.verifyCNP(cnp));

        //Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.
        //firstLast6([1, 2, 6]) → true
        System.out.println(myArr.firstLast6(new int[]{1, 2, 6}));
        //firstLast6([6, 1, 2, 3]) → true
        System.out.println(myArr.firstLast6(new int[]{6, 1, 2, 3}));
        //firstLast6([13, 6, 1, 2, 3]) → false
        System.out.println(myArr.firstLast6(new int[]{13, 6, 1, 2, 3}));

        //Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.
        //sameFirstLast([1, 2, 3]) → false
        System.out.println(myArr.sameFirstLast(new int[]{1, 2, 3}));
        //sameFirstLast([1, 2, 3, 1]) → true
        System.out.println(myArr.sameFirstLast(new int[]{1, 2, 3, 1}));
        //sameFirstLast([1, 2, 1]) → true
        System.out.println(myArr.sameFirstLast(new int[]{1, 2, 1}));
        //sameFirstLast([7]) → true
        System.out.println(myArr.sameFirstLast(new int[]{7}));
        //sameFirstLast([]) → false
        System.out.println(myArr.sameFirstLast(new int[]{}));

        //Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
        //makePi() → [3, 1, 4]
        System.out.println(Arrays.toString(myArr.makePi()));

        //Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.
        //commonEnd([1, 2, 3], [7, 3]) → true
        System.out.println(myArr.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3}));
        //commonEnd([1, 2, 3], [7, 3, 2]) → false
        System.out.println(myArr.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3, 2}));
        //commonEnd([1, 2, 3], [1, 3]) → true
        System.out.println(myArr.commonEnd(new int[]{1, 2, 3}, new int[]{1, 3}));
        //commonEnd([1, 2, 3], [1]) → true
        System.out.println(myArr.commonEnd(new int[]{1, 2, 3}, new int[]{1}));

        //Given an array of ints length 3, return the sum of all the elements.
        //sum3([1, 2, 3]) → 6
        System.out.println(myArr.sum3(new int[]{1, 2, 3}));
        //sum3([5, 11, 2]) → 18
        System.out.println(myArr.sum3(new int[]{5, 11, 2}));
        //sum3([7, 0, 0]) → 7
        System.out.println(myArr.sum3(new int[]{7, 0, 0}));

        //Given an array of ints length 3, return an array with the elements "rotated left".
        //rotateLeft3([1, 2, 3]) → [2, 3, 1]
        System.out.println(Arrays.toString(myArr.rotateLeft3(new int[]{1, 2, 3})));
        //rotateLeft3([5, 11, 9]) → [11, 9, 5]
        System.out.println(Arrays.toString(myArr.rotateLeft3(new int[]{5, 11, 9})));
        //rotateLeft3([7, 0, 0]) → [0, 0, 7]
        System.out.println(Arrays.toString(myArr.rotateLeft3(new int[]{7, 0, 0})));

        //Given an array of ints length 3, return a new array with the elements in reverse order.
        //reverse3([1, 2, 3]) → [3, 2, 1]
        System.out.println(Arrays.toString(myArr.reverse3(new int[]{1, 2, 3})));
        //reverse3([5, 11, 9]) → [9, 11, 5]
        System.out.println(Arrays.toString(myArr.reverse3(new int[]{5, 11, 9})));
        //reverse3([7, 0, 0]) → [0, 0, 7]
        System.out.println(Arrays.toString(myArr.reverse3(new int[]{7, 0, 0})));

        /*Given an array of ints length 3, figure out which is larger, the first or last element in the array,
        and set all the other elements to be that value. Return the changed array.*/
        //maxEnd3([1, 2, 3]) → [3, 3, 3]
        System.out.println(Arrays.toString(myArr.maxEnd3(new int[]{1, 2, 3})));
        //maxEnd3([11, 5, 9]) → [11, 11, 11]
        System.out.println(Arrays.toString(myArr.maxEnd3(new int[]{11, 5, 9})));
        //maxEnd3([2, 11, 3]) → [3, 3, 3]
        System.out.println(Arrays.toString(myArr.maxEnd3(new int[]{2, 11, 3})));

        /*Given an array of ints, return the sum of the first 2 elements in the array.
        If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.*/
        //sum2([1, 2, 3]) → 3
        System.out.println(myArr.sum2(new int[]{1,2,3}));
        //sum2([1, 1]) → 2
        System.out.println(myArr.sum2(new int[]{1,1}));
        //sum2([1, 1, 1, 1]) → 2
        System.out.println(myArr.sum2(new int[]{1,1,1,1}));
        //sum2([1]) → 1
        System.out.println(myArr.sum2(new int[]{1}));
        //sum2([]) → 0
        System.out.println(myArr.sum2(new int[]{}));
        
        //Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
        //middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
        System.out.println(Arrays.toString(myArr.middleWay(new int[]{1, 2, 3}, new int[]{4, 5, 6})));
        //middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
        System.out.println(Arrays.toString(myArr.middleWay(new int[]{7, 7, 7}, new int[]{3, 8, 0})));
        //middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
        System.out.println(Arrays.toString(myArr.middleWay(new int[]{5, 2, 9}, new int[]{1, 4, 5})));

        //Given an int array length 2, return true if it contains a 2 or a 3.
        //has23([2, 5]) → true
        System.out.println(myArr.has23(new int[]{2,5}));
        //has23([4, 3]) → true
        System.out.println(myArr.has23(new int[]{4,3}));
        //has23([4, 5]) → false
        System.out.println(myArr.has23(new int[]{4,5}));

        //Given an int array length 2, return true if it does not contain a 2 or 3.
        //no23([4, 5]) → true
        System.out.println(myArr.no23(new int[]{4,5}));
        //no23([4, 2]) → false
        System.out.println(myArr.no23(new int[]{4,2}));
        //no23([3, 5]) → false
        System.out.println(myArr.no23(new int[]{3,5}));

    }
}