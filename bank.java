import java.util.Locale;
import java.util.Scanner;

public class bank {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        // firsts steps to create the account. 
       
        account account;
        System.out.print("ENTER ACCONT NUMBER: ");
        int number = sc.nextInt();
        System.out.print("ENTER THE ACCOUNT HOLDER: ");
        String name = sc.next();
        System.out.print("IS THERE AN INITIAL DEPOSIT? (y/n) ");
        char answear = sc.next().charAt(0);
        if ( answear == 'y'){
            System.out.println("ENTER THE INITIAL DEPOSIT: ");
            double initialDeposit = sc.nextDouble();
            account = new account(number, name, initialDeposit);
        }
        else {
            account = new account(number, name);
        }
        
        // both deposit and withdraw operations.

        System.out.println("ACCOUNT DATA:");
        System.out.println(account);
        System.out.println("ENTER A DEPOSITE VALUE:");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("UPDATED ACCOUNT DATA:");
        System.out.println(account);
        System.out.println();

        System.out.println("DO YOU WANT TO MAKE A WITHDRAW?");
        answear = sc.next().charAt(0);
        if (answear == 'y'){
            System.out.println("ENTER THE AMOUNT TO WITHDRAW:");
            double withdrawValue = sc.nextDouble();
            account.withdraw(withdrawValue);
            System.out.println("UPDATED ACCOUNT DATA");
            System.out.println(account);
        }
        else {
            System.out.println("THANK YOU FOR USING OUR BANK!");
        }




        sc.close();
    }
}
