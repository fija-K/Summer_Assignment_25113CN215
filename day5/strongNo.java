package day5;
import java.util.Scanner;

public class strongNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER A POSITVE INTEGER greater then 0");
        int num= input.nextInt();

        while(num<=0){
            System.out.println("ENTER A POSITVE INTEGER greater then 0");
            num = input.nextInt();
        }
        int sum=Sum_digit(num);
        if(sum==num){
            System.out.println("STRONG NO");
        }
        else{
            System.out.println("NOT A STRONG NO");
        }
        
        
        
        input.close();
    }

    static int Factorial(int a){
        int fact=1;
        for (int i=1;i<=a;i++){
            fact*=i;
        }
        return fact;
    }
   
    static int Sum_digit(int a){
        int d=a;
        int b=0;
        while(!(d==0)){
            b=b+Factorial(d%10);
            d/=10;
            

        }
        return b;
    }
        
    
}
