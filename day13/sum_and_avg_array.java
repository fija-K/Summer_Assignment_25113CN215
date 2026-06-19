package day13;

import java.util.Scanner;

public class sum_and_avg_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num= Inputarray(input);//taking input array method calling
        
        int sum=arraysum(num);//sum method calling
        System.out.println("SUM-->"+sum);
        System.out.println("AVG-->"+(sum/num.length));
    }
    //method for finding sum of array's all elements
    public static int arraysum(int[] num){
        int sum=0;
        for(int i:num){
            sum+=i;
        }
        return sum;

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
