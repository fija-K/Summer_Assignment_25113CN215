package Summer_Assignment_25113CN215.day4;

import java.util.Scanner;
//Write a program to Find nth Fibonacci term. 
public class nth_fibonacci_term{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE nth term");
        int n= input.nextInt();
        Fibonacci(n);
        
        input.close();


    }
    static void Fibonacci(int a){
        
        int b=0;
        int c=1;
        int temp;
        if (a==1){
            System.out.println("-->"+b);
        }
        else if (a==2){
            System.out.println("-->"+c);
        }
        else{

            int i;
            for(i=3;i<=a;i++){
                temp=b;
                b=c;
                c+=temp;
                
            }
            System.out.print("at "+i+"th term the value is:- "+c);
            
        }
        
    
        
        
    }
        

}
