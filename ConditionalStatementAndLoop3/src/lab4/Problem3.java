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
public class Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num = input.nextInt();
        int sum = 0;
        
        for(int i=1; i<num; i++){
            if(num%i==0)
                sum+=i;
        }
        
        if(num==sum)
            System.out.println(num+" is a perfect number");
        else
            System.out.println(num+" is not perfect number");
    }
}
