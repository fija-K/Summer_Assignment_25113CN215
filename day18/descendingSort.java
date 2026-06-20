package day18;

import java.util.Arrays;
import java.util.Scanner;

public class descendingSort {
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

    // Descending Bubble Sort
    static void descendingSort(int[] arr) {
        int n=arr.length;
        for (int i=0;i<n-1;i++) {

            boolean swapped=false;

            for (int j=0;j<n-1-i;j++) {

                //swap if left element is smaller
                if (arr[j]<arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                    swapped=true;
                }
            }
            //already sorted
            if (!swapped) {
                break;
            }
        }
    }

    //print array
    static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[] arr=inputArray(sc);
        descendingSort(arr);
        printArray(arr);
        sc.close();
    }
}