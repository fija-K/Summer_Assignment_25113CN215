package day17;

import java.util.ArrayList;
import java.util.Scanner;

public class union {
    //Input method
    static int[] inputArray(Scanner sc) {
        System.out.println("ENTER n");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        return arr;
    }

    //union method
    static ArrayList<Integer> union(int[] a, int[] b) {
        ArrayList<Integer> ans = new ArrayList<>();

        int i=0;
        int j=0;

        while (i<a.length&&j<b.length) {

            if (a[i]<b[j]) {
                if (ans.isEmpty()||ans.get(ans.size()-1)!=a[i]) {
                    ans.add(a[i]);
                }
                i++;
            }
            else if (a[i] > b[j]) {
                if (ans.isEmpty()||ans.get(ans.size()-1)!=b[j]) {
                    ans.add(b[j]);
                }
                j++;
            }
            else {
                if (ans.isEmpty()||ans.get(ans.size()-1)!=a[i]) {
                    ans.add(a[i]);
                }
                i++;
                j++;
            }
        }

        //remaining elements of first array
        while (i < a.length) {
            if (ans.isEmpty()||ans.get(ans.size()-1)!=a[i]){
                ans.add(a[i]);
            }
            i++;
        }

        //remaining elements of second array
        while (j < b.length) {
            if (ans.isEmpty()||ans.get(ans.size()-1)!=b[j]){
                ans.add(b[j]);
            }
            j++;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = inputArray(sc);
        int[] b = inputArray(sc);

        ArrayList<Integer> ans = union(a, b);

        System.out.println(ans);

        sc.close();
    }
}
