package com.aninda.datastructure.array;

import java.util.HashMap;
import java.util.HashSet;

public class ArrayUtils {
    public static int[] reverse(int[] arr) {
        return reverse(arr, 0, (arr.length - 1));
    }
    public static int[] reverse(int[] arr, int low, int high) {
        if(low >= high)
            return arr;

        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;

        return reverse(arr, (low + 1), (high - 1));
    }

    public static void leaders(int[] arr) {
        leaders(arr, (arr.length - 2), arr[arr.length - 1]);
    }
    public static void leaders(int[] arr, int high, int leader) {
        if( high < 0) {
            System.out.print(leader + " ");
            return;
        }
        if(arr[high] > leader) {
            leaders(arr, (high - 1), arr[high]);
            System.out.print(leader + " ");
        }
        else
            leaders(arr, (high - 1), leader);
    }


    public static void hasPairs(int[] arr, int sum) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < arr.length; i++) {
            int pair2 = sum - arr[i];

            if(set.contains(pair2)) {
                System.out.println("Pair with given sum :: " + sum + " is (" + arr[i]
                        + ", " + pair2 + ")");
                return;
            }

            set.add(arr[i]);
        }
        System.out.println("No Valid pair exists");

    }

    public static void majorityElement(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length ; i++) {
            if(map.containsKey(arr[i])) {
                int frequency = map.get(arr[i]);
                if((frequency + 1) > (arr.length / 2)) {
                    System.out.println("Majority element found : " + arr[i]);
                    return;
                }
                map.put(arr[i], (frequency + 1));
            }
            else {
                map.put(arr[i], 1);
            }

        }

        System.out.println("No Majority element found");
    }

    public static int getOddOccurrence(int[] arr) {
        int result = 0;

        for(int el : arr) {
            result = result ^ el;
        }

        return result;
    }

    public static int largestSubArraySum(int[] arr) {
        int maxSoFar = 0;
        int maxEndingHere = 0;

        for(int i = 0; i < arr.length; i++) {
            maxEndingHere += arr[i];
            if(maxSoFar < maxEndingHere)
                maxSoFar = maxEndingHere;
            if(maxEndingHere < 0)
                maxEndingHere = 0;
        }

        return maxSoFar;
    }

    public static int missingNumber(int[] arr) {
        int result = ((arr.length + 1) * (arr.length + 2)) / 2;

        for(int el: arr) {
            result -= el;
        }
        return result;
    }

    public static int searchInSortedRotatedArray(int[] arr, int item) {
        return searchInSortedRotatedArray(arr, item, 0, (arr.length - 1));
    }
    public static int searchInSortedRotatedArray(int[] arr, int item, int low, int high) {
        if(low > high)
            return -1;

        int mid = (low + high) / 2;
        if(item == arr[mid])
            return mid;
        else if(arr[low] <= arr[mid]) { //
            if(item >=arr[low] && item < arr[mid])
                return searchInSortedRotatedArray(arr, item, low, (mid - 1));
            else
                return searchInSortedRotatedArray(arr, item, (mid + 1), high);
        }
        else {
            if(item >=arr[mid] && item <= arr[high])
                return searchInSortedRotatedArray(arr, item, (mid + 1), high);
            else
                return searchInSortedRotatedArray(arr, item, low, (mid - 1));
        }
    }

    public static int[] moveToEnd(int[] arr) {
        int j = arr.length - 1;
        for(int i = j; i >= 0; i--) {
            if(arr[i] != -1) {
                arr[j] = arr[i];
                if(i != j)
                    arr[i] = -1;
                j--;
            }
        }
        return arr;
    }
    public static int[] mergeTwoArray(int[] bigArr, int[] arr2) {
        int[] arr1 = moveToEnd(bigArr);

        int bigArrIndex = arr2.length;
        int smallArrIndex = 0;
        int counter = 0;
        while(counter < arr1.length) {
            if(((bigArrIndex < arr1.length) && (arr1[bigArrIndex] <= arr2[smallArrIndex])) || (smallArrIndex == arr2.length)) {
                arr1[counter] = arr1[bigArrIndex];
                bigArrIndex++;
                counter++;
            }
            else {
                arr1[counter] = arr2[smallArrIndex];
                smallArrIndex++;
                counter++;
            }
        }

        return arr1;
    }

    public static int[] arrayRotation(int[] arr, int d) {
        for(int i = 0; i < d; i++) {
            int temp = arr[0];
            for(int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = temp;
        }
        return arr;
    }

    public static int[] leftRotation(int[] arr, int d) {
        if(d == 0)
            return arr;

        reverse(arr, 0, (d - 1));
        reverse(arr, d, (arr.length - 1));
        reverse(arr, 0, (arr.length - 1));

        return arr;
    }
}
