package day18;

import java.util.Arrays;
import java.util.Scanner;

public class selectionSort {
    //input method
    static int[] inputArray(Scanner sc) {
        System.out.println("ENTER n");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        return arr;
    }

    //selection Sort
    static void selectionSort(int[] arr) {
        int n=arr.length;

        for (int i=0;i<n-1;i++) {

            int minIndex=i;
            //find minimum element
            for (int j=i+1;j<n;j++) {
                if (arr[j]<arr[minIndex]) {
                    minIndex=j;
                }
            }
            //swap minimum with current position
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
    }
    //print array
    static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = inputArray(sc);
        selectionSort(arr);
        printArray(arr);
        sc.close();
    }
}
