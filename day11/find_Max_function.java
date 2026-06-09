
package day11;

import java.util.Scanner;

public class find_Max_function  {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Enter n1");
        int n1= input.nextInt(); 
        System.out.println("Enter n1");
        int n2= input.nextInt();
        max(n1,n2);//method calling
        input.close();
        
    
    }
    //method
    public static void max(int a, int b) {
        if(a>b){
            System.out.println(a+"is max");

        }
        else if(b>a){
            System.out.println(b+"is max");
        }
        else System.out.println("no are equal");
        
    }
}
