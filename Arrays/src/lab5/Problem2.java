/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author USER
 */


// DO it with array

import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int first = 0, second =1;
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.print("First " + num+" Fibonacci numbers: ");
        System.out.print(first + " "+ second + " ");
        for(int i=2; i<num; i++){
            System.out.print(" "+ (first + second));
            int temp = first;
            first = second;
            second = temp + second;
        }
        System.out.println("");
    }
}
