package day5;

import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER A POSITVE INTEGER ");
        int num= input.nextInt();
        int sum=0;

        while(num<0){
            System.out.println("ENTER A POSITVE INTEGER");
            num = input.nextInt();
        }
        System.out.println("FACTORS OF "+num+" ->");
        for(int i=1; i<=num;i++){
            if(num%i==0){
                System.out.println(i);
            }

          
        }
        
    }
}
