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
public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isVowel = false;
        System.out.println("Enter a character: ");
        char ch = input.next().charAt(0);
        
        switch(ch){
            case 'A':
                isVowel = true;
                break;
            case 'E':
                isVowel = true;
                break;
            case 'I':
                isVowel = true;
                break;
            case 'O':
                isVowel = true;
                break;
            case 'U':
                isVowel = true;
                break;
            case 'a':
                isVowel = true;
                break;
            case 'e':
                isVowel = true;
                break;
            case 'i':
                isVowel = true;
                break;
            case 'o':
                isVowel = true;
                break;
            case 'u':
                isVowel = true;
                break;
        }
        
        if(isVowel)
            System.out.println("The character "+ ch +" is a vowel.");
        else
            System.out.println("The character "+ ch +" is a consonant.");
        
    }
}
