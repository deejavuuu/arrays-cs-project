package samplearrays;

public class BankAccount {

    String name;
    double currentBalance;
    //TO-DO: Initialize an Array with 1000 in size that stores Double called 'transactions' to keep track of the user's transactions
    double[] transactions = new double[1000];
    int index = 0;

    public BankAccount(String name, int startingBalance){
        this.name = name;
        this.currentBalance = startingBalance;
    }

    public void deposit(double amount){
        if(amount > 0){
            this.currentBalance += amount;
            this.transactions[this.index] = amount;
            this.index ++;
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= this.currentBalance){
            this.currentBalance -= amount;
            this.transactions[this.index] = -amount;
            this.index ++;
        }
    }

    public void displayTransactions(){
        for(double i:this.transactions){
            if(i>0){
                System.out.println("Deposit : "+i+" DH");
            }
            else if(i<0){
                System.out.println("Withdrawal : "+i+" DH");
            }
        }
    }

    public void displayBalance(){
        System.out.println("Current Balance : "+this.currentBalance + " DH");
    }

    public static void main(String[] args) {

        BankAccount john = new BankAccount("John Doe", 100);

        // ----- DO NOT CHANGE -----

        //Testing..
        john.displayBalance();
        john.deposit(0.25);
        john.withdraw(100.50);
        john.withdraw(40.90);
        john.deposit(-90.55);
        john.deposit(3000);
        john.displayTransactions();
        john.displayBalance();

        // ----- DO NOT CHANGE -----

    }

}
