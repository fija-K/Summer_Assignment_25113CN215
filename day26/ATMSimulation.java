import java.util.*;

public class ATMSimulation {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int balance=10000;
        int choice;
        do{
            System.out.println("\n1.Check Balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");
            System.out.print("enter choice: ");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("balance: "+balance);
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    int deposit=sc.nextInt();
                    balance+=deposit;
                    System.out.println("Amount Deposited.");
                    break;

                case 3:
                    System.out.print("Enter amount: ");
                    int withdraw=sc.nextInt();

                    if(withdraw<=balance){
                        balance-=withdraw;
                        System.out.println("Please collect cash.");
                    }
                    else{
                        System.out.println("Insufficient Balance.");
                    }

                    break;

                case 4:
                    System.out.println("thank You!");
                    break;

                default:
                    System.out.println("invalid Choice");

            }

        }while(choice!=4);

        sc.close();
    }
}