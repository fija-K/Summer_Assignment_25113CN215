package day13;

import java.util.Scanner;

public class largest_smallest_element_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num= Inputarray(input);//taking input array method calling
        
        int smallestno= smallest(num);// method calling
        int largestno= largest(num);// method calling
        System.out.println("smallest no-->"+smallestno);
        System.out.println("largest no-->"+largestno);
        if(smallestno==largestno){
            System.out.println("ALL ELEMENTS ARE EQUAL AND ARE EQUAL TO "+smallestno);
        }
        
    }
    //method for finding smallest element of array
    public static int smallest(int[] num){
        int s=num[0];
        for(int i=0;i<num.length-1;i++){
            if(num[i]<num[i+1]){
                s=Math.min(s,num[i]);
            }else{
                s=Math.min(num[i+1],s);
            }
        }
        return s;
    }
    //method for finding largest element of array
    public static int largest(int[] num){
        int l=num[0];
        for(int i=0;i<num.length-1;i++){
            if(num[i]>num[i+1]){
                l=Math.max(l,num[i]);
            }else{
                l=Math.max(l,num[i+1]);
            }
        }
        return l;
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

