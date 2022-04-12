package com.qa;

public class BankAccount {
    private double balance;
    private double minimumBalance;

    public double getBalance() {
        return balance;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public BankAccount(double balance, double minimumBalance){
        this.balance = balance;
        this.minimumBalance = minimumBalance;
    }

    public double withdraw(double amount){
        if(balance -amount > minimumBalance){
            balance -= amount;
            return amount;
        }else{
            throw new RuntimeException();
        }
    }

    public double deposit(double amount){
        return balance += amount;
    }



    // Used later... have attendees create these



//    public double deposit(double amount){
//        used for timeout test only to mimic slow behaviour
//        try{
//            Thread.sleep(5);
//        }
//        catch(InterruptedException ex){
//            ex.printStackTrace();
//        }
//        return balance += amount;
//    }

//        public double deposit(double amount){
//            if(amount >= 0){
//                balance += amount;
//                return amount;
//            }else{
//                throw new RuntimeException();
//            }
//    }

/// used in a later demo

    private boolean isActive = true;
    private String holderName;
    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getInterestRate() {
        return interestRate;
    }

    private double interestRate = 1.5;

}
