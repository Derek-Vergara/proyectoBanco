//Creating and Manipulating an Account Object
// This program is used to test the Account class. 
//class AccountTest creates an Account object
//calls its getName and setName method 


import java.util.Scanner; // program uses Scanner

public class AccountTest {

    public static void main (String[] args){

        //create an Scanner object to obtain input from command window
        Scanner sc = new Scanner (System.in);

        //create an Account object and assign it to myAccount
        Account myAccount = new Account();

        //display initial value of name (null)
        System.out.printf("Initial name is: %s%n%n", myAccount.getName());

        //prompt for and read name
        System.out.println("Please enter the name: ");
        String theName = sc.nextLine(); //read a line of text
        myAccount.setName(theName); //put theName in myAccount
        System.out.println();

        //display the name stored in myAccount
        System.out.printf("Name in object myAccount is: %n%s%n", myAccount.getName());
        
    
    }//End of main method

}//End of class AccountTest
