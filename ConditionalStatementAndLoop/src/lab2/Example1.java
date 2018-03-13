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
public class Example1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter age: ");
        int a = input.nextInt();
        input.nextLine();
        System.out.println("Enter name: ");
        String b = input.nextLine();
        System.out.println(a + " " + b);
                
        input.close();
    }
}
