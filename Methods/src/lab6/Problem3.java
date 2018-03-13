/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Problem3 {
    
    static double balance = 0.0;
    
    public static void deposit(double amount){
        balance +=amount;
    }
    
    public static void withdraw(double amount){
        balance-=amount;
    }
    
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int choice;
        double amount = 0;
        while(true){
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Balance");
            System.out.println("4. Exit");
            choice = input.nextInt();
            
            switch(choice){
                case 1:
                    System.out.println("How much you want to deposit?");
                    amount = input.nextDouble();
                    deposit(amount);
                    break;
                case 2:
                    System.out.println("How much you want to Withdraw?");
                    amount = input.nextDouble();
                    withdraw(amount);
                    break;
                    
                case 3:
                    System.out.println(balance);
                    break;
                    
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }
}
