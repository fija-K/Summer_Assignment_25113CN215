package day15;

import java.util.Arrays;
import java.util.Scanner;

public class moveZeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = Inputarray(input);
        System.out.println("before "+Arrays.toString(nums));
        moveZeroes(nums);
        System.out.println("after "+Arrays.toString(nums));
        
    }
    //method to move all zeroes to right or end.
    public static void moveZeroes(int[] nums) {
        int i=0;
        for(int j=0; j<nums.length;j++){
            
            if(nums[j]!=0){
                nums[i]=nums[j];
                i++;
            
            }

        }
        for(int k=i;k<nums.length;k++){
            nums[k]=0;
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
