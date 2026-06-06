package day8;
import java.util.Scanner;

public class repeatedNumberPattern {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER no: ");
        int num= input.nextInt();
        
        for(int i=1;i<=num;i++){//row
            
            for(int j=1;j<=i;j++){//column
                System.out.print(i);//i will print
                
            }
            System.out.println();
        }
        

    }

}