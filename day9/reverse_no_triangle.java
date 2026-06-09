package day9;

import java.util.Scanner;

public class reverse_no_triangle {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter n");
        int n= input.nextInt();
        for(int i=0; i<n;i++){//row
            for(int j=1;j<=n-i;j++){//col
                System.out.print(j);//prints no
            }
            System.out.println();

        }
        
    }
    
}
