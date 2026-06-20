package day16;

import java.util.Scanner;

public class missingno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums= Inputarray(input);//method calling
        int ans =missingNumber(nums);//method calling
        System.out.println("MISSIN NO->"+ans);
        
    }
    //method for fnding the missing no.
    public  static int missingNumber(int[] nums) {
        int ans=nums.length;


        for (int i=0; i<nums.length;i++) {
            ans^=i^nums[i];//using bit manipulation.
        }
        return ans;
        
    }
    //method for taking input of the array
    public static int[] Inputarray(Scanner input){
        System.out.print("ENTER THE LENGHT OF ARRAY: ");
        int var1= input.nextInt();//this takes length of the array input
        int[] arr= new int[var1];
        System.out.println("INPUT THE VALUES IN ARRAY:");
        for (int i=0;i<var1;i++){
            arr[i]=input.nextInt();

        }
        return arr;

    
        
    }
    
}
