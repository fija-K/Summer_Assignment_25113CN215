package day9;

import java.util.Scanner;

public class repeated_char_pattern {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter n");
        int n= input.nextInt();
        char ch= 'A';
        for(int i=0; i<n;i++){//row
            for(int j=0;j<=i;j++){//col
                System.out.print(ch);//prints char
                
            }
            ch++;// eg:- A++=B
            System.out.println();

        }
        
    }
    
    
}
