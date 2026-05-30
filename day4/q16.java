package Summer_Assignment_25113CN215.day4;

import java.util.Scanner;
//Write a program to Print Armstrong numbers in a range.
public class q16{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE starting range");
        int n= input.nextInt();
        System.out.println("ENTER THE end range");
        int m= input.nextInt();
        Armstrong_nos(n,m);
        
        input.close();


    }
    static int Count_digit(int a){
        if(a==0){
            return 1;
        }
        int d=a;
        int b=0;
        while(!(d==0)){
            d/=10;
            b+=1;

        }
        return b;
    }
    
    static boolean Armstrong(int a){
        int x= Count_digit(a);
        int y=a;
        int z=0;
        while(y!=0){
            z=z+(int)Math.pow(y%10,x);
            y/=10;


        }
        if (z==a){
            return true;
        }
        return false;
        

        


    }
    static void Armstrong_nos(int x,int z){
        
        for (int i=x;i<=z;i++){
            boolean y= Armstrong(i);
            if (y){
                System.out.println(i);
            }
        }

    }


        
        

}
