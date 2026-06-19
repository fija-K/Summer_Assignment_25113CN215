package day13;

import java.util.Scanner;

public class count_evenOdd_in_an_Array {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num= Inputarray(input);//taking input array method calling
        int evenno=even(num);// mehtod calling
        int oddno=num.length-evenno;//odd no = length of the array - no of even no present in  the array.
    
        System.out.println("EVEN NO--> "+evenno);
        System.out.println("ODD NO--> "+oddno);
    }
    //method for counting even nos in the array
    public static int even(int[] arr){
        int var2= arr.length;
        int count=0;
        for(int i=0;i<var2;i++){
            if(arr[i]%2==0){
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
