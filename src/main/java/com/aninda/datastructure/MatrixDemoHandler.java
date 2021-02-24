package com.aninda.datastructure;

import com.aninda.datastructure.matrix.MatrixUtils;

public class MatrixDemoHandler {

    public static void searchSortedMatrixDemo() {
        int[][] arr = { {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50} };

        System.out.println("Original Matrix : ");
        MatrixUtils.printMatrix(arr, arr.length, arr[0].length);

        MatrixUtils.searchSortedMatrix(arr, 20);
    }
    public static void spiralMatrixTraversalDemo(){
        int[][] arr = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        System.out.println("Original Matrix : ");
        MatrixUtils.printMatrix(arr, arr.length, arr[0].length);

        MatrixUtils.spiralTraversal(arr);
    }

    public static void booleanMatrixDemo() {
        int[][] arr = { {1, 0, 0, 1},
                {0, 0, 1, 0},
                {0, 0, 0, 0}};

        System.out.println("Original Matrix : ");
        MatrixUtils.printMatrix(arr, arr.length, arr[0].length);

        MatrixUtils.booleanMatrix(arr);

        System.out.println("Modified Matrix : ");
        MatrixUtils.printMatrix(arr, arr.length, arr[0].length);
    }

    public static void uniqueRowMatrix() {
        int[][] arr = { { 0, 1, 0, 0, 1 },
                { 1, 0, 1, 1, 0 },
                { 0, 1, 0, 0, 1 },
                { 1, 0, 1, 0, 0 } };
        System.out.println("Original Matrix : ");
        MatrixUtils.printMatrix(arr, arr.length, arr[0].length);

        System.out.println("Unique row in the Matrix : ");
        MatrixUtils.findUniqueRows(arr);
    }
}
