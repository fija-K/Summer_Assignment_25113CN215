package Summer_Assignment_25113CN215.day3;

import java.util.Scanner;
//Write a program to Print prime numbers in a range.

public class q10{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Note:- PRIME NUMBER ARE ONLY DEFINE FOR NATURAL NUMBER GREATER THEN 1.");
        System.out.println("ENTER THE starting RANGE.#should be greater then 1");
        int m= input.nextInt();
        System.out.println("ENTER THE END RANGE.#should be greater then 1");
        int n = input.nextInt();
        Prime(m,n);
        
        input.close();



    }
    static boolean Is_Prime(int a){
        int d=a;
        int b=1;
        int c;
        int count=0;
        while(d!=0){
            c=d%b;
            if (c==d){
                break;
            }
            if (c==0){
                count++;


            }
            
            b++;
            

        }
        if (count>2){
            return false;
        }
        else{
            return true;
        }
    }
    static void Prime(int q,int a){
        for (int i=q;i<=a;i++){
            boolean z= Is_Prime(i);
            if (z){
                System.out.println(i);
            }
        }
       
    }
}