package day12;

import java.util.Scanner;
//Write a program to Check Armstrong number. 
public class ArmstArmstrong_functionrong{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE no");
        int n= input.nextInt();
        Armstrong(n); //method calling
        
        input.close();


    }
    //method for counting digit
    static int Count_digit(int a){
        int d=a;
        int b=0;
        while(!(d==0)){
            d/=10;
            b+=1;

        }
        return b;
    }
    //method for armstrong
    static void Armstrong(int a){
        int x= Count_digit(a);//return by value method calling 
        int y=a;
        int z=0;
        while(y!=0){
            z=z+(int)Math.pow(y%10,x);
            y/=10;


        }
        if (z==a){
            System.out.println("is an Armstrong number");
        }
        else{
            System.out.println("is not an Armstrong number");
        }

        


    }


        
        

}
