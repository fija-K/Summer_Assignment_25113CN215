package day9;

import java.util.Scanner;

public class reverse_star_pattern {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter n");
        int n= input.nextInt();
        for(int i=0; i<n;i++){//row
            for(int j=n;j>i;j--){//col
                System.out.print("*");//prints *
            }
            System.out.println();

        }
        

    }
    

    
}
