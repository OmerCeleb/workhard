package Accountsinif;

public class Account {

    Account(){

    }
    static int accountNumber;
    static int balance = 0;
    static int maxWithdraw = 0;

    public static int accountNumber (int accountNumber){

        if(accountNumber<100 && accountNumber >1){
            System.out.println("Your account number is :" + accountNumber);
        }else {
            System.out.println("Please enter an account number between 1 and 100");
        }

        return accountNumber;
    }
    public static int deposit(int incomes){

        balance = incomes + balance;
        System.out.println("Your money added your account" + "\n New amount of money in your account " + balance + "$");
        return balance;

    }

    public static int withdraws(int expenses){
        maxWithdraw = expenses + maxWithdraw;
        if (maxWithdraw < 5000){
            balance= balance - expenses;
            System.out.println("Your money has been withdraw from your account" + "\n New amount of money in your account " + balance + "$");
        }else {
            System.out.println("You cannot withdraw more than $5000!");
        }

        return balance;

    }

}
