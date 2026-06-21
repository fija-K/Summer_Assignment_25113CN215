package day20;

import java.util.Scanner;

public class rowWiseSum {
    //method to take matrix input
    public static void inputMatrix(int[][] arr, Scanner sc) {
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <arr[0].length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
    }

    //method to display matrix
    public static void displayMatrix(int[][] arr) {
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    //method to find row-wise sum
    public static void rowWiseSum(int[][] arr) {

        for (int i=0;i<arr.length; i++) {

            int sum=0;

            //Add all elements of the current row
            for (int j = 0; j <arr[0].length; j++) {
                sum+=arr[i][j];
            }

            System.out.println("Row " + (i + 1) + " Sum = " +sum);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER ROWS: ");
        int rows = sc.nextInt();
        System.out.print("ENTER COLS: ");
        int cols = sc.nextInt();

        int[][] arr=new int[rows][cols];
        System.out.println("Enter matrix elements:");
        inputMatrix(arr, sc);
        System.out.println("Matrix:");
        displayMatrix(arr);

        System.out.println("Row-wise Sum:");
        rowWiseSum(arr);
    }
}