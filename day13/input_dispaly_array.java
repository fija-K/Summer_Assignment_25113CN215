package day13;

import java.util.Scanner;

public class input_dispaly_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num= Inputarray(input);//taking input array method calling
        Printarray(num);//printing mehtod calling
    }
    //method for printing the array
    public static void Printarray(int[] arr){
        int var2= arr.length;
        System.out.println("YOUR ENTERED ARRAY IS:");
        System.out.print("[");
        for(int i=0;i<var2;i++){
            System.out.print(arr[i]);
            if(i==(var2-1)){
                continue;
            }
            System.out.print(",");

        }
        System.out.println("]");
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
