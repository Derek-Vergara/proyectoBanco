//Creating and Manipulating an Account Object
// This program is used to test the Account class. 
//class AccountTest creates an Account object
//calls its getName and setName method 

import java.util.Scanner; //program uses class Scanner

public class AccountTest 
{

    public static void main (String[] args)
    {

        Account account1 = new Account("Rachel Green",500.00);
        Account account2 = new Account("Monica Geller",1000.00);

        System.out.printf("%s balance: $%.2f%n", 
        account1.getName(), account1.getBalance());

        System.out.printf("%s balance: $%.2f%n%n", 
        account2.getName(), account2.getBalance());

            //create Scanner to obtain input from command window
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter deposit amount for account 1: ");
        double depositAmount = sc.nextDouble();

        System.out.printf("%nadding %.2f to account1 balance%n%n",
         depositAmount);

        account1.deposit(depositAmount);

        //display balances
        System.out.printf("%s balance: $%.2f%n",
         account1.getName(), account1.getBalance());

        System.out.printf("%s balance: $%.2f%n%n", 
        account2.getName(), account2.getBalance());

        System.out.print ("Enter deposit amount for account 2: ");
        depositAmount = sc.nextDouble();
        System.out.printf(" %nadding %.2f to account2 balance%n%n",
            depositAmount);

        account2.deposit(depositAmount);

        //display balances
        System.out.printf("%s balance: $%.2f%n",
        account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n",
        account2.getName(), account2.getBalance());

        
    }//End of main method

}//End of class AccountTest
