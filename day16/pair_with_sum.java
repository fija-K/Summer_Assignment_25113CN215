package day16;

import java.util.HashSet;
import java.util.Scanner;

public class pair_with_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER n ");

        int n= sc.nextInt();
        int[] nums=new int[n];

        //Input array
        for (int i=0; i<n; i++) {
            nums[i]=sc.nextInt();
        }

        System.out.println("ENTER target ");
        int target=sc.nextInt();

        HashSet<Integer> set=new HashSet<>();
        boolean found=false;

        //Find complement
        for (int num:nums) {
            int need=target-num;

            if (set.contains(need)) {
                System.out.println(need+" "+num);
                found=true;
                break;
            }

            //Store current number
            set.add(num);
        }

        if (!found) {
            System.out.println("NO PAIR FOUND");
        }

        sc.close();
    }
}