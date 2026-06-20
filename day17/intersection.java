package day17;

import java.util.ArrayList;
import java.util.Scanner;

public class intersection {
    //Input method
    static int[] inputArray(Scanner sc) {
        System.out.println("ENTER n");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    //intersection method
    static ArrayList<Integer> intersection(int[] a, int[] b) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0, j = 0;
        while (i<a.length&&j<b.length) {
            if (a[i]<b[j]) {
                i++;
            }
            else if (a[i]>b[j]) {
                j++;
            }
            else {
                //avoid duplicates
                if (ans.isEmpty() || ans.get(ans.size() - 1) != a[i]) {
                    ans.add(a[i]);
                }
                i++;
                j++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a=inputArray(sc);
        int[] b=inputArray(sc);
        ArrayList<Integer> ans=intersection(a, b);
        System.out.println(ans);
        sc.close();
    }
}