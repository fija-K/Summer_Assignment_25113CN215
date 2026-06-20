package day18;

import java.util.Arrays;
import java.util.Scanner;

public class binarySearch {
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

    //binary Search
    static int binarySearch(int[] arr,int target) {
        int low=0;
        int high=arr.length-1;

        while (low<=high) {

            int mid=low+(high-low)/2;

            if (arr[mid]==target) {
                return mid;
            }
            else if (arr[mid]<target) {
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[] arr=inputArray(sc);
        Arrays.sort(arr);

        //element to search
        System.out.println("ENTER target");
        int target=sc.nextInt();

        int index=binarySearch(arr,target);

        if (index==-1) {
            System.out.println("Element not found");
        } else{
            System.out.println("Element found at index " + index);
        }
        sc.close();
    }
}