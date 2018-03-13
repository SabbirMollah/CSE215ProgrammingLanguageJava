/* 
* Write a method that converts a hexadecimal integer to decimal

*/

import java.util.Scanner;
public class Problem1 {
    
    public static int hex2dec(String s) {
             int value = 0;
             int digitsValue;
             int baseMultiplier;
             s = s.toUpperCase();
             
             String hexaDigits = "0123456789ABCDEF";
             
             for(int i=(s.length()-1) ; i>=0; i--){
                digitsValue = hexaDigits.indexOf(s.charAt(i));
                baseMultiplier = (int) Math.pow(16, s.length()-(i+1) );
                value += digitsValue*baseMultiplier;
             }
             return value;
         }
    
    public static void main(String[] args) {
        while(true){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a hexadecimal integer: ");
            String s = input.next();
            System.out.println("Decimal: " + hex2dec(s));
        }
                
    }
}
