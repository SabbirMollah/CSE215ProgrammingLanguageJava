/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        
        if(num%2==0)
            System.out.println("Even!");
        else
            System.out.println("Odd!");
    }
}
