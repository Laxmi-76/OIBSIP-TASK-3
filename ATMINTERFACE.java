package com.mycompany.atminterface;


public class ATMINTERFACE {

    private double balance;
    private double depositAmount;
    private double withdrawAmount;

    //default constructor
    public ATMINTERFACE() {

    }

    // getter setter
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

}
