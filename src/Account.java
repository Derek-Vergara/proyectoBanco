//Account class that contains instance variable 
// and methods to set and get its value 

public class Account {

    private String name; //instance variable
    private double balance; //instance variable

    //constructor initializes name and balance with parameters
    public Account (String name, double balance)
    {
        this.name = name; //assign name to instance variable name
        //validate that the balance is greater than 0.0; if it's not,
        //instance variable balance keeps its default initial value of 0.0
        if (balance > 0.0) //if the balance is valid
            this.balance = balance; //assign it to instance variable balance

    }//End ofconstructor

    //method to set the name in the object 
    public void setName (String name)
    {
        this.name = name; //store the name 
    }// end of setName

    public String getName ()
    {
        return name; //return value of name to caller
    }
        //method to set the balance in the object
    public void deposit(double depositAmount)
    {
        if (depositAmount > 0.0) //if the depositAmount is valid
            balance = balance + depositAmount; //add it to the balance 
    }

    public double getBalance()
    {
        return balance; //return value of balance to caller
    }

}//End of class Account
