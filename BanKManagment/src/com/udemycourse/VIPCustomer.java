package com.udemycourse;

public class VIPCustomer {

    private String Name;
    private double CreditLimit;
    private String emailaddress;

    public VIPCustomer(String name, double creditLimit, String emailaddress ){
        this.CreditLimit = creditLimit;
        this.emailaddress = emailaddress;
        this.Name = name;
    }

    public VIPCustomer(String name, String emailaddress){
        this(name, 500000, emailaddress);
    }

    public VIPCustomer(){
        this(" Default", 50000, "default");
    }

    public String getName(){
        return Name;
    }

    public double getCreditLimit() {
        return CreditLimit;
    }

    public String getEmailaddress() {
        return emailaddress;
    }
}




