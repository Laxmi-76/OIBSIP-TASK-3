package com.mycompany.atminterface;


public interface AtmOperationInterface {
    public void viewBalance();
    public void depositAmount(double depositAmount);
    public void withdrawAmount(double withdrawAmount);
    public void viewMiniStatement();
    
}
