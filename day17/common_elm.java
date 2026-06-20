package day17;

import java.util.Scanner;
public class common_elm {
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

    //print common elements
    static void commonElements(int[] a, int[] b) {
        int i=0,j=0;
        boolean found = false;
        while (i<a.length&&j<b.length) {
            if (a[i]<b[j]) {
                i++;
            }
            else if (a[i]>b[j]) {
                j++;
            }
            else {
                System.out.print(a[i]+" ");
                found = true;

                int x = a[i];
                //skip duplicates
                while (i<a.length&&a[i]==x) i++;
                while (j<b.length&&b[j]==x) j++;
            }
        }
        if (!found) {
            System.out.println("no Common Elements");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a=inputArray(sc);
        int[] b=inputArray(sc);
        commonElements(a,b);
        sc.close();
    }
}
