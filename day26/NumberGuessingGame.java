import java.util.*;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int number=random.nextInt(100)+1;
        int guess=0;
        System.out.println("guess the number between 1 and 100");
        while(guess!=number){
            System.out.print("Enter your guess: ");
            guess=sc.nextInt();
            if(guess<number){
                System.out.println("Too Low!");
            }
            else if(guess>number){
                System.out.println("Too High!");
            }
            else{
                System.out.println("Correct! You guessed it.");
            }
        }
        sc.close();
    }
}