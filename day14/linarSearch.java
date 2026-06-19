package day14;

import java.util.Scanner;

public class linarSearch {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num= Inputarray(input);//taking input array method calling
        System.out.println("Enter the no that u wannna find: ");
        int target=input.nextInt();
        linearSearch(num,target);//method calling
    }
    //method for for finding an element in the array
    public static void linearSearch(int[] arr,int target){
        int var2= arr.length;
        
        int count=0;
        for(int i=0;i<var2;i++){
            if(arr[i]==target){

                count++;
            }


        }
        if(count>0){
            System.out.println(target+" found "+count+" times in the array.");
        }
        else{
            System.out.println("NOT FOUND");
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
