package day16;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class remove_duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        //Input array
        for (int i=0;i<n;i++) {
            nums[i]=sc.nextInt();
        }
        
        //stores unique elements in order
        LinkedHashSet<Integer> set=new LinkedHashSet<>();
        //remove duplicates
        for (int num:nums) {
            set.add(num);
        }
        //print unique elements
        for (int x:set) {
            System.out.print(x+" ");
        }

        sc.close();
    }
}
