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
public class Problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int row = input.nextInt();
        
        for(int i=0; i< row; i++){
            for(int j=0; j<row-i-1; j++){
                System.out.print(" ");
            }
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            
            System.out.println("");
        }
    }
}
