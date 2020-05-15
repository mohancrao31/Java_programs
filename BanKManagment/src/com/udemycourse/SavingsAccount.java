package com.udemycourse;

public class SavingsAccount {

    private String name;
    private String emailid;
    private long acc_number;
    private double balance = 0;
    private long phonenumber;

    public SavingsAccount(){
        //empty constructor;
    }

    public SavingsAccount(String name, String emailid, long acc_number, long phonenumber){
        this.name = name;
        this.emailid = emailid;
        this.acc_number = acc_number;
        this.phonenumber = phonenumber;

    }
    public void setName(String name){
        this.name = name;
    }

    public void setEmailid(String emailid){
        this.emailid = emailid;
    }

    public void setAcc_number(long acc_number){
        this.acc_number = acc_number;
    }

    private void setBalance(double balance) {

        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = -1;
            System.out.println(" Invalid Balance ");
        }

    }
    public void setPhonenumber(long phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getName(){
        return name;

    }

    public String getEmailid(){
        return emailid;
    }

    public long getAcc_number() {
        return acc_number;
    }


    public long getPhonenumber() {
        return phonenumber;
    }

    public double getBalance() {
        return balance;
    }

    public void depositbalance(double addamount){
        double newbalance = addamount + this.getBalance();
        this.setBalance(newbalance);
        System.out.println(" the new available balance for " + this.getName() + " is = " + this.getBalance());
    }

    public void withdrawfunds(double withdrawamount){
        if (withdrawamount <= this.getBalance()){
            this.setBalance(this.getBalance()-withdrawamount);
        } else {
            System.out.println("Insufficient funds for withdrawal");
        }
    }
}
