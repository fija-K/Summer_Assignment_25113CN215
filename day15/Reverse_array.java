package day15;

import java.util.Arrays;
import java.util.Scanner;


public class Reverse_array {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int[] nums=Inputarray(input);//calling method
        reverse(nums);
        System.out.println("REVERSED ARRAY:-");
        System.out.println(Arrays.toString(nums));
        
    }
    //method for reversing an array.
    public static void reverse(int[] nums){
        int i=0;
        int j=nums.length-1;
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
