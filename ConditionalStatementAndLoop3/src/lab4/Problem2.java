/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args) {
        int num1 = (int)(50 + Math.random() * (100-50+1));
        int num2 = (int)(50 + Math.random() * (100-50+1));
        
        System.out.println("The two randomly generated numbers are: "+num1+ " and "+num2);
        
        int smaller;
        if(num1<num2)
            smaller=num1;
        else
            smaller = num2;
        System.out.print("Their common divisors are: ");
        for(int i =1; i<smaller; i++){
            if(num1%i==0 && num2%i==0)
                System.out.print(" "+i);
        }
        System.out.println("");
    }
}
