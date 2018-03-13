/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Lab6 {

    /**
     * @param args the command line arguments
     */
    
    public static int countVowel(String str){
        int count = 0;
        
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' )
                count++;
        }
        return count;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        String str = input.next();
        
        System.out.println(countVowel(str));
    }
    
}
