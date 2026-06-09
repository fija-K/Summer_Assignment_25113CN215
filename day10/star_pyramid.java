package day10;

import java.util.Scanner;

public class star_pyramid {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter n");
        int n= input.nextInt();
        for(int i=0; i<n;i++){//row
            for(int j=0;j<n-i;j++){//col
                if(i<n){
                    System.out.print(" ");//prints the first half of reverse half triangle made up spaces
                }
                
            }
            for(int j=0;j<2*i+1;j++){//col
                System.out.print("*");

            }
            System.out.println();
            

        }
    }
    
}
