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
public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num = input.nextInt();
        
        switch(num%2) {
            case 0:
                System.out.println("The number is even.");
                break;
            case 1:
                System.out.println("The number is odd");
        }
    }
}
