package day6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class set_bits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE DECIMAL NO: ");
        int n = input.nextInt();//taking input
        ArrayList<Integer> binaryArryList= new ArrayList<>();
        
        binaryArryList= Binary( n);
        int count =0;
        for(int i=0; i<binaryArryList.size();i++){
            if(binaryArryList.get(i)==1){
                count++;
            }
        }
        System.out.println("set bits of "+n+" number is-> "+count);
        

        input.close();
    }
    





    static ArrayList Binary( int n){

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
        return binary;


        



        


    }
}
