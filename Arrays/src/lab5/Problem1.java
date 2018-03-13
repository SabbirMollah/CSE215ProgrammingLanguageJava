/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr;
        int num, total =0, moreThanAverage = 0;
        double average;
        arr = new int[6];
        for(int i=0; i<6; i++){
            num = input.nextInt();
            arr[i] = num;
            total += num;      
        }
        System.out.println(total);
        average = (double)total / 6;
        //System.out.println(average);
        
     
        for(int i=0; i<6; i++){
            if(arr[i]>average)
                moreThanAverage++;
        }
        System.out.println(moreThanAverage);
        
        System.out.println("Percentage is: " + ((moreThanAverage *100)/6) +"%");
    }
}
