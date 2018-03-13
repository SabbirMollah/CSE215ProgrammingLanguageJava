/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author USER
 */import java.util.Scanner;
public class Problem2 {
    
    public static boolean isPalindrome(String str){
        for(int i=0, j=str.length()-1 ; i<=str.length()/2;i++,j--){
            if(str.charAt(i)!=str.charAt(j))
                return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();

        if(isPalindrome(str))
            System.out.println(str +" is a Palindrome!");  
        else
            System.out.println(str +" is not a Palindrome!");  
    }
 
}
