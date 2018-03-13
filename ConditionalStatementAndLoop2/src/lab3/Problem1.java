/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        
        int min = 5, max = 20;
        Scanner input = new Scanner(System.in);
        int n = (int) (min + Math.random()*(max-min+1));
        
        System.out.println("Random number: "+n);
        for(int i=0; i<=n; i++){
            System.out.print(i +" ");
        }
    }
}
