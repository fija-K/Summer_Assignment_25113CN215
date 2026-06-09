
package day10;

import java.util.Scanner;

public class no_pyramid {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter n");
        int n= input.nextInt();
        int num=1;
        for(int i=0; i<n;i++){//row
            for(int j=0;j<n-i;j++){//col
                if(i<n){
                    System.out.print(" ");//prints the first half of half triangle made up spaces
                }
                
            }
            for(int j=0;j<2*i+1;j++){//col
                if(j<=(2*i+1)/2){
                    System.out.print(num);
                    num++;
                }
                else{
                    num-=2;
                    System.out.print(num);
                    num++;
                }

            }
            num=1;//makes it 1 ready to use for next i loop
            System.out.println();
            

        }
    }
    
}

