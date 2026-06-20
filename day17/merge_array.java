package day17;

import java.util.Arrays;
import java.util.Scanner;

public class merge_array {
    //Takes array input and returns it
    public static int[] inputArray(Scanner sc) {
        System.out.println("ENTER n ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }


    //Prints an array
    public static void print(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    // merge two sorted arrays
    public static int[] mergeSorted(int[] a,int[] b) {
        int[] ans=new int[a.length + b.length];

        int i=0,j=0,k=0;

        while (i < a.length && j < b.length) {
            if (a[i]<=b[j]) {
                ans[k++]=a[i++];
            } else {
                ans[k++]=b[j++];
            }
        }

        while (i<a.length) {
            ans[k++]=a[i++];
        }
        while (j<b.length) {
            ans[k++]=b[j++];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input first sorted array
        int[] a = inputArray(sc);

        //Input second sorted array
        int[] b = inputArray(sc);
        int[] ans = mergeSorted(a, b);
        print(ans);
        sc.close();
    }
}