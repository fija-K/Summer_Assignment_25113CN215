package day16;

import java.util.HashMap;
import java.util.Scanner;

public class max_freq_elm {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER n:");

        int n=sc.nextInt();
        int[] nums=new int[n];

        //Input array
        for (int i=0;i<n;i++) {
            nums[i]=sc.nextInt();
        }

        HashMap<Integer,Integer> map=new HashMap<>();
        int ans=nums[0];
        int maxfreq=0;

        //Count frequencies
        for (int num:nums) {
            int freq=map.getOrDefault(num, 0) + 1;
            map.put(num,freq);

            //Update answer
            if (freq >maxfreq) {
                maxfreq=freq;
                ans=num;
            }
        }

        System.out.println("Element = "+ ans);
        System.out.println("frequency = "+ maxfreq);

        sc.close();
    }
}
