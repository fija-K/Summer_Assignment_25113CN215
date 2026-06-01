package day5;
import java.util.Scanner;

public class perfectno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER A POSITVE INTEGER ");
        int num= input.nextInt();
        int sum=0;

        while(num<0){
            System.out.println("ENTER A POSITVE INTEGER");
            num = input.nextInt();
        }
        for(int i=1; i<num;i++){
            if(num%i==0){
                sum+=i;
            }

          
        }
        if (sum==num){
            System.out.println("PERFECT NO");
        }
        else{
            System.out.println("NOT A PERFECT NO");
        }
        input.close();
    }

    
}
