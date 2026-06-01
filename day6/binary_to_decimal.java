package day6;
import java.util.Scanner;

public class binary_to_decimal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE BINARY NO: ");
        int n = input.nextInt();
        int count= Count_digit(n);
        int b=0;
        int m=n;
        for(int i=0;i<count;i++){
            b+= (m%10)*(int)Math.pow(2,i);
            m/=10;

        }
        System.out.print("decimal->"+b);
        



        input.close();


    }
    static int Count_digit(int a){
        int d=a;
        int b=0;
        while(!(d==0)){
            d/=10;
            b+=1;

        }
        return b;
    }
}