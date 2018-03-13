/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        boolean isPrime = true;
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        
        for(int i = 2; i < num/2 ; i++) {
            if(num%i == 0){
                isPrime = false;
                break;
            }
        }
        
        if(isPrime) 
            System.out.println("Prime Number");
        else 
            System.out.println("Not a Prime Number");
        
        input.close();
    }
}
