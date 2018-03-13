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

public class Problem4 {
    public static void main(String[] args) {
        int min = 1990, max = 2020;
        
        int n = (int) (min + Math.random()*(max-min+1));
        
        if(n%400==0 ||(n%4==0 && n%100!=0)){
            System.out.println(n+" :true");
        }
        else
            System.out.println(n+" :false");
    }
}
