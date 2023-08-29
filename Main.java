package com.mycompany.atminterface;


import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        AtmOperationInterface op = new  AtmOperationImplementation();
        int atmnumber = 12345;
        int atmpin = 12;
        System.out.println("WELCOME TO ATM MACHINE !!");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ATM Number: ");
        int atmNumber = sc.nextInt();
        
        System.out.println("Enter ATM pin: ");
        int atmPin = sc.nextInt();
        if ((atmnumber == atmNumber)&&(atmpin == atmPin)){
           while(true){
               System.out.println(" 1.View Balance\n 2.Deposit Amount\n 3.Withdraw Amount\n 4.View Statement\n 5.Exit");
               System.out.println("Enter Your Choice : ");
               int ch = sc.nextInt();
               if(ch==1){
                   op.viewBalance();
               }
               else if (ch==2){
                   System.out.println("Enter Amount to Deposit :");
                    double depositAmount = sc.nextDouble();
                    op.depositAmount(depositAmount);
                    
               }
               else if (ch==3){
                    System.out.println("Enter Amount to withdraw ");
                    double withdrawAmount = sc.nextDouble();
                    op.withdrawAmount(withdrawAmount);
               }
               else if (ch==4){
                   op.viewMiniStatement();
               }
               else if (ch==5){
                   System.out.println("Collect Your ATM Card\n Thank You");
                    System.exit(0);
               }
               else{
                    System.out.println("Please enter correct choice.");
               }
           }  
        }
        else{
             System.out.println("Incorrect ATM number and PIN");
             System.exit(0);
        }
    }
    
}
