package day14;

import java.util.Scanner;

public class frequency_of_elem_array {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num= Inputarray(input);//taking input array method calling
        System.out.println("Enter the no that u wannna find: ");
        int target=input.nextInt();
        int fre= frequency(num,target);//method calling
        System.out.println("frequency of "+target+" in the array is-> "+fre);
    }
    //method for for finding an element in the array
    public static int frequency(int[] arr,int target){
        int var2= arr.length;
        
        int count=0;
        for(int i=0;i<var2;i++){
            if(arr[i]==target){

                count++;
            }


        }
        return count;
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

