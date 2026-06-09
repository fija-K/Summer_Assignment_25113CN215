
package day10;

import java.util.Scanner;

public class character_pyramid {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter n");
        int n= input.nextInt();
        char ch='A';

        for(int i=0; i<n;i++){//row
            for(int j=0;j<n-i;j++){//col
                if(i<n){
                    System.out.print(" ");//prints the first half of half triangle made up spaces
                }
                
            }
            for(int j=0;j<2*i+1;j++){//col
                if(j<=(2*i+1)/2){
                    System.out.print(ch);
                    ch++;
                }
                else{
                    ch-=2;
                    System.out.print(ch);
                    ch++;
                }

            }
            ch='A';//makes it A ready to use for next i loop
            System.out.println();
            

        }
    }
    
}

