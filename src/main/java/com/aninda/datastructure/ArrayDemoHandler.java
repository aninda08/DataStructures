package com.aninda.datastructure;

import com.aninda.datastructure.array.ArrayUtils;
import com.aninda.datastructure.array.SortedArray;

import java.util.Arrays;

public class ArrayDemoHandler {
    public static void sortedArrayDemo() {
        //Testing our first Sorted Array Class
        SortedArray<Integer> array = new SortedArray<Integer>(10);

        System.out.println("Before insertion : " + array);

        //inserting items in Array
        array.insert(2);
        array.insert(5);

        array.insert(3);
        array.insert(6);
        array.insert(1);

        System.out.println("After inserting items in Sorted Array : " + array);

        System.out.println("Search for item - 3 : " + array.binarySearch(3));

        array.delete(3);
        System.out.println("Deleting 3 from array");
        System.out.println("After deleting item 3 in Sorted Array : " + array);

        System.out.println("Search for item - 13 : " + array.binarySearch(13));

    }


    public static void reverseArrayDemo() {
        int arr[] = {1,4,5,2,3};

        System.out.println("Original Array" + Arrays.toString(arr));

        System.out.println("Array after reverse" + Arrays.toString(ArrayUtils.reverse(arr)));
    }

    public static void leadersDemo() {
        int arr[] = {16, 17, 4, 3, 5, 2};

        System.out.println("Original Array" + Arrays.toString(arr));

        ArrayUtils.leaders(arr);
    }

    public static void searchPair() {

        int[] arr = {1,2,3,4,5,6,7};

        System.out.println("Original Array : " + Arrays.toString(arr));

        System.out.println("Search pair for sum:3 ----> ");

        ArrayUtils.hasPairs(arr, 3);
    }

    public static void hasMajorityElement() {
        int[] arr = {1,2,3,3,5,3,3};

        System.out.println("Original Array : " + Arrays.toString(arr));

        System.out.println("Search Majority Element ----> ");

        ArrayUtils.majorityElement(arr);
    }

    public static void hasOddOccurence() {
        int[] arr = {2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};

        System.out.println("Original Array : " + Arrays.toString(arr));

        System.out.println("Search odd occurence in array  ----> " + ArrayUtils.getOddOccurrence(arr));
    }

    public static void largestSubarraySum() {
        int[] arr = {-2, -3, 4, 0, -2, 1, 5, -3};

        System.out.println("Original Array : " + Arrays.toString(arr));

        System.out.println("Largest sum contiguous subarray in array  ----> " + ArrayUtils.largestSubArraySum(arr));
    }

    public static void missingNumber() {
        int[] arr = {1, 2, 4, 6, 3, 7, 8};

        System.out.println("Original Array : " + Arrays.toString(arr));

        System.out.println("The Missing number in the array  ----> " + ArrayUtils.missingNumber(arr));
    }

    public static void searchInSortedRotatedArray() {
        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};

        System.out.println("Original Array : " + Arrays.toString(arr));

        System.out.println("The index of item:3 in the array  ----> " + ArrayUtils.searchInSortedRotatedArray(arr, 3));
    }

    public static void mergeTwoArray() {
        int mPlusN[] = { 2, 8, -1, -1, -1, 13, -1, 15, 20 };
        int N[] = { 5, 7, 9, 25 };

        System.out.println("Original Array of (m+n) : " + Arrays.toString(mPlusN));
        System.out.println("Original Array of N : " + Arrays.toString(N));

        System.out.println("The index of item:3 in the array  ----> " + Arrays.toString(ArrayUtils.mergeTwoArray(mPlusN, N)));

    }

    public static void rotateArray() {
        System.out.println("Welcome to DataStructures on java @AnindaSundarChakraborty");

        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };

        System.out.println("Original Array : " + Arrays.toString(arr));

        System.out.println("Rotated array  ----> " + Arrays.toString(ArrayUtils.arrayRotation(arr, 2)));
    }

    public static void rotateArrayRev() {
        System.out.println("Welcome to DataStructures on java @AnindaSundarChakraborty");

        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };

        System.out.println("Original Array : " + Arrays.toString(arr));

        System.out.println("Rotated array  ----> " + Arrays.toString(ArrayUtils.arrayRotation(arr, 2)));
    }
}
