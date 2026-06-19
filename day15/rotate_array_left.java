package day15;

import java.util.Arrays;
import java.util.Scanner;

public class rotate_array_left {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int[] nums=Inputarray(input);//calling method
        System.out.println("ENTER K:");
        int k=input.nextInt();
        
        int n= nums.length;
        k=k%n;
        //reverse 0---(n-k-1) 
        // reverse(n-k)-(n-1)
        //revrse whole arry from 0 to n-1
        reverse(nums,0,n-k-1 );
        reverse(nums, n-k, n-1);
        reverse(nums, 0, n-1);
        System.out.println("ROTATED ARRAY:");
        System.out.println(Arrays.toString(nums));
        
        
    }
    //method for reversing an array.
    public static void reverse(int[] nums,int i,int j){
        
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
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
