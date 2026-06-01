package day5;

import java.util.Scanner;

public class largest_prime_factor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER A POSITVE INTEGER ");
        int num= input.nextInt();
        int largest_prime=0;

        while(num<0){
            System.out.println("ENTER A POSITVE INTEGER");
            num = input.nextInt();
        }
        for(int i=1; i<=num;i++){
            if(num%i==0){
                boolean prime= primeno(i);
                if(prime==true){
                    largest_prime=i;
                }
                
            }

          
        }
        System.out.println("LARGEST PRIME FACTOR->"+largest_prime);
        
    }
    static boolean primeno(int a){
        int d=a;
        int b=1;
        int c;
        int count=0;
        while(!(d==0)){
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
        
    
}




    

