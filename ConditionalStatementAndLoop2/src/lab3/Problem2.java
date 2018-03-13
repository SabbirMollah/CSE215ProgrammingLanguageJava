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
public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        for(int i=0; i<n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
}
