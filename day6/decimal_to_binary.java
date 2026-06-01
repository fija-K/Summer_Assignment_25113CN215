package day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class decimal_to_binary {
    public static void main(){
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE DECIMAL NO: ");
        int n = input.nextInt();
        ArrayList<Integer> binary= new ArrayList<>();
        int m=n;
        if(n==0){
            System.out.print("-->"+0);
        }
        else{
            while(m!=0){
                binary.add(m%2);
                m/=2;

            }

        }
        Collections.reverse(binary);
        System.out.print("Binary of "+n+" is : ");
        for(int i=0;i<binary.size();i++){
            System.out.print(binary.get(i));
        }


        



        input.close();


    }
}