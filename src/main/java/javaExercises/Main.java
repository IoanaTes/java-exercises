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
        System.out.println(myArr.sum2(new int[]{1, 2, 3}));
        //sum2([1, 1]) → 2
        System.out.println(myArr.sum2(new int[]{1, 1}));
        //sum2([1, 1, 1, 1]) → 2
        System.out.println(myArr.sum2(new int[]{1, 1, 1, 1}));
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

        //Given an array of ints, return a new array length 2 containing the first and last elements from the original array.
        //The original array will be length 1 or more.
        //makeEnds([1, 2, 3]) → [1, 3]
        System.out.println(Arrays.toString(myArr.makeEnds(new int[]{1, 2, 3})));
        //makeEnds([1, 2, 3, 4]) → [1, 4]
        System.out.println(Arrays.toString(myArr.makeEnds(new int[]{1, 2, 3, 4})));
        //makeEnds([7, 4, 6, 2]) → [7, 2]
        System.out.println(Arrays.toString(myArr.makeEnds(new int[]{7, 4, 6, 2})));
        //makeEnds([7, 4]) → [7, 4]
        System.out.println(Arrays.toString(myArr.makeEnds(new int[]{7, 4})));
        //makeEnds([7]) → [7, 7]
        System.out.println(Arrays.toString(myArr.makeEnds(new int[]{7, 7})));

        //Given an int array length 2, return true if it contains a 2 or a 3.
        //has23([2, 5]) → true
        System.out.println(myArr.has23(new int[]{2, 5}));
        //has23([4, 3]) → true
        System.out.println(myArr.has23(new int[]{4, 3}));
        //has23([4, 5]) → false
        System.out.println(myArr.has23(new int[]{4, 5}));

        //Given an int array length 2, return true if it does not contain a 2 or 3.
        //no23([4, 5]) → true
        System.out.println(myArr.no23(new int[]{4, 5}));
        //no23([4, 2]) → false
        System.out.println(myArr.no23(new int[]{4, 2}));
        //no23([3, 5]) → false
        System.out.println(myArr.no23(new int[]{3, 5}));

        //Given an int array, return a new array with double the length where
        //its last element is the same as the original array, and all the other elements are 0.
        //The original array will be length 1 or more.
        //makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
        System.out.println(Arrays.toString(myArr.makeLast(new int[]{4, 5, 6})));
        //makeLast([1, 2]) → [0, 0, 0, 2]
        System.out.println(Arrays.toString(myArr.makeLast(new int[]{1, 2})));
        //makeLast([3]) → [0, 3]
        System.out.println(Arrays.toString(myArr.makeLast(new int[]{3})));
        //makeLast([0]) → [0, 0]
        System.out.println(Arrays.toString(myArr.makeLast(new int[]{0})));
        //makeLast([7, 7, 7]) → [0, 0, 0, 0, 0, 7]
        System.out.println(Arrays.toString(myArr.makeLast(new int[]{7, 7, 7})));

        /*Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.*/
        //double23([2, 2]) → true
        System.out.println(myArr.double23(new int[]{2, 2}));
        //double23([3, 3]) → true
        System.out.println(myArr.double23(new int[]{3, 3}));
        //double23([2, 3]) → false
        System.out.println(myArr.double23(new int[]{2, 3}));
        //double23([3, 2]) → false
        System.out.println(myArr.double23(new int[]{3, 2}));
        //double23([4, 5]) → false
        System.out.println(myArr.double23(new int[]{4, 5}));

        //Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0.
        //Return the changed array.
        //fix23([1, 2, 3]) → [1, 2, 0]
        System.out.println(Arrays.toString(myArr.fix23(new int[]{1, 2, 3})));
        //fix23([2, 3, 5]) → [2, 0, 5]
        System.out.println(Arrays.toString(myArr.fix23(new int[]{2, 3, 5})));
        //fix23([1, 2, 1]) → [1, 2, 1]
        System.out.println(Arrays.toString(myArr.fix23(new int[]{1, 2, 1})));
        //fix23([3, 2, 1]) → [3, 2, 1]
        System.out.println(Arrays.toString(myArr.fix23(new int[]{3, 2, 1})));

        //Start with 2 int arrays, a and b, of any length.
        //Return how many of the arrays have 1 as their first element.
        //start1([1, 2, 3], [1, 3]) → 2
        System.out.println(myArr.start1(new int[]{1, 2, 3}, new int[]{1, 3}));
        //start1([7, 2, 3], [1]) → 1
        System.out.println(myArr.start1(new int[]{7, 2, 3}, new int[]{1}));
        //start1([1, 2], []) → 1
        System.out.println(myArr.start1(new int[]{1, 2}, new int[]{}));
        //start1([], [1, 2]) → 1
        System.out.println(myArr.start1(new int[]{}, new int[]{1, 3}));
        //start1([7], []) → 0
        System.out.println(myArr.start1(new int[]{7}, new int[]{}));
        //start1([1], [1]) → 2
        System.out.println(myArr.start1(new int[]{1}, new int[]{1}));
        //start1([], []) → 0
        System.out.println(myArr.start1(new int[]{}, new int[]{}));

        //Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array.
        //Return the array which has the largest sum. In event of a tie, return a.
        //biggerTwo([1, 2], [3, 4]) → [3, 4]
        System.out.println(Arrays.toString(myArr.biggerTwo(new int[]{1, 2}, new int[]{3, 4})));
        //biggerTwo([3, 4], [1, 2]) → [3, 4]
        System.out.println(Arrays.toString(myArr.biggerTwo(new int[]{3, 4}, new int[]{1, 2})));
        //biggerTwo([1, 1], [1, 2]) → [1, 2]
        System.out.println(Arrays.toString(myArr.biggerTwo(new int[]{1, 1}, new int[]{1, 2})));
        //biggerTwo([2, 1], [1, 1]) → [2, 1]
        System.out.println(Arrays.toString(myArr.biggerTwo(new int[]{2, 1}, new int[]{1, 1})));
        //biggerTwo([2, 2], [1, 3]) → [2, 2]
        System.out.println(Arrays.toString(myArr.biggerTwo(new int[]{2, 2}, new int[]{1, 3})));
        //biggerTwo([1, 3], [1, 3]) → [1, 3]
        System.out.println(Arrays.toString(myArr.biggerTwo(new int[]{1, 3}, new int[]{1, 3})));

        /*Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array.
         The original array will be length 2 or more.*/
        //makeMiddle([1, 2, 3, 4]) → [2, 3]
        System.out.println(Arrays.toString(myArr.makeMiddle(new int[]{1, 2, 3, 4})));
        //makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
        System.out.println(Arrays.toString(myArr.makeMiddle(new int[]{7, 1, 2, 3, 4, 9})));
        //makeMiddle([1, 2]) → [1, 2]
        System.out.println(Arrays.toString(myArr.makeMiddle(new int[]{1, 2})));

        //Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.
        //plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
        System.out.println(Arrays.toString(myArr.plusTwo(new int[]{1, 2}, new int[]{3, 4})));
        //plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
        System.out.println(Arrays.toString(myArr.plusTwo(new int[]{4, 4}, new int[]{2, 2})));
        //plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]
        System.out.println(Arrays.toString(myArr.plusTwo(new int[]{9, 2}, new int[]{3, 4})));

        //Given an array of ints, swap the first and last elements in the array. Return the modified array. The array length will be at least 1.
        //swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
        System.out.println(Arrays.toString(myArr.swapEnds(new int[]{1, 2, 3, 4})));
        //swapEnds([1, 2, 3]) → [3, 2, 1]
        System.out.println(Arrays.toString(myArr.swapEnds(new int[]{1, 2, 3})));
        //swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]
        System.out.println(Arrays.toString(myArr.swapEnds(new int[]{8, 6, 7, 9, 5})));
        //swapEnds([1]) → [1]
        System.out.println(Arrays.toString(myArr.swapEnds(new int[]{1})));

        //Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array.
        //The array length will be at least 3.
        //midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
        System.out.println(Arrays.toString(myArr.midThree(new int[]{1, 2, 3, 4, 5})));
        //midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
        System.out.println(Arrays.toString(myArr.midThree(new int[]{8, 6, 7, 5, 3, 0, 9})));
        //midThree([1, 2, 3]) → [1, 2, 3]
        System.out.println(Arrays.toString(myArr.midThree(new int[]{1, 2, 3})));

        /*Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest.
        The array length will be a least 1.*/
        //maxTriple([1, 2, 3]) → 3
        System.out.println(myArr.maxTriple(new int[]{1, 2, 3}));
        //maxTriple([1, 5, 3]) → 5
        System.out.println(myArr.maxTriple(new int[]{1, 5, 3}));
        //maxTriple([5, 2, 3]) → 5
        System.out.println(myArr.maxTriple(new int[]{5, 2, 3}));
        //maxTriple([5, 1, 7, 3, 7, 8, 1]) → 5
        System.out.println(myArr.maxTriple(new int[]{5, 1, 7, 3, 7, 8, 1}));

        /*Given an int array of any length, return a new array of its first 2 elements.
        If the array is smaller than length 2, use whatever elements are present.*/
        //frontPiece([1, 2, 3]) → [1, 2]
        System.out.println(Arrays.toString(myArr.frontPiece(new int[]{1, 2, 3})));
        //frontPiece([1, 2]) → [1, 2]
        System.out.println(Arrays.toString(myArr.frontPiece(new int[]{1, 2})));
        //frontPiece([1]) → [1]
        System.out.println(Arrays.toString(myArr.frontPiece(new int[]{1})));
        //frontPiece([3, 1, 4, 1, 5]) → [3, 1]
        System.out.println(Arrays.toString(myArr.frontPiece(new int[]{3, 1, 4, 1, 5})));

        /*We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
        Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.*/
        //unlucky1([1, 3, 4, 5]) → true
        System.out.println(myArr.unlucky1(new int[]{1, 3, 4, 5}));
        //unlucky1([2, 1, 3, 4, 5]) → true
        System.out.println(myArr.unlucky1(new int[]{2, 1, 3, 4, 5}));
        //unlucky1([1, 1, 1]) → false
        System.out.println(myArr.unlucky1(new int[]{1, 1, 1}));
        //unlucky1([1, 3]) → true
        System.out.println(myArr.unlucky1(new int[]{1, 3}));
        //unlucky1([1, 4]) → false
        System.out.println(myArr.unlucky1(new int[]{1, 4}));
        //unlucky1([1]) → false
        System.out.println(myArr.unlucky1(new int[]{1}));
        //unlucky1([]) → false
        System.out.println(myArr.unlucky1(new int[]{}));

        /*Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, the elements from a followed by the elements from b.
        The arrays may be any length, including 0, but there will be 2 or more elements available between the 2 arrays.*/
        //make2([4, 5], [1, 2, 3]) → [4, 5]
        System.out.println(Arrays.toString(myArr.make2(new int[]{4, 5}, new int[]{1, 2, 3})));
        //make2([4], [1, 2, 3]) → [4, 1]
        System.out.println(Arrays.toString(myArr.make2(new int[]{4}, new int[]{1, 2, 3})));
        //make2([], [1, 2]) → [1, 2]
        System.out.println(Arrays.toString(myArr.make2(new int[]{}, new int[]{1, 2})));

        /*Given 2 int arrays, a and b, of any length, return a new array with the first element of each array.
        If either array is length 0, ignore that array.*/
        //front11([1, 2, 3], [7, 9, 8]) → [1, 7]
        System.out.println(Arrays.toString(myArr.front11(new int[]{1, 2, 3}, new int[]{7, 9, 8})));
        //front11([1], [2]) → [1, 2]
        System.out.println(Arrays.toString(myArr.front11(new int[]{1}, new int[]{2})));
        //front11([1, 7], []) → [1]
        System.out.println(Arrays.toString(myArr.front11(new int[]{1, 7}, new int[]{})));
        //front11([], [2, 8]) → [2]
        System.out.println(Arrays.toString(myArr.front11(new int[]{}, new int[]{2, 8})));
        //front11([], []) → []
        System.out.println(Arrays.toString(myArr.front11(new int[]{}, new int[]{})));
    }
}