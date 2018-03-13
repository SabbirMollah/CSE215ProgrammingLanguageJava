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
public class Problem2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int index;
        int[] nums = new int[100];
        for(int i=0; i<100; i++){
            nums[i] = (int) (Math.random() * 1000);
            //System.out.println(num);
        }
        //System.out.println(nums[99]);
        //input.nextLine();
        index = input.nextInt();
        
        try{
            if(index<0 || index>99)
                throw new Exception("Index out of bound");
            else
                System.out.println(nums[index]);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        
        
    }
}
