package day8;

import java.util.Scanner;

public class characterTrianglePattern {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER no: ");
        int num= input.nextInt();
        
        for(int i=1;i<=num;i++){
            char ch='A';//ch will be change to 'A' again
            for(int j=1;j<=i;j++){
                System.out.print(ch);//here char will print
                ch++;
            }
            System.out.println();
        }
        

    }

}