package day14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class duplicates_array {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int[] nums=Inputarray(input);//calling method
        HashSet<Integer> set = new HashSet<>();
        //ArrayList<Integer> list= new ArrayList<>();
        HashSet<Integer> list= new HashSet<>();
        //using hashset, bcz if elments are more then 2 then duplicates will get store in arraylist, so using hashset.

        for(int i=0; i<nums.length;i++){
            if(set.contains(nums[i])){
                list.add(nums[i]);
            }
            else{
                set.add(nums[i]);
            }
        }
        System.out.println("DUPLICATES:-");
        System.out.println(list);

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
