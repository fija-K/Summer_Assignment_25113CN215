package day20;

import java.util.Scanner;

public class multiplyMatrices {
    // Method to take matrix input
    public static void inputMatrix(int[][] arr, Scanner sc) {
        for (int i=0;i<arr.length;i++) {
            for (int j=0;j<arr[0].length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
    }

    // Method to display matrix
    public static void displayMatrix(int[][] arr) {
        for (int i=0;i<arr.length;i++) {
            for (int j=0;j<arr[0].length;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    //method to multiply matrices.
    public static int[][] multiply(int[][] a, int[][] b) {

        int rows=a.length;
        int cols=b[0].length;

        int[][] result=new int[rows][cols];

        //matrix multiplication
        for (int i=0;i<rows;i++) {

            for (int j=0;j<cols; j++) {

                // Multiply and add
                for (int k=0;k<b.length;k++) {
                    result[i][j]+=a[i][k]*b[k][j];
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter rows and columns of first matrix: ");
        int r1=sc.nextInt();
        int c1=sc.nextInt();

        System.out.println("enter rows and columns of second matrix: ");
        int r2=sc.nextInt();
        int c2= sc.nextInt();

        // Multiplication not possible
        if (c1 !=r2) {
            System.out.println("Matrix multiplication not possible.");
            return;
        }

        int[][] a=new int[r1][c1];
        int[][] b=new int[r2][c2];

        System.out.println("Enter first matrix:");
        inputMatrix(a, sc);

        System.out.println("enter second matrix:");
        inputMatrix(b, sc);

        int[][] result = multiply(a, b);

        System.out.println("resultant Matrix:");
        displayMatrix(result);
    }
}