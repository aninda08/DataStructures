package com.aninda.datastructure.matrix;

import java.util.HashSet;

public class MatrixUtils {
    public static void printMatrix(int[][] mat, int R, int C)
    {
        int i, j;
        for (i = 0; i < R; i++)
        {
            for (j = 0; j < C; j++)
            {
                System.out.print(mat[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void searchSortedMatrix(int[][] arr, int key) {
        int row = arr.length;
        int col = arr[0].length;

        searchSortedMatrixRec(arr,0, (row - 1), 0, (col - 1), key);
    }

    public static void searchSortedMatrixRec(int[][] arr, int fromRow, int toRow, int fromCol, int toCol, int key) {
        int middleRow = (fromRow + toRow) / 2;
        int middleCol = (fromCol + toCol) / 2;

        if(arr[middleRow][middleCol] == key) {
            System.out.println("Element :: " + key + " is found at :: (" + middleRow + "," + middleCol + ")");
        }
        else {
            if(middleRow != toRow || middleCol != fromCol)
                searchSortedMatrixRec(arr, fromRow, middleRow, middleCol, toCol, key);

            if(fromRow == toRow && fromCol + 1 == toCol && arr[fromRow][toCol] == key) {
                System.out.println("Element :: " + key + " is found at :: (" + middleRow + "," + middleCol + ")");
            }

            if(arr[middleRow][middleCol] < key) {
                if(middleRow + 1 <= toRow) {
                    searchSortedMatrixRec(arr, (middleRow + 1), toRow, fromCol, toCol, key);
                }
            }
            else {
                if(middleCol - 1 >= fromCol) {
                    searchSortedMatrixRec(arr, fromRow, toRow, fromCol, (middleCol - 1), key);
                }
            }
        }
    }

    public static void spiralTraversal(int[][] arr) {
        spiralTraversalRec(arr,0, (arr.length - 1), 0,(arr[0].length - 1));
    }
    public static void spiralTraversalRec(int[][] arr, int fromRow, int toRow, int fromCol, int toCol) {
        if(fromRow > toRow && fromCol > toCol)
            return;

        //print the boundary element
        //print upper row
        for(int i = fromCol ; i <= toCol; i++) {
            System.out.print(arr[fromRow][i] + " ");
        }

        //print right most column
        for(int j = fromRow + 1; j <= toRow; j++) {
            System.out.print(arr[j][toCol] + " ");
        }

        //print bottom row
        for(int k = toCol - 1; k >= fromCol; k--) {
            System.out.print(arr[toRow][k] + " ");
        }

        //print left most column
        for(int l = toRow - 1; l > fromRow; l--) {
            System.out.print(arr[l][fromCol] + " ");
        }

        spiralTraversalRec(arr, (fromRow + 1), (toCol - 1), (fromCol + 1), (toCol - 1));
    }

    //does not work as the previous cell are not update with 1
    public static void booleanMatrix(int[][] arr) {
        int row = arr.length - 1;
        int col = arr[0].length - 1;
        HashSet<Integer> rowSet = new HashSet<>();
        HashSet<Integer> colSet = new HashSet<>();
        for(int i = 0; i <= row; i++) {
            for(int j = 0; j <= col; j++) {
                if(arr[i][j] == 1) {
                    rowSet.add(i);
                    colSet.add(j);
                }
                else {
                    if(rowSet.contains(i) || colSet.contains(j))
                        arr[i][j] = 1;
                }
            }
        }

        for(int i = 0; i <= row; i++) {
            for(int j = 0; j <= col; j++) {
                if(rowSet.contains(i) || colSet.contains(j))
                    arr[i][j] = 1;
            }
        }
    }

    public static void findUniqueRows(int[][] arr) {
        HashSet<String> rowValue = new HashSet<>();


        for(int i = 0; i < arr.length; i++) {
            String s = "";
            for(int j = 0; j < arr[0].length; j++) {
                s += String.valueOf(arr[i][j]) + " ";
            }
            if(!rowValue.contains(s)) {
                System.out.println(s);
                rowValue.add(s);
            }
        }
    }
}
