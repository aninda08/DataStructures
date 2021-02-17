package com.aninda.datastructure;

import com.aninda.datastructure.array.ArrayUtils;
import com.aninda.datastructure.array.SortedArray;

import java.util.Arrays;


public class DemoHandler {
    public static void main(String args[]) {
        System.out.println("Welcome to DataStructures on java @AnindaSundarChakraborty");

        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };

        System.out.println("Original Array : " + Arrays.toString(arr));

        System.out.println("Rotated array  ----> " + Arrays.toString(ArrayUtils.leftRotation(arr, 2)));
    }
}
