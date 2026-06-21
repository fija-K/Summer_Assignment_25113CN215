package day19;

import java.util.Arrays;
import java.util.Scanner;

public class diagonalSum {
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

    // diagonal sum.
    static int diagonal(int[][] a) {
        int rows = a.length;
        int cols = a[0].length;
        int sum = 0;

        for (int i = 0; i < rows; i++) {
            sum += a[i][i];
        }

        
        return sum;
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
        int ans=diagonal(a);
        System.out.println("diagonal sum: ");
        System.out.println(ans);
        sc.close();
    }
}