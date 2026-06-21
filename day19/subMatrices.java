package day19;

import java.util.Arrays;
import java.util.Scanner;

public class subMatrices {
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

    //sub two matrices
    static int[][] subMatrices(int[][] a,int[][] b) {
        int rows=a.length;
        int cols=a[0].length;

        int[][] sub=new int[rows][cols];

        //sub corresponding elements
        for (int i=0;i<rows;i++) {
            for (int j=0;j<cols;j++) {
                sub[i][j]=a[i][j]-b[i][j];
            }
        }
        return sub;
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
        System.out.println("INPUT for first matrix");
        int[][]a=inputMatrix(sc, rows, cols);
        //input second matrix
        System.out.println("INPUT for 2nd matrix");
        int[][] b=inputMatrix(sc, rows, cols);
        int[][] ans=subMatrices(a, b);
        System.out.println("sub Matrix:");
        printMatrix(ans);
        sc.close();
    }
}