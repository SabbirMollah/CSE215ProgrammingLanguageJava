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

public class Problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        
        System.out.println("Enter size: ");
        size = input.nextInt();
        
        int[] arr = new int[size];
        System.out.println("Enter numbers: ");
        for(int i=0; i<size; i++){
            arr[i] = input.nextInt();
        }
        for(int i=0; i<size-2; i++){
            if(arr[i]==arr[i+1] && arr[i]==arr[i+2]){
                System.out.println(arr[i]);
                i = i+3;
            }
                
        }
        
    }
}
