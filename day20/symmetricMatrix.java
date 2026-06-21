package day20;

import java.util.Scanner;

public class symmetricMatrix {
    //method to take matrix input
    public static void inputMatrix(int[][] arr, Scanner sc) {
        for (int i=0;i<arr.length;i++) {
            for (int j=0;j<arr[0].length;j++) {
                arr[i][j] =sc.nextInt();
            }
        }
    }

    //method to display matrix
    public static void displayMatrix(int[][] arr) {
        for (int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    //method to check whether the matrix is symmetric
    public static boolean isSymmetric(int[][] arr) {

        int n =arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i][j]!=arr[j][i]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("ENTER size of square matrix: ");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        System.out.println("ENTER matrix elements:");
        inputMatrix(arr, sc);

        System.out.println("Matrix:");
        displayMatrix(arr);

        if (isSymmetric(arr)) {
            System.out.println("SYMMETRIC MATRIX");
        } else {
            System.out.println("Not a Symmetric Matrix");
        }
    }
}
