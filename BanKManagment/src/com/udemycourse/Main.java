package com.udemycourse;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        // write your code here
//        SavingsAccount Acc_Mohan = new SavingsAccount("Mohan Chandru Roa", "mohancrao31@gmail.com",711584196L,9971864349L);
//        SavingsAccount Acc_Shalu = new SavingsAccount("Shalu Singh","shalsing86@gmail.com",711584197,8178138264L);
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(" How much do you want to deposit ");
//        boolean isDouble = scanner.hasNextDouble();
//
//        if (isDouble) {
//            Acc_Mohan.depositbalance(scanner.nextDouble());
//        } else {
//            System.out.println("Invalid Input ");
//        }
//        scanner.nextLine();
//
//
//        System.out.println(" How Much do you want to deposit" + Acc_Shalu.getName());
//        isDouble = scanner.hasNextDouble();
//        if (isDouble) {
//            Acc_Shalu.depositbalance(scanner.nextDouble());
//            scanner.nextLine();
//
//        } else {
//            System.out.println("Invalid Input ");
//        }
//        scanner.nextLine();
//
//
//        System.out.println(" How Much do you want to withdraw" + Acc_Shalu.getName());
//        isDouble = scanner.hasNextDouble();
//        if (isDouble) {
//            Acc_Shalu.withdrawfunds(scanner.nextDouble());
//            scanner.nextLine();
//
//        } else {
//            System.out.println("Invalid Input ");
//        }
//        scanner.nextLine();
//
//        System.out.println(" How Much do you want to withdraw" + Acc_Mohan.getName());
//        isDouble = scanner.hasNextDouble();
//        if (isDouble) {
//            Acc_Mohan.withdrawfunds(scanner.nextDouble());
//            scanner.nextLine();
//
//        } else {
//            System.out.println("Invalid Input ");
//        }
//        scanner.nextLine();
//
//        scanner.close();
//
//        System.out.println(" the balance at end of day are /n + " + Acc_Mohan.getName() + " : " + Acc_Mohan.getBalance());
//        System.out.println(" the balance at end of day are /n + " + Acc_Shalu.getName() + " : " + Acc_Shalu.getBalance());

        VIPCustomer Customer_mohan = new VIPCustomer("Mohan Chandru Rao", "mohancrao31@gmail.com");
        VIPCustomer Customer_Anand = new VIPCustomer("Anand",100000, "neo@gmail.com");
        VIPCustomer Customer_Shalu = new VIPCustomer();

        System.out.println(Customer_Anand.getName()+" " +Customer_Anand.getCreditLimit());
        System.out.println(Customer_mohan.getName()+ " " +Customer_mohan.getCreditLimit());
        System.out.println(Customer_Shalu.getName() + " " +Customer_Shalu.getCreditLimit());

    }
}
