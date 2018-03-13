/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab16;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Lab16 {

    
    public static void main(String[] args) {
        int sum = 0, n;
        Scanner input = new Scanner(System.in);
        
        for(int i=0; i<10; i++){
            n = input.nextInt();
            try{
                if(n<0){
                    i--;
                    throw new Exception("Input positive Integer");
                }
                sum+=n;
                
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
            
        }
        
        System.out.println("sum is: "+ sum);
    }
    
}
