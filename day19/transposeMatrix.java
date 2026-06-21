package day19;

import java.util.Arrays;
import java.util.Scanner;

public class transposeMatrix {
    //input matrix
    static int[][] inputMatrix(Scanner sc, int rows, int cols) {
        int[][] mat=new int[rows][cols];

        for (int i=0;i<rows;i++) {
            for (int j=0;j<cols;j++) {
                mat[i][j]=sc.nextInt();
            }
        }
        return mat;
    }

    // transpose
    static int[][] transpose(int[][] a) {
        int rows = a.length;
        int cols = a[0].length;

        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = a[i][j];
            }
        }
        return transpose;
    }

    //print matrix
    static void printMatrix(int[][] mat) {
        for (int[] row:mat) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("rows");
        int rows=sc.nextInt();
        System.out.println("cols");
        int cols=sc.nextInt();
        //input first matrix
        System.out.println("INPUT for matrix");
        int[][]a=inputMatrix(sc, rows, cols);
        int[][] ans=transpose(a);
        System.out.println("transpose Matrix:");
        printMatrix(ans);
        sc.close();
    }
}