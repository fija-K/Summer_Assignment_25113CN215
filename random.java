/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner input= new Scanner(System.in);
        int n= input.nextInt();
        int[] arr = new int[n];
        Inputarr(arr,input);
        int low=0;
        int high=n-1;
        System.out.print(Arrays.toString(arr));

        while(low<high){
            if(arr[low]==0){
                low++;
            }
            else{
                int temp = arr[low];
                arr[low]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
        System.out.print(Arrays.toString(arr));
        input.close();
	}

    public static void Inputarr(int[] arr,Scanner input){
        for(int i=0;i<arr.length;i++){
   
            arr[i] = input.nextInt();
        }
    }

}
