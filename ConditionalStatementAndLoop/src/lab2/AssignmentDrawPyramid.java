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
public class AssignmentDrawPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
         int n = input.nextInt();
    
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            for(int j=0; j<(i+1)*2-1; j++){
                System.out.print("*");
            }     
            System.out.println("");
        }
        
    }
    

}
