/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class LearnArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr;
        int num, total =0, moreThanAverage = 0;
        double average;
        arr = new int[6];
        for(int i=0; i<6; i++){
            num = input.nextInt();
            total += num;      
        }
        average = total / 6;
        
        for(int i=0; i<6; i++){
            if(average> arr[i])
                moreThanAverage++;
        }
        
        System.out.println("Percentage is: " + (average *(100)/6) +"%");
     
    }
}
