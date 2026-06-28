import java.util.*;

public class QuizApplication {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int score=0;
        int ans;
        // Question 1
        System.out.println("1. Which language is platform independent?");
        System.out.println("1.C");
        System.out.println("2.Java");
        System.out.println("3.Python");
        System.out.println("4.C++");

        ans=sc.nextInt();
        if(ans==2){
            score++;
        }
        //question 2
        System.out.println("\n2. How many bytes are in an int in Java?");
        System.out.println("1.2");
        System.out.println("2.4");
        System.out.println("3.8");
        System.out.println("4.16");
        ans=sc.nextInt();
        if(ans==2){
            score++;
        }
        //question 3
        System.out.println("\n3. Java is developed by?");
        System.out.println("1.Google");
        System.out.println("2.Microsoft");
        System.out.println("3.Sun Microsystems");
        System.out.println("4.Apple");
        ans=sc.nextInt();
        if(ans==3){
            score++;
        }
        System.out.println("\nFinal Score: "+score+"/3");
        sc.close();
    }
}