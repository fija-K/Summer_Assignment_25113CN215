package day9;

import java.util.Scanner;

public class hollow_square_pattern {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter n");
        int n= input.nextInt();
        for(int i=0; i<n;i++){//row
            for(int j=0;j<n;j++){//col
                if(i==0||j==0||i==n-1||j==n-1){//prints the boundry of square
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
                
            }
            System.out.println();

        }
        
    }
}
