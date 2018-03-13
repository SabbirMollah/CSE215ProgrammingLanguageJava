/*
* Write a method that converts an amount of currency in words

*/


import java.util.Scanner;

public class CurrencyInWords {


    public static String amountInWords(int n){
        String str = "";

        String[] units = {"ONE", "TWO", "THREE", "FOUR" , "FIVE", "SIX",
                             "SEVEN", "EIGHT", "NINE"};

        String[] afterTen = {"TEN", "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN" , "FIFTEEN", "SIXTEEN",
                             "SEVENTEEN", "EIGHTEEN", "NINETEEN"};

        String[] tens = {"TWENTY", "THIRTY", "FOURTY" , "FIFTY", "SIXTY",
                             "SEVENTY", "EIGHTY", "NINETY"};

        //4th digit
        if( (n/1000)%10 != 0){
            str += units[(n/1000)-1] + " "+ "THOUSAND ";
        }

        //3rd digit
        if( (n/100)%10!=0 ){
            str += units[ ((n/100)%10)-1] + " "+ "HUNDRED ";
        }

        //Last two digits
        if(n%100!=0){
            if( (n%100)<10 ){
            str += units[(n%10)-1];
            }
            else if(n%100>=10 && n%100<20){
                str += afterTen[(n%20)-10];
            }
            else if(n%100>=20){
                if(n%10==0){
                    str += tens[((n%100)/10)-2];
                }
                else{
                    str += tens[((n%100)/10)-2] + " ";
                    str += units[(n%10)-1];
                }
            }
        }


        return str;
    }


    public static void main(String[] args) {
        while(true){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter amount:");
            int n = input.nextInt();
            if(n>=10000){
                System.out.println("The number must be less than 10,000");
                System.exit(1);
            }
            System.out.println(amountInWords(n));
        }


    }
}
